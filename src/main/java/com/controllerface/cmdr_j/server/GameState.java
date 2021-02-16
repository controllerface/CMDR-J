package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.JSONSupport;
import com.controllerface.cmdr_j.classes.PledgedPower;
import com.controllerface.cmdr_j.classes.RouteEntry;
import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.classes.StellarBody;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.classes.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.database.EntityKeys;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ShipStatisticData;
import com.controllerface.cmdr_j.database.EntityUtilities;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalCategory;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationCategory;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisCategory;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyCategory;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.enums.equipment.modules.ModulePurchaseType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipType;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import jetbrains.exodus.entitystore.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class GameState
{
    private final Lock stateLock = new ReentrantLock(true);

    private static final String DATABASE_DIRECTORY = "/db";

    /**
     * This object holds the persistent data related to this commander
     */
    private final PersistentEntityStore database;


    /**
     * This is an event sink used when state changes must be communicated to listening clients
     */
    private final BiConsumer<String, String> globalUpdate;

    /**
     * The task catalog is built at construction time, as the buildTaskCatalog() method
     * is called, but the return value is actually the raw JSON representation of that
     * catalog. This is done for efficiency as the catalog itself is quite large and
     * may be requested multiple times, so serializing it more than once is just wasteful.
     */
    private final TaskCatalog taskCatalog = new TaskCatalog();
    private final String rawCatalogJson = buildTaskCatalog();

    private final Map<Statistic, String> commanderStatistics = new HashMap<>();
    private final Map<Statistic, String> shipStatistics = new HashMap<>();
    private final Map<Statistic, ShipModuleData> shipModules = new HashMap<>();
    private final Map<String, Map<String, String>> extendedStats = new HashMap<>();
    private final Map<Material, Integer> materials = new HashMap<>();
    private final Map<Commodity, CommodityData> cargo = new HashMap<>();
    private final Map<String, Object> marketData = new HashMap<>();
    private final Map<Engineer, Map<String, Object>> engineerProgress = new HashMap<>();
    private final List<RouteEntry> currentRoute = new ArrayList<>();
    private final List<Map<String, Object>> systemFactions = new ArrayList<>();
    private final List<Map<String, Object>> localConflicts = new ArrayList<>();
    private final AtomicReference<String> trackedLocation = new AtomicReference<>("");

    private String commanderName = "";
    private long creditBalance = 0;
    private double currentFuel = 0;
    private int cargoCapacity = 0;

    private ShipType shipType;
    private StarSystem starSystem;
    private StellarBody nearestBody;
    private PledgedPower pledgedPower;

    private double touchdownLatitude = -1;
    private double touchdownLongitude = -1;

    private LocalCoordinates localCoordinates;
    private SettlementLocation localSettlement;

    /**
     * Filter function for numeric effect values that allows only non-zero values.
     */
    private static final Predicate<Double> nonZeroValue = (x) -> Objects.requireNonNull(x) != 0.0d;

    /**
     * Filter function used when streaming modules to filter out only weapons. Used when
     * calculating power usage when hardpoints are retracted.
     */
    private static final Predicate<Statistic> nonWeaponSlots = (slot) ->
    {
        if (slot instanceof HardpointSlot)
        {
            return slot.getText().contains("Utility");
        }
        else return true;
    };

    /**
     * Filter function used when streaming modules to filter in only weapons. Note that
     * utility mounts like point defense turrets are specifically filtered out since this
     * is used to calculate overall DPS and such modules are not included because they
     * only target missiles and other small munitions.
     */
    private static final Predicate<Statistic> nonUtilityHardpoints = (slot) ->
    {
        if (slot instanceof HardpointSlot)
        {
            return !slot.getText().contains("Utility");
        }
        else return false;
    };

    /**
     * Comparator used to order modules by their power consumption, from highest usage to lowest.
     */
    private static final Comparator<Map.Entry<Statistic, ShipModuleData>> highestDraw =
        Comparator.comparingDouble((Map.Entry<Statistic, ShipModuleData> e) -> e.getValue().effectByName(ItemEffect.PowerDraw)
            .map(ef->ef.doubleValue).orElse(0.0d))
            .reversed();

    /**
     * Comparator used to sort local factions by their influence within the star system, from most to least influence.
     */
    private static final Comparator<Map<String, Object>> highestInfluence =
        Comparator.comparingDouble((Map<String, Object> f) -> (Double) f.get("Influence"))
            .reversed();

    private static class GPSLocation
    {
        private final double latitude;
        private final double longitude;

        private GPSLocation(double latitude, double longitude)
        {
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    private static class CommodityData
    {
        final String name;
        final Integer count;
        final ItemGrade grade;

        private CommodityData(String name, Integer count, ItemGrade grade)
        {
            this.name = name;
            this.count = count;
            this.grade = grade;
        }

        private CommodityData adjustAndClone(Integer adjustment)
        {
            return new CommodityData(name, count + adjustment, grade);
        }

        String toJson()
        {
            Map<String, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("count", count);
            data.put("type", grade.name().toLowerCase());
            return JSONSupport.Write.jsonToString.apply(data);
        }
    }

    private static class TaskData
    {
        public final String name;
        public final String ship;
        public final Integer rank;
        public final List<Map<String, Object>> effects;
        public final List<Map<String, Object>> costs;

        private TaskData(String name,
                         String ship,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs)
        {
            this.name = name;
            this.ship = ship;
            this.rank = rank;
            this.effects = effects;
            this.costs = costs;
        }

        private TaskData(String name,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs)
        {
            this(name, "", rank, effects, costs);
        }

        private TaskData(String name, Integer rank)
        {
            this(name, "", rank, Collections.emptyList(), Collections.emptyList());
        }
    }

    private static class TaskSummary
    {
        private final String key;
        private final int count;

        private TaskSummary(String key, int count)
        {
            this.key = key;
            this.count = count;
        }
    }

    private static class DamageBreakdown
    {
        final double thermalShare;
        final double kineticShare;
        final double explosiveShare;
        final double absoluteShare;

        private DamageBreakdown(double thermalShare, double kineticShare, double explosiveShare, double absoluteShare)
        {
            this.thermalShare = thermalShare;
            this.kineticShare = kineticShare;
            this.explosiveShare = explosiveShare;
            this.absoluteShare = absoluteShare;
        }
    }

    private static class RelatedTask
    {
        public final String name;
        public final int count;
        public final boolean isTrade;

        private RelatedTask(String name, int count, boolean isTrade)
        {
            this.name = name;
            this.count = count;
            this.isTrade = isTrade;
        }

        private Map<String, Object> toMap()
        {
            var map = new HashMap<String, Object>();
            map.put("name", name);
            map.put("count", count);
            return map;
        }
    }

    private static class RunningCostData
    {
        private final Set<RelatedTask> relatedTasks = new HashSet<>();
        private final AtomicLong runningCount = new AtomicLong(0);
    }

    public GameState(BiConsumer<String, String> globalUpdate)
    {
        this.globalUpdate = globalUpdate;

        this.database = PersistentEntityStores
            .newInstance(UIFunctions.DATA_FOLDER + DATABASE_DIRECTORY);

        // DEBUG SECTION
//        database.executeInTransaction(txn ->
//        {
//            EntityUtilities.entityStream(txn.getAll(EntityKeys.STELLAR_BODY))
//                .filter(body->
//                {
//                    var c = ((String) body.getProperty("PlanetClass"));
//                    if (c == null) return false;
//                    return c.contains("Water")
//                        || c.contains("Ammonia")
//                        || c.contains("Earth");
//                })
//                .forEach(body->
//                {
//                    var c = body.getProperty("PlanetClass");
//                    var system = body.getLink(EntityKeys.STAR_SYSTEM);
//                    if (system != null)
//                    {
//                        var s = system.getProperty(EntityKeys.STAR_SYSTEM);
//                        var n = body.getProperty(EntityKeys.STELLAR_BODY_NAME);
//                        System.out.println(c + " = " + s + " : " + n);
//                    }
//                });
//        });
//
//        System.out.println("---------------------");
//
//        database.executeInTransaction(txn ->
//        {
//            EntityUtilities.entityStream(txn.getAll(EntityKeys.STELLAR_BODY))
//                .filter(body->
//                {
//                    var c = ((String) body.getProperty("StarType"));
//                    return c != null;
//                })
//                .forEach(body->
//                {
//                    var c = ((String) body.getProperty("StarType"));
//                    var system = body.getLink(EntityKeys.STAR_SYSTEM);
//                    if (system != null)
//                    {
//                        var s = system.getProperty(EntityKeys.STAR_SYSTEM);
//                        var n = body.getProperty(EntityKeys.STELLAR_BODY_NAME);
//                        System.out.println(c + " = " + s + " : " + n);
//                    }
//                });
//        });

    }

    GameState(String dbDirectory)
    {
        this.globalUpdate = (a, b) ->
            System.out.println("event: " + a + " data: " + b);

        this.database = PersistentEntityStores
            .newInstance(UIFunctions.DATA_FOLDER + dbDirectory);
    }

    private void executeWithLock(Procedure procedure)
    {
        stateLock.lock();
        try
        {
            procedure.call();
        }
        finally
        {
            stateLock.unlock();
        }
    }

    public void updateMissionState(MissionData.MissionState state, long missionId)
    {
        database.executeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return;
            EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .filter(entity -> Objects.equals(entity.getProperty("missionID"), missionId))
                .findFirst()
                .ifPresent(mission -> mission.setProperty("state", state.name().toLowerCase()));
        });
    }

    public void completeMission(long missionID)
    {
        database.executeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return;

            EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .filter(entity -> Objects.equals(entity.getProperty("missionID"), missionID))
                .findFirst().ifPresent(mission ->
                {
                    commander.deleteLink(EntityKeys.MISSION, mission);
                    mission.delete();
                });
        });
        executeWithLock(() -> emitMissionData(globalUpdate));
    }

    public void acceptMission(MissionData missionData)
    {
        database.executeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return;

            var mission = EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .filter(entity -> Objects.equals(entity.getProperty("missionID"), missionData.missionID))
                .findFirst().orElseGet(() ->
                {
                    var newMission = txn.newEntity(EntityKeys.MISSION);
                    commander.addLink(EntityKeys.MISSION, newMission);
                    newMission.setLink(EntityKeys.COMMANDER, commander);
                    return newMission;
                });

            missionData.storeMissionData(mission);
        });
        executeWithLock(() -> emitMissionData(globalUpdate));
    }

    private void emitPledgedPower(BiConsumer<String, String> sink)
    {
        if (pledgedPower == null) return;
        var json = JSONSupport.Write.jsonToString.apply(pledgedPower.toMap());
        sink.accept("PowerPlay", json);
    }

    public void setPledgedPower(PledgedPower pledgedPower)
    {
        this.pledgedPower = pledgedPower;
        executeWithLock(() -> emitPledgedPower(globalUpdate));
    }

    public void joinPower(String newPower)
    {
        this.pledgedPower = new PledgedPower(newPower, 0, 0, 0, 1);
        executeWithLock(() -> emitPledgedPower(globalUpdate));
    }

    public void leavePower()
    {
        this.pledgedPower = null;
        executeWithLock(()-> globalUpdate.accept("PowerPlay", "clear"));
    }

    public void clearCargo()
    {
        cargo.clear();
        executeWithLock(() -> globalUpdate.accept("Cargo","Clear"));
    }

    public void clearShipModules()
    {
        shipModules.clear();
    }

    public void setCurrentRoute(List<RouteEntry> route)
    {
        currentRoute.clear();
        currentRoute.addAll(route);
        var routeData = prepareNavRouteData();
        executeWithLock(() -> globalUpdate.accept("Route", routeData));
    }

    public void setLocation(StarSystem starSystem)
    {
        this.starSystem = starSystem;

        engineerProgress.forEach((engineer, data) ->
            data.put("distance", engineer.getLocation().distanceBetween(this.starSystem)));

        discoverLocation(this.starSystem);

        if (!currentRoute.isEmpty())
        {
            var navData = prepareNavRouteData();
            executeWithLock(() -> globalUpdate.accept("Route", navData));
        }

        executeWithLock(() -> globalUpdate.accept("Location", this.starSystem.systemName));

        emitSystemCatalog();
        emitEngineerData();
    }

    public void approachBody(StellarBody stellarBody)
    {
        nearestBody = stellarBody;
        String bodyData = JSONSupport.Write.jsonToString.apply(nearestBody.toMap());
        executeWithLock(() -> globalUpdate.accept("ApproachBody", bodyData));
        emitWaypointData(globalUpdate);
    }

    public void leaveBody()
    {
        nearestBody = null;
        localSettlement = null;
        touchdownLatitude = -1;
        touchdownLongitude = -1;
        executeWithLock(() -> globalUpdate.accept("LeaveBody", "leave"));
    }

    public void touchDown(double touchdownLatitude, double touchdownLongitude)
    {
        this.touchdownLatitude = touchdownLatitude;
        this.touchdownLongitude = touchdownLongitude;
        emitTouchdownData(globalUpdate);
    }

    public void liftoff()
    {
        this.touchdownLatitude = -1;
        this.touchdownLongitude = -1;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    public int getCurrentTonnage()
    {
        return cargo.values().stream()
            .mapToInt(c->c.count)
            .sum();
    }

    public boolean createWaypoint()
    {
        if (localCoordinates == null || nearestBody == null)
        {
            return false;
        }
        var created = database.computeInTransaction(txn ->
        {
            var currentSystem = getStarSystemEntity(txn, starSystem.address);
            if (currentSystem == null) return false;

            var currentBody = EntityUtilities.entityStream(currentSystem.getLinks(EntityKeys.STELLAR_BODY))
                .filter(body -> body.getProperty(EntityKeys.STELLAR_BODY_ID).equals(nearestBody.id))
                .findFirst().orElse(null);

            if (currentBody == null) return false;

            var newWaypoint = txn.newEntity(EntityKeys.WAYPOINT);
            newWaypoint.setLink(EntityKeys.STELLAR_BODY, currentBody);
            currentBody.addLink(EntityKeys.WAYPOINT, newWaypoint);
            var name = "Waypoint-"+ System.currentTimeMillis();
            newWaypoint.setProperty(EntityKeys.WAYPOINT_NAME, name);
            newWaypoint.setProperty(EntityKeys.WAYPOINT_LATITUDE, localCoordinates.latitude);
            newWaypoint.setProperty(EntityKeys.WAYPOINT_LONGITUDE, localCoordinates.longitude);
            return true;
        });

        if (created)
        {
            emitWaypointData(globalUpdate);
        }

        return created;
    }

    public boolean renameWaypoint(String waypointId, String newName)
    {
        if (waypointId == null || newName == null) return false;

        var renamed = database.computeInTransaction(txn ->
        {
            String[] parts = waypointId.split("-");
            var type = Integer.parseInt(parts[0]);
            var local = Long.parseLong(parts[1]);
            var entityId = new PersistentEntityId(type, local);
            var toRename = txn.getEntity(entityId);
            toRename.setProperty(EntityKeys.WAYPOINT_NAME, newName);

            var waypointMap = new HashMap<String, Object>();
            var waypointLatitude = ((Double) toRename.getProperty(EntityKeys.WAYPOINT_LATITUDE));
            var waypointLongitude = ((Double) toRename.getProperty(EntityKeys.WAYPOINT_LONGITUDE));

            if (waypointLatitude == null || waypointLongitude == null) return null;

            waypointMap.put("waypointId", toRename.getId().toString());
            waypointMap.put("name", toRename.getProperty(EntityKeys.WAYPOINT_NAME));
            waypointMap.put("latitude", waypointLatitude);
            waypointMap.put("longitude", waypointLongitude);

            var dist = calculateDistance(waypointLongitude, waypointLatitude);
            var unit = dist < 1000
                ? "m"
                : "km";
            if (unit.equals("km"))
            {
                dist = UIFunctions.Data.round(dist / 1000d, 1);
            }
            waypointMap.put("distance", dist);
            waypointMap.put("unit", unit);

            return waypointMap;
        });

        if (renamed != null)
        {
            String waypointJson = JSONSupport.Write.jsonToString.apply(renamed);
            executeWithLock(() -> globalUpdate.accept("Waypoint", waypointJson));
        }

        return renamed != null;
    }

    public boolean deleteWaypoint(String waypointId)
    {
        if (localCoordinates == null || nearestBody == null)
        {
            return false;
        }
        var removed = database.computeInTransaction(txn ->
        {
            String[] parts = waypointId.split("-");
            var type = Integer.parseInt(parts[0]);
            var local = Long.parseLong(parts[1]);
            var entityId = new PersistentEntityId(type, local);
            var toRemove = txn.getEntity(entityId);
            var linkedBody = toRemove.getLink(EntityKeys.STELLAR_BODY);
            if (linkedBody == null) return false;
            linkedBody.deleteLink(EntityKeys.WAYPOINT, toRemove);
            return toRemove.delete();
        });

        if (removed)
        {
            var removeData = new HashMap<String, Object>();
            removeData.put("remove", true);
            removeData.put("waypointId", waypointId);
            String waypointJson = JSONSupport.Write.jsonToString.apply(removeData);
            executeWithLock(() -> globalUpdate.accept("Waypoint", waypointJson));
        }

        return removed;
    }

    public void discoverLocation(StarSystem starSystem)
    {
        database.executeInTransaction((transaction)->
        {
            var systemEntity = getOrCreateStarSystemEntity(transaction, starSystem);
            if (systemEntity == null)
            {
                System.err.println("Could not create system entity");
            }
        });
    }

    public void setCommanderStat(Statistic statistic, String value)
    {
        executeWithLock(() ->
        {
            commanderStatistics.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
            updateInternalState(statistic, value);
        });
    }

    public void setMarketData(Map<String, Object> marketData)
    {
        this.marketData.clear();
        this.marketData.putAll(marketData);
    }

    private final List<Map<String, Object>> communityGoals = new ArrayList<>();

    private void emitCommunityGoals(BiConsumer<String, String> sink)
    {
        sink.accept("CommunityGoal", "clear");
        communityGoals.forEach(goal->
        {
            var json = JSONSupport.Write.jsonToString.apply(goal);
            sink.accept("CommunityGoal", json);
        });
    }

    public void setCommunityGoals(List<Map<String, Object>> communityGoals)
    {
        this.communityGoals.clear();
        this.communityGoals.addAll(communityGoals);
        executeWithLock(() -> emitCommunityGoals(globalUpdate));
    }

    public void setExtendedStats(String category, Map<String, String> stats)
    {
        extendedStats.put(category, stats);
    }

    public void adjustCargoCount(Commodity commodity, Integer adjustment)
    {
        var commodityData = cargo.computeIfPresent(commodity,
            (k, data) -> data.adjustAndClone(adjustment));

        if (commodityData == null)
        {
            if (adjustment > 0)
            {
                commodityData = new CommodityData(commodity.getLocalizedName(), adjustment, commodity.getGrade());
            }
            else
            {
                // most likely case for this is restarting the app, the cargo file is updated as
                // cargo changes, so re-running teh events will read the current state, not whatever
                // state was seen when the event occurred.
                return;
            }
        }

        var jsonData = commodityData.toJson();

        if (commodityData.count < 1)
        {
            cargo.remove(commodity);
        }

        executeWithLock(() -> globalUpdate.accept("Cargo", jsonData));
        emitAllTaskData(globalUpdate);
    }

    public void setCargoCount(Commodity commodity, String name, Integer count)
    {
        var commodityData = new CommodityData(name, count, commodity.getGrade());
        cargo.put(commodity, commodityData);
        var jsonData = commodityData.toJson();
        executeWithLock(() -> globalUpdate.accept("Cargo", jsonData));
        emitAllTaskData(globalUpdate);
    }

    public void setEngineerProgress(Engineer engineer, Map<String, Object> data)
    {
        if (starSystem != null)
        {
            data.put("distance", engineer.getLocation().distanceBetween(starSystem));
        }
        engineerProgress.put(engineer, data);
    }

    public void adjustMaterialCount(Material material, Integer count)
    {
        var currentCount = materials.computeIfPresent(material, (k, c) -> c + count);
        if (currentCount == null)
        {
            if (count > 0)
            {
                materials.put(material, count);
                currentCount = count;
            }
            else return;
        }
        var newCount = currentCount;
        executeWithLock(() -> globalUpdate.accept("Material", writeMaterialEvent(material, newCount)));
        emitAllTaskData(globalUpdate);
    }

    public void setMaterialCount(Material material, Integer count)
    {
        materials.put(material, count);
        executeWithLock(() -> globalUpdate.accept("Material", writeMaterialEvent(material, count)));
    }

    public void setShipStat(Statistic statistic, String value)
    {
        executeWithLock(() ->
        {
            shipStatistics.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
            updateInternalState(statistic, value);
        });
    }

    public void setClosestSettlement(SettlementLocation settlementLocation)
    {
        this.localSettlement = settlementLocation;
        if (localCoordinates == null) return;

        var map = this.localSettlement.toMap();
        var dist = calculateDistance(this.localSettlement.longitude, this.localSettlement.latitude);
        var unit = dist < 1000
            ? "m"
            : "km";
        if (unit.equals("km"))
        {
            dist = UIFunctions.Data.round(dist / 1000d, 1);
        }
        map.put("distance", dist);
        map.put("unit", unit);
        var locationData = JSONSupport.Write.jsonToString.apply(map);
        executeWithLock(() -> globalUpdate.accept("Settlement", locationData));
    }

    public void setLocalCoordinates(LocalCoordinates localCoordinates)
    {
        this.localCoordinates = localCoordinates;
        var locationData = JSONSupport.Write.jsonToString.apply(this.localCoordinates.toMap());
        executeWithLock(() -> globalUpdate.accept("Coordinates", locationData));

        if (localSettlement != null)
        {
            setClosestSettlement(localSettlement);
        }

        emitWaypointData(globalUpdate);
        emitTouchdownData(globalUpdate);

        var bearing = getBearing();
        if (!bearing.isEmpty())
        {
            executeWithLock(() -> globalUpdate.accept("Bearing", bearing));
        }
    }

    private String getBearing()
    {
        if (localCoordinates != null)
        {
            if (trackedLocation.get().equalsIgnoreCase("settlement"))
            {
                if (localSettlement != null)
                {
                    var bearing = calculateBearingAngle(localCoordinates.latitude,
                        localCoordinates.longitude,
                        localSettlement.latitude,
                        localSettlement.longitude);

                    return String.valueOf(bearing);
                }
            }
            if (trackedLocation.get().equalsIgnoreCase("touchdown"))
            {
                if (touchdownLongitude != -1 && touchdownLatitude != -1)
                {
                    var bearing = calculateBearingAngle(localCoordinates.latitude,
                        localCoordinates.longitude,
                        touchdownLatitude,
                        touchdownLongitude);

                    return String.valueOf(bearing);
                }
            }
            else if (!trackedLocation.get().isEmpty())
            {
                var waypointLocation = database.computeInTransaction(txn ->
                {
                    try
                    {
                        String[] parts = trackedLocation.get().split("-");
                        var type = Integer.parseInt(parts[0]);
                        var local = Long.parseLong(parts[1]);
                        var entityId = new PersistentEntityId(type, local);
                        var entity = txn.getEntity(entityId);
                        var lat = ((Double) entity.getProperty(EntityKeys.WAYPOINT_LATITUDE));
                        var lon = ((Double) entity.getProperty(EntityKeys.WAYPOINT_LONGITUDE));
                        return new GPSLocation(lat, lon);
                    }
                    catch (Exception e)
                    {
                        return null;
                    }
                });

                if (waypointLocation != null)
                {
                    var bearing = calculateBearingAngle(localCoordinates.latitude,
                        localCoordinates.longitude,
                        waypointLocation.latitude,
                        waypointLocation.longitude);

                    return String.valueOf(bearing);
                }
            }
        }
        return "";
    }

    public void setTrackedLocation(String trackedLocation)
    {
        this.trackedLocation.set(trackedLocation);
        var bearing = getBearing();
        if (!bearing.isEmpty())
        {
            executeWithLock(() -> globalUpdate.accept("Bearing", bearing));
        }
    }

    public void clearTrackedLocation()
    {
        this.trackedLocation.set("");
        executeWithLock(() -> globalUpdate.accept("Bearing", "-"));
    }

    public void emptyModuleSlot(Statistic moduleSlot)
    {
        shipModules.remove(moduleSlot);
    }

    public void setShipModule(Statistic moduleSlot, ShipModuleData shipModuleData)
    {
        shipModules.put(moduleSlot, shipModuleData);
    }

    public ShipModuleData getShipModule(Statistic moduleSlot)
    {
        return shipModules.get(moduleSlot);
    }

    public void adjustCreditBalance(long adjustment)
    {
        creditBalance += adjustment;
        var balance = String.valueOf(creditBalance);
        commanderStatistics.put(CommanderStat.Credits, balance);
        executeWithLock(() -> globalUpdate.accept(CommanderStat.Credits.getName(), balance));
        emitAllTaskData(globalUpdate);
    }

    public void updateFuelLevels(double main, double reservoir)
    {
        // todo: maybe track both levels separately if needed?
        currentFuel = main + reservoir;
        var fuelString = String.valueOf(currentFuel);
        shipStatistics.put(ShipStat.Fuel_Level, fuelString);
        executeWithLock(() -> globalUpdate.accept(ShipStat.Fuel_Level.getName(), fuelString));
    }

    public void refillFuel()
    {
        currentFuel = Double.parseDouble(shipStatistics.get(ShipStat.Fuel_Capacity));
        shipStatistics.put(ShipStat.Fuel_Level, shipStatistics.get(ShipStat.Fuel_Capacity));
        executeWithLock(() -> globalUpdate.accept(ShipStat.Fuel_Level.getName(), String.valueOf(currentFuel)));
    }

    private void updateInternalState(Statistic statistic, String value)
    {
        // player

        if (statistic instanceof CommanderStat)
        {
            if (statistic == CommanderStat.Commander)
            {
                commanderName = commanderStatistics.get(CommanderStat.Commander);
                database.executeInTransaction(this::ensureCommanderExists);
            }

            if (statistic == CommanderStat.Credits)
            {
                creditBalance = Long.parseLong(value.replace(",",""));
                emitAllTaskData(globalUpdate);
            }
        }

        if (statistic instanceof RankStat)
        {
            // ignore for now
        }

        // ship

        if (statistic instanceof ShipStat)
        {
            if (statistic == ShipStat.Fuel_Level)
            {
                currentFuel = Double.parseDouble(value.replace(",",""));
            }

            if (statistic == ShipStat.ReserveCapacity)
            {
                // todo: parse value
            }

            if (statistic == ShipStat.Fuel_Capacity)
            {
                // todo: parse value
            }

            if (statistic == ShipStat.CargoCapacity)
            {
                cargoCapacity = Integer.parseInt(value.replace(",",""));
            }

            if (statistic == ShipStat.Ship)
            {
                try
                {
                    shipType = ShipType.findShip(value);
                    executeWithLock(() -> globalUpdate.accept("Ship_Data", shipType.toJson()));
                }
                catch (Exception e)
                {
                    System.err.println("Could not determine ship type: " + value);
                }
            }
        }
    }

    private ShipModuleData findShipModule(ModificationType type)
    {
        return shipModules.values().stream()
            .filter(m->m.module.modificationType() == type)
            .findFirst()
            .orElse(null);
    }

    private double calculateEffectValue(ItemEffect effect)
    {
        return calculateFilteredEffectValue(effect, (_s) -> true);
    }

    private double calculateModuleEffectValue(ItemEffect effect, Predicate<ShipModuleData> allowedModule)
    {
        return shipModules.entrySet().stream()
            .filter(e -> allowedModule.test(e.getValue()))
            .map(Map.Entry::getValue)
            .map(shipModuleData -> shipModuleData.effectByName(effect))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .mapToDouble(e->e.doubleValue)
            .sum();
    }

    private double calculateFilteredEffectValue(ItemEffect effect, Predicate<Statistic> allowedSlot)
    {
        return shipModules.entrySet().stream()
            .filter(e -> allowedSlot.test(e.getKey()))
            .map(Map.Entry::getValue)
            .map(shipModuleData -> shipModuleData.effectByName(effect))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .mapToDouble(e->e.doubleValue)
            .sum();
    }

    private double calculateCurrentMass()
    {
        if (shipType == null) return 0.0d;

        var moduleMass = calculateEffectValue(ItemEffect.Mass);

        var hullMass = shipType.getBaseShipStats().hullMass;

        var tonnage = cargo.values().stream()
            .mapToDouble(v->v.count)
            .sum();

        double totalHullMass = currentFuel + tonnage + hullMass + moduleMass;

        // round the result to 1 decimal place to match the in-game UI
        return UIFunctions.Data.round(totalHullMass, 1);
    }

    private String calculateCurrentPowerUsage()
    {
        var powerCapacity = calculateEffectValue(ItemEffect.PowerCapacity);

        var powerDraw = calculateEffectValue(ItemEffect.PowerDraw);

        // todo: some utility modules are also retractable and need to be accounted for
        var retractedDraw = calculateFilteredEffectValue(ItemEffect.PowerDraw, nonWeaponSlots);

        var moduleMap = new LinkedHashMap<String, Map<String, Object>>();

        shipModules.entrySet().stream()
            .filter(m->m.getValue().effectByName(ItemEffect.PowerDraw).isPresent())
            .sorted(highestDraw)
            .forEach(m->
            {
                var moduleData = m.getValue();
                double draw = moduleData.effectByName(ItemEffect.PowerDraw)
                    .map(e->e.doubleValue).orElse(0.0d);
                if (draw == 0.0)
                {
                    return;
                }
                var share = UIFunctions.Data.round(((draw / powerCapacity) * 100), 2);
                var powerData = new HashMap<String, Object>();
                powerData.put("draw", UIFunctions.Data.round(draw, 2));
                powerData.put("powered", moduleData.powered ? "on" : "off");
                powerData.put("priority", moduleData.priority);
                powerData.put("share", share);
                moduleMap.put(moduleData.module.displayText(), powerData);
            });

        var output = new HashMap<String, Object>();
        output.put("capacity", UIFunctions.Data.round(powerCapacity, 2));
        output.put("powerDraw", UIFunctions.Data.round(powerDraw, 2));
        output.put("retractedDraw", UIFunctions.Data.round(retractedDraw, 2));
        output.put("modules", moduleMap);
        return JSONSupport.Write.jsonToString.apply(output);
    }

    /**
     * Calculates this ships' shield strength. This check takes into account the installed shield generator and
     * equipped shield boosters, and calculates a shield strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated shield strength for this ship
     */
    private ShipStatisticData.StatGroup calculateCurrentShieldStrength()
    {
        /*
        Before the total shield strength can be calculated, we must first determine the minimum and maximum mass
        and strength characteristics of the shield generator. When a modification is a applied to the optimal mass
        or optimal strength values of a shield generator, it also affects the associated minimum and maximum values
        of that characteristic. Unfortunately, the LoadoutHandler event only contains modified values for the optimal
        mass and/or strength stats. Fortunately calculating them is fairly easy, simply be determining the % change
        from the stock value and applying it to the minimum/maximum values as well.

        Note that for mass, the increase is not applied to the maximum value, so an increase in optimal mass will
        cause an increase in minimum mass, but NOT in maximum mass. For strength values, this is not the case, and
        the percentage change is applied to both the minimum and maximum values.
         */

        // first check for an actual shield generator. The game ensures there will only ever be one generator
        // equipped, so there should only be one or none.
        ShipModuleData shieldGenerator = findShipModule(ModificationType.Shield_Generator);

        // no generator means no shields, so just return zero
        if (shieldGenerator == null) return new ShipStatisticData.StatGroup();

        // get the ships base hull mass, this affects shield strength. Strength calculations only take into
        // account the base mass, additional modules do not affect strength in-game
        double hullMass = shipType.getBaseShipStats().hullMass;
        double maximumMass = shieldGenerator.effectByName(ItemEffect.ShieldGenMaximumMass)
            .map(ItemEffectData::getDoubleValue)
            .orElse(Double.MIN_VALUE);

        // if the ship's mass exceeds maximum mass, the shield doesn't work
        if (hullMass > maximumMass) return new ShipStatisticData.StatGroup();

        // get the stock optimal mass so we can check for modifications
        double stockOptimalMass = shieldGenerator.stockEffectByName(ItemEffect.ShieldGenOptimalMass)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0d);

        // get the actual optimal and minimum mass values. if unmodified, optimal mass will match the stock value
        double optimalMass = shieldGenerator.effectByName(ItemEffect.ShieldGenOptimalMass)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        double minimumMass = shieldGenerator.effectByName(ItemEffect.ShieldGenMinimumMass)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        // if optimal mass was modified, we need to update minimum mass. Note that maximum mass is NOT adjusted,
        // no known mods currently affect maximum mass of shield generators
        if (optimalMass != stockOptimalMass)
        {
            // figure out how much the modification adjustment was
            double diff = optimalMass - stockOptimalMass;

            // figure out what the percentage adjustment to the stock value was
            double percentageAdjustment = diff / stockOptimalMass;

            // apply the same percentage change to calculate the minimum mass adjustment
            double minMassAdjustment = minimumMass * percentageAdjustment;

            // adjust the minimum mass
            minimumMass += minMassAdjustment;
        }

        // get the stock optimal strength so we can check for modifications
        double stockOptimalStrength = shieldGenerator.stockEffectByName(ItemEffect.ShieldGenStrength)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        // get the actual optimal, minimum, and maximum values. As with mass, optimal will
        // equal stock if there is no modification applied. However, unlike mass, the modification
        // change must be applied to the maximum as well as the minimum
        double optimalStrength = shieldGenerator.effectByName(ItemEffect.ShieldGenStrength)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        double minimumStrength = shieldGenerator.effectByName(ItemEffect.ShieldGenMinStrength)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        double maximumStrength = shieldGenerator.effectByName(ItemEffect.ShieldGenMaxStrength)
            .map(ItemEffectData::getDoubleValue)
            .orElse(0.0d);

        // if optimal strength was modified, we need to calculate adjusted minimum and maximum strength values
        if (optimalStrength != stockOptimalStrength)
        {
            // figure out how much the modification adjustment was
            double diff = optimalStrength - stockOptimalStrength;

            // figure out what the percentage adjustment to the stock value was
            double percentageAdjustment = diff / stockOptimalStrength;

            // apply the same percentage change to calculate the minimum and maximum strength adjustments
            double minStrengthAdjustment = minimumStrength * percentageAdjustment;
            double maxStrengthAdjustment = maximumStrength * percentageAdjustment;

            // adjust the minimum and maximum strengths
            minimumStrength += minStrengthAdjustment;
            maximumStrength += maxStrengthAdjustment;
        }

        /*
        Now we can start actually calculating the final shield value. Shields are adjusted by two separate multipliers
        to get the final value.

        The first multiplier is calculated based on the difference between the base hull mass
        of the ship and the optimal mass value of the equipped shield generator. If the hull mass is lower than optimal,
        the shield will be stronger and above optimal it will be weaker. Both the upper and lower ends of the scale are
        clamped at the minimum and maximum mass values, so a hull mass lower than the minimum will receive a strength
        increase equal to what it would get if were exactly the minimum mass.

        The second multiplier is more straightforward, calculated by taking the sum of shield boost values of all
        equipped shield boosters and adding 1. Effectively, this means the multiplier becomes 1 if no shield boosters
        are fitted, causing no change to the calculated shield strength
         */

        // start with the base shield value
        double baseShield = shipType.getBaseShipStats().shield;

        // calculate strength differences for the min/max range and the optimal/minimum strengths
        double strengthRangeDifference = maximumStrength - minimumStrength;
        double optimalStrengthDifference = optimalStrength - minimumStrength;

        // calculate the mass differences for the min/max range, maximum/ hull mass, and max/optimal mass
        double massRangeDifference = maximumMass - minimumMass;

        double maxHullDifference = maximumMass - hullMass;
        double maxOptimalDifference = maximumMass - optimalMass;

        // calculate hull mass and optimal mass ratios
        double hullMassRatio = maxHullDifference / massRangeDifference;
        double optimalMassRatio = maxOptimalDifference / massRangeDifference;

        // calculate the optimal/range strength ratio
        double strengthRatio = optimalStrengthDifference / strengthRangeDifference;

        // calculate mass factors for the hull and optimal masses, maxing out at 1
        double hullMassFactor = min(1, hullMassRatio);
        double optimalMassFactor = min(1, optimalMassRatio);

        // calculate a strength exponent to apply to the hull mass factor
        double strengthExponent = log(strengthRatio) / log(optimalMassFactor);

        // calculate the final shield power modifier
        double strengthPower = pow(hullMassFactor, strengthExponent);

        // calculate the total shield multiplier and divide by 100, since it is applied as a percentage increase
        double shieldMultiplier = (minimumStrength + strengthPower * strengthRangeDifference) / 100d;

        // calculate the sum of 1 + all shield booster values, and divide by 100 for use as a percentage increase
        double accumulatedBoost = 1 + calculateModuleEffectValue(ItemEffect.DefenceModifierShieldMultiplier,
            (m) -> m.module.modificationType() == ModificationType.Shield_Booster) / 100d;

        double accumulatedShieldReinforcement = calculateEffectValue(ItemEffect.DefenceModifierShieldAddition);

        // apply all the multipliers to the ship's base shield value to calculate the total shield strength
        double calculatedShield = (baseShield * shieldMultiplier * accumulatedBoost) + accumulatedShieldReinforcement;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = calculatedShield;
        statGroup.baseValue = baseShield;
        statGroup.rawFloat = baseShield * shieldMultiplier * accumulatedBoost;
        statGroup.boostValue = accumulatedShieldReinforcement;
        statGroup.diminishCap = optimalMass - hullMass;

        statGroup.baseMultiplier= 0.0;
        statGroup.boostMultiplier= 0.0;

        // round the result to 1 decimal place to match the in-game UI
        return statGroup;
    }

    /**
     * Calculates this ships' current hull strength. This check takes into account bulkhead armour and hull
     * reinforcement packages, and calculates a hull strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated hull strength for this ship
     */
    private ShipStatisticData.StatGroup calculateCurrentHullStrength()
    {
        if (shipType == null) return new ShipStatisticData.StatGroup();

        /*
        There are two statistics that affect hull strength, "hull boost" and "hull reinforcement".

        At the moment, hull boost can only be affected by bulkhead armour modules, and as a core module there can only
        be one of them present on any ship. This makes calculating hull boost fairly straightforward, requiring only a
        simple conversion of the boost multiplier to a percentage, and then multiplying that value by the base hull to
        determine the actual adjustment to the hull strength it should apply.

        For hull reinforcement, the process is also very easy. Currently there is only one module type that can add
        reinforcement, which is the Hull Reinforcement Package. Also, unlike hull boost, reinforcement is not a
        multiplier but a straight adjustment to the ship's hull strength. The process then, is simply to sum the total
        reinforcement values on all Hull Reinforcement Packages that are installed and add it to the hull strength
         */

        // start with the base armor rating
        double hullStrength = shipType.getBaseShipStats().armorRating;

        // loop through all the modules that can have hull reinforcement. For now, this
        // means only optional internals, but if this changes in the future, loop through
        // all relevant modules
        double hullReinforcement = calculateEffectValue(ItemEffect.DefenceModifierHealthAddition);

        // right now, only armour modules can add hull boost, so we can loop through just the core
        // internals and filter in armour modules. In practice, this will only ever find one module
        double hullBoost = calculateEffectValue(ItemEffect.DefenceModifierHealthMultiplier) / 100d * hullStrength;

        // calculate the final hull strength by adding the base bull, plus the boost and reinforcement adjustments
        double totalHullStrength = hullStrength + hullBoost + hullReinforcement;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = totalHullStrength;
        statGroup.baseValue = hullStrength;
        statGroup.rawFloat = hullBoost;
        statGroup.boostValue = hullReinforcement;
        statGroup.diminishCap = 0d;

        statGroup.baseMultiplier= 0.0;
        statGroup.boostMultiplier= 0.0;
        // round the result to 1 decimal place to match the in-game UI
        return statGroup;
    }

    private ShipStatisticData.StatGroup getArmorResistanceTotal(ItemEffect resistanceEffect)
    {
        List<Double> resistances = new ArrayList<>();

        List<Double> baseResistances = new ArrayList<>();
        List<Double> boostResistances = new ArrayList<>();

        shipModules.values().stream()
            .filter(shipModuleData -> shipModuleData.module.modificationType() == ModificationType.Bulkheads)
            .map(shipModuleData -> shipModuleData.effectByName(resistanceEffect).map(e -> e.doubleValue))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .filter(nonZeroValue)
            .mapToDouble(Double::doubleValue)
            .map(next -> 100d - next)
            .map(next -> next / 100d)
            .map(n-> UIFunctions.Data.round(n, 5))
            .forEach(baseResistances::add);

        shipModules.values().stream()
            .filter(module ->
            {
                boolean isType = module.module.modificationType() == ModificationType.Hull_Reinforcement_Package;
                boolean isGuardian = module.effectByName(ItemEffect.guardian)
                    .map(e->e.doubleValue)
                    .orElse(0.0d) == 1.0;
                return isType || isGuardian;
            })
            .map(m->m.effectByName(resistanceEffect).map(e->e.doubleValue))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .filter(nonZeroValue)
            .map(next -> 100d - next)
            .map(next -> next / 100d)
            .map(n -> UIFunctions.Data.round(n, 5))
            .forEach(boostResistances::add);

        resistances.addAll(baseResistances);
        resistances.addAll(boostResistances);

        double baseResistance = baseResistances.stream()
            .mapToDouble(Double::doubleValue)
            .reduce(1, (a, b) -> a * b);

        double boostResistance = boostResistances.stream()
            .mapToDouble(Double::doubleValue)
            .reduce(1, (a, b) -> a * b);

        double combinedResistance = resistances.stream()
            .mapToDouble(Double::doubleValue)
            .reduce(1, (a, b) -> a * b);

        boolean shouldDiminish = combinedResistance < .7;

        double scaledBoosterResistance = shouldDiminish
            ? 0.7 - (0.7 - combinedResistance) / 2
            : combinedResistance;

        double actual = (1.0 - (scaledBoosterResistance)) * 100d;
        double raw = (1.0 - (combinedResistance)) * 100d;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(actual,1);
        statGroup.rawFloat = UIFunctions.Data.round(raw, 1);
        statGroup.diminishCap = UIFunctions.Data.round((combinedResistance - .7) * 100, 2);

        statGroup.boostMultiplier = UIFunctions.Data.round(boostResistance, 2);
        statGroup.baseMultiplier = UIFunctions.Data.round(baseResistance, 2);

        statGroup.boostValue = UIFunctions.Data.round((1.0 - (boostResistance)) * 100d, 2);
        statGroup.baseValue = UIFunctions.Data.round((1.0 - (baseResistance)) * 100d, 2);

        return statGroup;
    }

    private ShipStatisticData.StatGroup getShieldResistanceTotal(ItemEffect resistanceEffect)
    {
        List<Double> resistances = new ArrayList<>();
        double shieldResistence = shipModules.values().stream()
                .filter(shipModuleData -> shipModuleData.module.modificationType() == ModificationType.Shield_Generator)
                .map(shipModuleData -> shipModuleData.effectByName(resistanceEffect).map(e -> e.doubleValue))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .filter(nonZeroValue)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .map(n->UIFunctions.Data.round(n, 5))
                .findFirst()
                .orElse(1d);

        shipModules.values().stream()
            .filter(shipModuleData -> shipModuleData.module.modificationType() == ModificationType.Shield_Booster)
            .map(shipModuleData -> shipModuleData.effectByName(resistanceEffect).map(e -> e.doubleValue))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .filter(nonZeroValue)
            .map(next -> 100d - next)
            .map(next -> next / 100d)
            .map(n->UIFunctions.Data.round(n, 5))
            .forEach(resistances::add);

        double boosterResistance = resistances.stream()
            .mapToDouble(Double::doubleValue)
            .reduce(1, (a, b) -> a * b);

        boolean shouldDiminish = boosterResistance < .7;

        double scaledBoosterResistance = shouldDiminish
            ? 0.7 - (0.7 - boosterResistance) / 2
            : boosterResistance;

        double actual = (1.0 - (scaledBoosterResistance * shieldResistence)) * 100d;
        double raw = (1.0 - (boosterResistance * shieldResistence)) * 100d;

        ShipStatisticData.StatGroup statGroup = new ShipStatisticData.StatGroup();
        statGroup.floatStat = UIFunctions.Data.round(actual,1);
        statGroup.rawFloat = UIFunctions.Data.round(raw, 1);
        statGroup.diminishCap = UIFunctions.Data.round((boosterResistance - .7) * 100, 2);

        statGroup.boostValue = UIFunctions.Data.round((1.0 - (boosterResistance)) * 100d, 2);
        statGroup.boostMultiplier = UIFunctions.Data.round(boosterResistance, 2);
        statGroup.baseValue = UIFunctions.Data.round((1.0 - (shieldResistence)) * 100d, 2);
        statGroup.baseMultiplier = UIFunctions.Data.round(shieldResistence, 2);

        return statGroup;
    }

    private ShipStatisticData.StatGroup calculateResistance(ShipCharacteristic resistanceType)
    {
        ShipStatisticData.StatGroup calculatedResistance;
        switch (resistanceType)
        {
            case Armour_Caustic:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.CausticResistance);
                break;

            case Armour_Explosive:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Armour_Kinetic:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Armour_Thermal:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ThermicResistance);
                break;

            case Shield_Explosive:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Shield_Kinetic:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Shield_Thermal:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ThermicResistance);
                break;

            default: calculatedResistance = new ShipStatisticData.StatGroup();
        }
        return calculatedResistance;
    }

    private DamageBreakdown calculateDamageShares(double dps,
                                                  double partialExplosive,
                                                  double partialKinetic,
                                                  double partialThermal,
                                                  double naturalShare,
                                                  String type,
                                                  String naturalType)
    {
        var thermalShare = 0.0d;
        var kineticShare = 0.0d;
        var explosiveShare = 0.0d;
        var absoluteShare = 0.0d;

        DamageBreakdown naturalBreakdown = null;
        if (naturalShare != 1.0)
        {
            naturalBreakdown = calculateDamageShares(dps * naturalShare,
                0.0d,
                0.0d,
                0.0d,
                1.0,
                naturalType,
                type);
        }

        switch (type)
        {
            case "Absolute":
            case "Absolute/AX":
                absoluteShare = dps * .6;
                thermalShare = dps * .2;
                kineticShare = dps * .2;
                break;

            case "Thermal":
            case "Thermal/AX":
                thermalShare = dps;
                break;

            case "Kinetic":
            case "Kinetic/AX":
                kineticShare = dps;
                break;

            case "Explosive":
            case "Explosive/AX":
                explosiveShare = dps;
                break;

            case "Thermo-Kinetic":
                thermalShare = dps * .666;
                kineticShare = dps * .333;
                break;

            case "PartialExplosive":
                explosiveShare = dps * partialExplosive;
                break;

            case "PartialKinetic":
                kineticShare = dps * partialKinetic;
                break;

            case "PartialThermal":
                thermalShare = dps * partialThermal;
                break;

            default:
                System.err.println("Unknown damage type: " + type);
                break;
        }

        if (naturalBreakdown != null)
        {
            thermalShare += naturalBreakdown.thermalShare;
            kineticShare += naturalBreakdown.kineticShare;
            explosiveShare += naturalBreakdown.explosiveShare;
            absoluteShare += naturalBreakdown.absoluteShare;
        }

        return new DamageBreakdown(thermalShare, kineticShare, explosiveShare, absoluteShare);
    }

    private String calculateOffenseStats()
    {
        // total combined
        double totalDPS = calculateFilteredEffectValue(ItemEffect.DamagePerSecond, nonUtilityHardpoints);

        DoubleAdder absoluteDamage = new DoubleAdder();
        DoubleAdder thermalDamage = new DoubleAdder();
        DoubleAdder kineticDamage = new DoubleAdder();
        DoubleAdder explosiveDamage = new DoubleAdder();

        var weaponBreakdown = new ArrayList<Map<String, Object>>();

        shipModules.entrySet().stream()
            .filter(entry -> entry.getKey() instanceof HardpointSlot)
            .filter(entry-> ((HardpointSlot) entry.getKey()).getSize() > 0)
            .map(Map.Entry::getValue)
            .forEach(module ->
            {
                var type = module.effectByName(ItemEffect.DamageType)
                    .map(ItemEffectData::getValueString)
                    .orElse("");

                double dps = module.effectByName(ItemEffect.DamagePerSecond)
                    .map(ItemEffectData::getDoubleValue)
                    .orElse(0.0d);

                double partialExplosive = module.effectByName(ItemEffect.Damage_Partially_Explosive)
                    .map(ItemEffectData::getDoubleValue)
                    .map(effectValue -> effectValue * 0.01d)
                    .orElse(0.0d);

                double partialKinetic = module.effectByName(ItemEffect.Damage_Partially_Kinetic)
                    .map(ItemEffectData::getDoubleValue)
                    .map(effectValue -> effectValue * 0.01d)
                    .orElse(0.0d);

                double partialThermal = module.effectByName(ItemEffect.Damage_Partially_Thermal)
                    .map(ItemEffectData::getDoubleValue)
                    .map(effectValue -> effectValue * 0.01d)
                    .orElse(0.0d);

                var naturalType = type;
                var naturalShare = 1.0d;

                if (partialExplosive > 0.0)
                {
                    type = "PartialExplosive";
                    naturalShare = 1.0 - partialExplosive;
                }
                else if (partialKinetic > 0.0)
                {
                    type = "PartialKinetic";
                    naturalShare = 1.0 - partialKinetic;
                }
                else if (partialThermal > 0.0)
                {
                    type = "PartialThermal";
                    naturalShare = 1.0 - partialThermal;
                }

                var damageShares = calculateDamageShares(dps,
                    partialExplosive,
                    partialKinetic,
                    partialThermal,
                    naturalShare,
                    type,
                    naturalType);

                thermalDamage.add(damageShares.thermalShare);
                kineticDamage.add(damageShares.kineticShare);
                explosiveDamage.add(damageShares.explosiveShare);
                absoluteDamage.add(damageShares.absoluteShare);

                var damageData = new HashMap<String, Object>();
                damageData.put("total", UIFunctions.Data.round(dps, 2));
                damageData.put("thermal", UIFunctions.Data.round(damageShares.thermalShare, 2));
                damageData.put("kinetic", UIFunctions.Data.round(damageShares.kineticShare, 2));
                damageData.put("explosive", UIFunctions.Data.round(damageShares.explosiveShare, 2));
                damageData.put("absolute", UIFunctions.Data.round(damageShares.absoluteShare, 2));

                var moduleData = new HashMap<String, Object>();
                moduleData.put(module.module.displayText(), damageData);

                weaponBreakdown.add(moduleData);
            });

        var turretBreakdown = new ArrayList<Map<String, Object>>();

        shipModules.entrySet().stream()
            .filter(entry -> entry.getKey() instanceof HardpointSlot)
            .filter(entry-> ((HardpointSlot) entry.getKey()).getSize() == 0)
            .map(Map.Entry::getValue)
            .forEach(module ->
            {
                double dps = module.effectByName(ItemEffect.DamagePerSecond)
                    .map(ItemEffectData::getDoubleValue)
                    .orElse(0.0d);

                if (dps == 0.0d)
                {
                    return;
                }

                var moduleData = new HashMap<String, Object>();
                moduleData.put(module.module.displayText(), dps);

                turretBreakdown.add(moduleData);
            });

        var data = new HashMap<String, Object>();
        data.put("totalDPS", UIFunctions.Data.round(totalDPS, 2));
        data.put("totalThermal", UIFunctions.Data.round(thermalDamage.sum(), 2));
        data.put("totalKinetic", UIFunctions.Data.round(kineticDamage.sum(), 2));
        data.put("totalExplosive", UIFunctions.Data.round(explosiveDamage.sum(), 2));
        data.put("totalAbsolute", UIFunctions.Data.round(absoluteDamage.sum(), 2 ));

        if (!weaponBreakdown.isEmpty())
        {
            data.put("weapons", weaponBreakdown);
        }

        if (!turretBreakdown.isEmpty())
        {
            data.put("defenseTurrets", turretBreakdown);
        }

        return JSONSupport.Write.jsonToString.apply(data);
    }

    private void formatStrength(HashMap<String, Object> dataMap, ShipStatisticData.StatGroup stats, boolean minmax)
    {
        dataMap.put("value", UIFunctions.Data.round(stats.floatStat,0));
        dataMap.put("base", UIFunctions.Data.round(stats.baseValue, 1));
        dataMap.put("reinforcement", UIFunctions.Data.round(stats.boostValue, 1));
        dataMap.put("raw", UIFunctions.Data.round(stats.rawFloat, 1));
        if (minmax)
        {
            dataMap.put("minmax", UIFunctions.Data.round(stats.diminishCap, 1));
        }
    }

    private void formatResistance(HashMap<String, Object> dataMap, ShipStatisticData.StatGroup stats)
    {
        dataMap.put("value", UIFunctions.Data.round(stats.floatStat, 2));
        dataMap.put("raw", UIFunctions.Data.round(stats.rawFloat,2));
        dataMap.put("base", UIFunctions.Data.round(stats.baseValue, 2));
        dataMap.put("baseMultiplier", UIFunctions.Data.round(stats.baseMultiplier,2));
        dataMap.put("boost", UIFunctions.Data.round(stats.boostValue, 2));
        dataMap.put("boostMultiplier", UIFunctions.Data.round(stats.boostMultiplier, 2));
        dataMap.put("minmax", UIFunctions.Data.round(stats.diminishCap, 2));
    }

    private String calculateDefenseStats()
    {
        // create dat containers
        var data = new HashMap<String, Object>();
        var shieldData = new HashMap<String, Object>();
        var hullData = new HashMap<String, Object>();
        var shieldExplosiveData = new HashMap<String, Object>();
        var shieldKineticData = new HashMap<String, Object>();
        var shieldThermalData = new HashMap<String, Object>();
        var hullExplosiveData = new HashMap<String, Object>();
        var hullKineticData = new HashMap<String, Object>();
        var hullThermalData = new HashMap<String, Object>();
        var hullCausticData = new HashMap<String, Object>();

        // calculate values
        var shieldRegenRate = calculateEffectValue(ItemEffect.RegenRate);
        var brokenRegenRate = calculateEffectValue(ItemEffect.BrokenRegenRate);
        var shieldStats = calculateCurrentShieldStrength();
        var hullStats = calculateCurrentHullStrength();
        var shieldExplosive = calculateResistance(ShipCharacteristic.Shield_Explosive);
        var shieldKinetic = calculateResistance(ShipCharacteristic.Shield_Kinetic);
        var shieldThermal = calculateResistance(ShipCharacteristic.Shield_Thermal);
        var hullExplosive = calculateResistance(ShipCharacteristic.Armour_Explosive);
        var hullKinetic = calculateResistance(ShipCharacteristic.Armour_Kinetic);
        var hullThermal = calculateResistance(ShipCharacteristic.Armour_Thermal);
        var hullCaustic = calculateResistance(ShipCharacteristic.Armour_Caustic);

        // format values
        formatStrength(shieldData, shieldStats, true);
        formatStrength(hullData, hullStats, false);
        formatResistance(shieldExplosiveData, shieldExplosive);
        formatResistance(shieldKineticData, shieldKinetic);
        formatResistance(shieldThermalData, shieldThermal);
        formatResistance(hullExplosiveData, hullExplosive);
        formatResistance(hullKineticData, hullKinetic);
        formatResistance(hullThermalData, hullThermal);
        formatResistance(hullCausticData, hullCaustic);

        // store formatted data
        data.put("regen", UIFunctions.Data.round(shieldRegenRate, 2));
        data.put("brokenRegen", UIFunctions.Data.round(brokenRegenRate, 2));
        data.put("Shield Strength", shieldData);
        data.put("Hull Strength", hullData);
        data.put("Shield Explosive", shieldExplosiveData);
        data.put("Shield Kinetic", shieldKineticData);
        data.put("Shield Thermal", shieldThermalData);
        data.put("Hull Explosive", hullExplosiveData);
        data.put("Hull Kinetic", hullKineticData);
        data.put("Hull Thermal", hullThermalData);
        data.put("Hull Caustic", hullCausticData);

        return JSONSupport.Write.jsonToString.apply(data);
    }

    private String prepareEngineerData()
    {
        Arrays.stream(Engineer.values())
            .filter(e->!engineerProgress.containsKey(e))
            .forEach(engineer ->
            {
                var unknownEngineer = new HashMap<String, Object>();
                unknownEngineer.put("status", "Unknown");
                unknownEngineer.put("rank", 0);
                unknownEngineer.put("progress", 0);
                unknownEngineer.put("location", "Unknown");
                unknownEngineer.put("system", "Unknown");
                unknownEngineer.put("distance", -1);
                unknownEngineer.put("name", engineer.getFullName());
                engineerProgress.put(engineer, unknownEngineer);
            });

        var formattedData = new HashMap<String, Object>();
        engineerProgress.forEach(((engineer, data) ->
            formattedData.put(engineer.name(), data)));

        return JSONSupport.Write.jsonToString.apply(formattedData);
    }

    private String prepareNavRouteData()
    {
        var data = new HashMap<String, Object>();
        var routePoints = currentRoute.stream().map(routeEntry ->
        {
            var formattedData = new HashMap<String, Object>();
            formattedData.put("name", routeEntry.starSystem.systemName);
            formattedData.put("distance", this.starSystem.distanceBetween(routeEntry.starSystem));
            formattedData.put("starClass", routeEntry.starClass);
            return formattedData;
        }).collect(Collectors.toList());
        data.put("route", routePoints);
        data.put("jumps", currentRoute.size() - 1);
        return JSONSupport.Write.jsonToString.apply(data);
    }

    public void updateSystemBodyCount(long address, int count)
    {
        database.executeInTransaction(transaction -> Optional.ofNullable(getStarSystemEntity(transaction, address))
            .ifPresent(systemEntity -> systemEntity.setProperty(EntityKeys.STAR_SYSTEM_BODY_COUNT, count)));

        if (address == starSystem.address)
        {
            executeWithLock(() -> globalUpdate.accept("Cartography", String.valueOf(starSystem.address)));
        }
    }

    public void updateBodyMapped(long address, int body)
    {
        database.executeInTransaction(transaction -> Optional.ofNullable(getStarSystemEntity(transaction, address))
            .flatMap(systemEntity -> EntityUtilities.entityStream(systemEntity.getLinks(EntityKeys.STELLAR_BODY))
            .filter(systemBody -> Objects.equals(systemBody.getProperty(EntityKeys.STELLAR_BODY_ID), body))
            .findFirst()).ifPresent(foundBody -> foundBody.setProperty(EntityKeys.STELLAR_BODY_MAPPED, true)));

        if (address == starSystem.address)
        {
            executeWithLock(() -> globalUpdate.accept("Cartography", String.valueOf(starSystem.address)));
        }
    }

    public void discoverStellarBody(StellarBody stellarBody)
    {
        database.executeInTransaction((transaction)->
        {
            var systemEntity = getStarSystemEntity(transaction, stellarBody.address);
            if (systemEntity == null)
            {
                System.out.println("Setting data for bodies with no known system is not currently supported");
                return;
            }

            var bodies = transaction.find(EntityKeys.STELLAR_BODY, EntityKeys.STELLAR_BODY_ID, stellarBody.id);
            var bodyEntity = EntityUtilities.entityStream(bodies)
                .filter(body ->
                {
                    var linkedSystem = body.getLink(EntityKeys.STAR_SYSTEM);
                    if (linkedSystem == null) return false;
                    return linkedSystem.getId().compareTo(systemEntity.getId()) == 0;
                })
                .findFirst().orElseGet(() ->
                {
                    var newBody = transaction.newEntity(EntityKeys.STELLAR_BODY);
                    newBody.setLink(EntityKeys.STAR_SYSTEM, systemEntity);
                    systemEntity.addLink(EntityKeys.STELLAR_BODY, newBody);
                    return newBody;
                });
            stellarBody.storeBodyData(bodyEntity);
        });
    }

    /**
     * Haversine function: hav(θ) = sin ^ 2 (θ/2)
     *
     * @param radAngle input angle in radians
     * @return haversine distance of the input angle
     */
    private double haversine(double radAngle)
    {
        return sin(radAngle / 2) * sin(radAngle / 2);
    }

    /**
     * Calculates a distance between two latitude/longitude pairs, taking into account the radius of the planet and
     * the player's altitude. Waypoints are currently assumed to be on the planet's surface for the purpose of
     * distance calculations. Due to irregularities in planet topology, the distances may be slightly off depending on
     * the planet. For use as a general guide though, the values and relative positions in the map should be correct.
     * The unit of measurement for this function is meters.
     *
     * This method uses the old trigonometric Haversine function to determine the "Great circle distance" between two
     * latitude and longitude points on the planet. This implementation also accounts for altitude when determining the
     * distance to a position.
     *
     * @param waypointLong the waypoint's longitude
     * @param waypointLat the waypoint's latitude
     * @return the approximate distance between the two points in meters
     */
    private double calculateDistance(double waypointLong, double waypointLat)
    {
        double latDistance = toRadians(waypointLat - localCoordinates.latitude);
        double lonDistance = toRadians(waypointLong - localCoordinates.longitude);

        double a = haversine(latDistance)
            + cos(toRadians(localCoordinates.latitude))
            * cos(toRadians(waypointLat))
            * haversine(lonDistance);

        double c = 2 * atan2(sqrt(a), sqrt(1 - a));

        double adjustedDistance = localCoordinates.radius * c;

        return sqrt(pow(adjustedDistance, 2) + pow(localCoordinates.altitude, 2));
    }

    /**
     * Finds the bearing, in degrees, that an observer at a given set of coordinates should travel in order to move
     * toward a point at a different set of co-ordinates. Coordinates are given as latitude/longitude pairs
     * representing the current location and the destination. The returned bearing value is converted to the angle
     * range between 0 and 360 (as opposed to between -180 and 180) and is rounded to 2 decimal places.
     *
     * NOTE: uses static import of {@linkplain java.lang.Math}
     *
     * @param locationLatitude latitude of the current location
     * @param locationLongitude longitude of the current location
     * @param destinationLatitude latitude of the destination
     * @param destinationLongitude longitude of the destination
     * @return bearing angle from the current location that will lead to the destination
     */
    static double calculateBearingAngle(double locationLatitude,
                                        double locationLongitude,
                                        double destinationLatitude,
                                        double destinationLongitude)
    {
        double phiStart = toRadians(locationLatitude);
        double phiEnd = toRadians(destinationLatitude);
        double delta = toRadians(destinationLongitude - locationLongitude);

        double ordinate = (sin(delta) * cos(phiEnd));
        double abscissa = (cos(phiStart) * sin(phiEnd) - sin(phiStart) * cos(phiEnd) * cos(delta));
        double theta = atan2(ordinate, abscissa);

        double bearing = toDegrees(theta);
        if (bearing < 0 )
        {
            bearing += 360;
        }
        return UIFunctions.Data.round(bearing, 2);
    }

    public void clearFactionData()
    {
        synchronized (systemFactions)
        {
            systemFactions.clear();
        }
        executeWithLock(() -> globalUpdate.accept("Faction", "clear"));
    }

    public void acceptFactionData(List<Map<String, Object>> factionData)
    {
        synchronized (systemFactions)
        {
            systemFactions.clear();
            systemFactions.addAll(factionData);
            systemFactions.sort(highestInfluence);
        }
        executeWithLock(() -> emitFactionData(globalUpdate));
    }

    public void clearConflictData()
    {
        synchronized (localConflicts)
        {
            localConflicts.clear();
        }
        executeWithLock(() -> globalUpdate.accept("Conflicts", "clear"));
    }

    public void acceptConflictData(List<Map<String, Object>> conflictData)
    {
        synchronized (localConflicts)
        {
            localConflicts.clear();
            localConflicts.addAll(conflictData);
        }
        executeWithLock(() -> emitConflictData(globalUpdate));
    }


    //region Database Access Functions

    private void ensureCommanderExists(StoreTransaction transaction)
    {
        if (commanderName.isEmpty())
        {
            System.err.println("Commander name is empty!");
        }
        if (transaction.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderName).isEmpty())
        {
            transaction.newEntity(EntityKeys.COMMANDER)
                .setProperty(EntityKeys.NAME, commanderName);
        }
    }

    private Entity getCommanderEntity(StoreTransaction transaction)
    {
        if (commanderName.isEmpty()) return null;
        return transaction.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderName).getFirst();
    }

    private Entity getOrCreateStarSystemEntity(StoreTransaction transaction, StarSystem starSystem)
    {
        var commanderEntity = getCommanderEntity(transaction);
        if (commanderEntity == null) return null;

        var systems = transaction.find(EntityKeys.STAR_SYSTEM, EntityKeys.STAR_SYSTEM_ADDRESS, starSystem.address);
        return EntityUtilities.entityStream(systems)
            .filter(system ->
            {
                var linkedCommander = system.getLink(EntityKeys.COMMANDER);
                if (linkedCommander == null) return false;
                return linkedCommander.getId().compareTo(commanderEntity.getId()) == 0;
            })
            .findFirst().orElseGet(()->
            {
                var newSystem = transaction.newEntity(EntityKeys.STAR_SYSTEM);
                starSystem.storeSystemData(newSystem);
                newSystem.setLink(EntityKeys.COMMANDER, commanderEntity);
                commanderEntity.addLink(EntityKeys.STAR_SYSTEM, newSystem);
                return newSystem;
            });
    }

    private Entity getStarSystemEntity(StoreTransaction transaction, long address)
    {
        var commanderEntity = getCommanderEntity(transaction);
        if (commanderEntity == null) return null;

        var systems = transaction.find(EntityKeys.STAR_SYSTEM, EntityKeys.STAR_SYSTEM_ADDRESS, address);
        return EntityUtilities.entityStream(systems)
            .filter(system ->
            {
                var linkedCommander = system.getLink(EntityKeys.COMMANDER);
                if (linkedCommander == null) return false;
                return linkedCommander.getId().compareTo(commanderEntity.getId()) == 0;
            })
            .findFirst().orElse(null);
    }

    private static void bodyEntityToMap(Entity stellarBody, Map<String, Object> map)
    {
        stellarBody.getPropertyNames()
            .forEach(propertyName -> map.put(propertyName, stellarBody.getProperty(propertyName)));

        stellarBody.getBlobNames()
            .forEach(propertyName ->
            {
                var json = JSONSupport.Parse.jsonString.apply(stellarBody.getBlobString(propertyName));
                map.put(propertyName, json.get("json"));
            });
    }

    private Map<String, Object> prepareCatalogList()
    {
        return database.computeInTransaction(txn ->
        {
            var data = new HashMap<String, Object>();
            var commander = getCommanderEntity(txn);
            if (commander == null) return data;
            var entries = EntityUtilities.entityStream(commander.getLinks(EntityKeys.STAR_SYSTEM))
                .map(system->
                {
                    var listEntry = new HashMap<String, Object>();
                    listEntry.put("name", system.getProperty(EntityKeys.STAR_SYSTEM));
                    listEntry.put("address", system.getProperty(EntityKeys.STAR_SYSTEM_ADDRESS));
                    return listEntry;
                }).collect(Collectors.toList());
            data.put("entries", entries);
            return data;
        });
    }

    private Map<String, Object> prepareCartographicData(long systemAddress)
    {
        return database.computeInTransaction(transaction ->
        {
            var data = new HashMap<String, Object>();
            var commanderEntity = getCommanderEntity(transaction);
            if (commanderEntity == null) return data;

            var systems = transaction.find(EntityKeys.STAR_SYSTEM, EntityKeys.STAR_SYSTEM_ADDRESS, systemAddress);
            EntityUtilities.entityStream(systems)
                .filter(system ->
                {
                    var commander = system.getLink(EntityKeys.COMMANDER);
                    return commander != null && commander.getId().compareTo(commanderEntity.getId()) == 0;
                })
                .findFirst()
                .ifPresent(systemEntity ->
                {
                    bodyEntityToMap(systemEntity, data);
                    var bodies = systemEntity.getLinks(EntityKeys.STELLAR_BODY);
                    var poiNotes = systemEntity.getLinks(EntityKeys.POI_NOTE);
                    var bodyList = EntityUtilities.entityStream(bodies)
                        .map(bodyEntity ->
                        {
                            var bodyData = new HashMap<String, Object>();
                            bodyEntityToMap(bodyEntity, bodyData);
                            return bodyData;
                        })
                        .sorted(Comparator.comparingInt(map ->
                            ((Number) map.get(EntityKeys.STELLAR_BODY_ID)).intValue()))
                        .collect(Collectors.toList());
                    var poiNoteList = EntityUtilities.entityStream(poiNotes)
                        .map(poiNote->
                        {
                            var poiData = new HashMap<>();
                            poiData.put("poi", poiNote.getBlobString(EntityKeys.POI_TEXT));
                            poiData.put("id", poiNote.getId().toString());
                            return poiData;
                        })
                        .collect(Collectors.toList());
                    data.put("bodies", bodyList);
                    if (!poiNoteList.isEmpty())
                    {
                        data.put("poi", poiNoteList);
                    }
                });
            return data;
        });
    }

    //endregion

    //region UI Event Emitters

    public void emitEngineerData()
    {
        var engineerData = prepareEngineerData();
        executeWithLock(() -> globalUpdate.accept("Engineers", engineerData));
    }

    public void emitLoadoutEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Loadout", "updated"));
    }

    public void emitCurrentMass()
    {
        var currentMass = calculateCurrentMass();
        executeWithLock(() -> globalUpdate.accept("CurrentMass", String.valueOf(currentMass)));
    }

    public void emitExtendedStatsEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Statistics", "updated"));
    }

    public void emitMarketEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Market", "updated"));
    }

    public void emitPowerStats()
    {
        var powerStats = calculateCurrentPowerUsage();
        executeWithLock(() -> globalUpdate.accept("PowerStats", powerStats));
    }

    public void emitOffenseStats()
    {
        var offenseStats = calculateOffenseStats();
        executeWithLock(() -> globalUpdate.accept("OffenseStats", offenseStats));
    }

    public void emitDefenseStats()
    {
        var defenseStats = calculateDefenseStats();
        executeWithLock(() -> globalUpdate.accept("DefenseStats", defenseStats));
    }

    public void emitCartographyIfCurrent(long address)
    {
        if (starSystem.address == address)
        {
            emitCartographyData();
        }
    }

    public void emitCartographyData()
    {
        executeWithLock(() -> globalUpdate.accept("Cartography", String.valueOf(starSystem.address)));
    }

    private void emitConflictData(BiConsumer<String, String> sink)
    {
        String conflictJson;
        sink.accept("Conflicts", "clear");
        synchronized (localConflicts)
        {
            var conflictData = new HashMap<String, Object>();
            conflictData.put("conflicts", localConflicts);
            conflictJson = JSONSupport.Write.jsonToString.apply(conflictData);
        }
        sink.accept("Conflicts", conflictJson);
    }

    private void emitFactionData(BiConsumer<String, String> sink)
    {
        sink.accept("Faction", "clear");
        synchronized (systemFactions)
        {
            systemFactions.stream()
                .map(JSONSupport.Write.jsonToString)
                .forEach(faction -> sink.accept("Faction", faction));
        }
    }

    public void emitSystemCatalog()
    {
        executeWithLock(() -> globalUpdate.accept("Catalog", "updated"));
    }

    public void emitMissionData()
    {
        emitMissionData(globalUpdate);
    }

    private void emitMissionData(BiConsumer<String, String> sink)
    {
        var json = database.computeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return "";
            var data = new HashMap<String, Object>();
            var missionList = EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .map(MissionData::toMap)
                .collect(Collectors.toList());
            data.put("missions", missionList);
            return JSONSupport.Write.jsonToString.apply(data);
        });

        sink.accept("Missions", json);
    }

    private void emitAllTaskData(BiConsumer<String, String> sink)
    {
        List<TaskSummary> taskSummaries = getTaskSummaries();
        taskSummaries.forEach(taskSummary -> emitTaskData(sink, taskSummary.key, taskSummary.count));
    }

    private void emitTaskData(BiConsumer<String, String> sink, String taskKey, Integer count)
    {
        var data = new HashMap<String, Object>();
        data.put("key", taskKey);
        data.put("count", count);
        if (count > 0)
        {
            var task = taskCatalog.keyMap.get(taskKey);
            var taskdata = determineTaskData(task);
            data.put("name", taskdata.name);
            data.put("costs", taskdata.costs);
            data.put("effects", taskdata.effects);
        }
        var jsonData = JSONSupport.Write.jsonToString.apply(data);
        executeWithLock(() -> sink.accept("Task", jsonData));
    }

    private void emitTouchdownData(BiConsumer<String, String> sink)
    {
        if (touchdownLatitude == -1 || touchdownLongitude == -1 || localCoordinates == null)
        {
            return;
        }

        var touchdownData = new HashMap<String, Object>();
        touchdownData.put("latitude", this.touchdownLatitude);
        touchdownData.put("longitude", this.touchdownLongitude);
        touchdownData.put("name", shipStatistics.get(ShipStat.Ship_Name));

        var dist = calculateDistance(touchdownLongitude, touchdownLatitude);
        var unit = dist < 1000
            ? "m"
            : "km";
        if (unit.equals("km"))
        {
            dist = dist / 1000d;
        }
        dist = UIFunctions.Data.round(dist, 1);
        touchdownData.put("distance", dist);
        touchdownData.put("unit", unit);

        var touchdownJson = JSONSupport.Write.jsonToString.apply(touchdownData);
        executeWithLock(() -> sink.accept("Touchdown", touchdownJson));
    }

    public void emitWaypointData(BiConsumer<String, String> sink)
    {
        if (starSystem == null || nearestBody == null || localCoordinates == null) return;

        var waypointData = database.computeInTransaction(txn ->
        {
            var currentSystem = getStarSystemEntity(txn, starSystem.address);
            if (currentSystem == null) return null;

            var currentBody = EntityUtilities.entityStream(currentSystem.getLinks(EntityKeys.STELLAR_BODY))
                .filter(body -> body.getProperty(EntityKeys.STELLAR_BODY_ID).equals(nearestBody.id))
                .findFirst().orElse(null);

            if (currentBody == null) return null;

            return EntityUtilities.entityStream(currentBody.getLinks(EntityKeys.WAYPOINT))
                .map(waypointEntity ->
                {
                    var waypointMap = new HashMap<String, Object>();
                    var waypointLatitude = ((Double) waypointEntity.getProperty(EntityKeys.WAYPOINT_LATITUDE));
                    var waypointLongitude = ((Double) waypointEntity.getProperty(EntityKeys.WAYPOINT_LONGITUDE));

                    if (waypointLatitude == null || waypointLongitude == null) return null;

                    waypointMap.put("waypointId", waypointEntity.getId().toString());
                    waypointMap.put("name", waypointEntity.getProperty(EntityKeys.WAYPOINT_NAME));
                    waypointMap.put("latitude", waypointLatitude);
                    waypointMap.put("longitude", waypointLongitude);

                    var dist = calculateDistance(waypointLongitude, waypointLatitude);
                    var unit = dist < 1000
                        ? "m"
                        : "km";
                    if (unit.equals("km"))
                    {
                        dist = UIFunctions.Data.round(dist / 1000d, 1);
                    }
                    waypointMap.put("distance", dist);
                    waypointMap.put("unit", unit);

                    return waypointMap;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        });

        if (waypointData != null && !waypointData.isEmpty())
        {
            waypointData.forEach(waypoint->
            {
                String waypointJson = JSONSupport.Write.jsonToString.apply(waypoint);
                executeWithLock(() -> sink.accept("Waypoint", waypointJson));
            });
        }
    }

    /**
     * When a client connects, this is called to ensure the client gets the current state
     * data. Note that after a client is connected, state data must be emitted as it changes
     * in individual events.
     * @param directUpdate the event sink for the newly connected client
     */
    public void emitCurrentState(BiConsumer<String, String> directUpdate)
    {
        executeWithLock(() ->
        {
            // todo: as more state is tracked, this will need to be updated to make sure
            //  all important data is emitted during this call

            commanderStatistics.forEach((statistic, value) ->
                directUpdate.accept(statistic.getName(), value));

            shipStatistics.forEach((statistic, value) ->
                directUpdate.accept(statistic.getName(), value));

            materials.forEach((material, value) ->
                directUpdate.accept("Material", writeMaterialEvent(material, value)));

            directUpdate.accept("Cargo", "Clear");

            cargo.forEach((commodity, value) ->
                directUpdate.accept("Cargo", value.toJson()));

            directUpdate.accept("Loadout", "updated");

            directUpdate.accept("Statistics", "updated");

            directUpdate.accept("Market", "updated");

            directUpdate.accept("Catalog", "updated");

            if (starSystem != null)
            {
                directUpdate.accept("Location", starSystem.systemName);
                directUpdate.accept("Cartography", String.valueOf(starSystem.address));
            }

            if (shipType != null)
            {
                directUpdate.accept("Ship_Data", shipType.toJson());
            }

            if (!currentRoute.isEmpty())
            {
                directUpdate.accept("Route", prepareNavRouteData());
            }

            if (localCoordinates != null)
            {
                directUpdate.accept("Coordinates", JSONSupport.Write.jsonToString.apply(localCoordinates.toMap()));

                if (localSettlement != null)
                {
                    var map = this.localSettlement.toMap();
                    var dist = calculateDistance(this.localSettlement.longitude, this.localSettlement.latitude);
                    var unit = dist < 1000
                        ? "m"
                        : "km";
                    if (unit.equals("km"))
                    {
                        dist = dist / 1000d;
                    }
                    dist = UIFunctions.Data.round(dist, 1);
                    map.put("distance", dist);
                    map.put("unit", unit);
                    directUpdate.accept("Settlement", JSONSupport.Write.jsonToString.apply(map));
                }
            }

            if (!trackedLocation.get().isEmpty())
            {
                var bearing = getBearing();
                if (!bearing.isEmpty())
                {
                    directUpdate.accept("Bearing", bearing);
                }
            }

            if (!systemFactions.isEmpty())
            {
                directUpdate.accept("Faction", "clear");
                emitFactionData(directUpdate);
            }

            if (!localConflicts.isEmpty())
            {
                directUpdate.accept("Conflicts", "clear");
                emitConflictData(directUpdate);
            }

            if (nearestBody != null)
            {
                String bodyData = JSONSupport.Write.jsonToString.apply(nearestBody.toMap());
                directUpdate.accept("ApproachBody", bodyData);
            }

            emitTouchdownData(directUpdate);

            emitWaypointData(directUpdate);

            directUpdate.accept("Engineers", prepareEngineerData());

            directUpdate.accept("CurrentMass", String.valueOf(calculateCurrentMass()));

            directUpdate.accept("PowerStats", calculateCurrentPowerUsage());

            directUpdate.accept("OffenseStats", calculateOffenseStats());

            directUpdate.accept("DefenseStats", calculateDefenseStats());

            emitMissionData(directUpdate);

            emitAllTaskData(directUpdate);

            directUpdate.accept("Task", "materials");

            emitCommunityGoals(directUpdate);

            emitPledgedPower(directUpdate);
        });
    }

    //endregion

    //region Formatting Utils

    private int getMilitarySize()
    {
        return Arrays.stream(shipType.getInternals().getSlots())
            .filter(moduleSize -> moduleSize.name().contains("MILITARY"))
            .map(moduleSize -> moduleSize.intValue)
            .findFirst().orElseThrow();
    }

    private String formatSlotKey(Statistic statistic)
    {
        var rawKey = statistic.getKey();

        if (statistic == CoreInternalSlot.FrameShiftDrive)
        {
            rawKey += "_" + shipType.getCoreModules().frameShiftDrive.intValue;
        }
        else if (statistic == CoreInternalSlot.FuelTank)
        {
            rawKey += "_" + shipType.getCoreModules().fuelTank.intValue;
        }
        else if (statistic == CoreInternalSlot.LifeSupport)
        {
            rawKey += "_" + shipType.getCoreModules().lifeSupport.intValue;
        }
        else if (statistic == CoreInternalSlot.MainEngines)
        {
            rawKey += "_" + shipType.getCoreModules().thrusters.intValue;
        }
        else if (statistic == CoreInternalSlot.PowerDistributor)
        {
            rawKey += "_" + shipType.getCoreModules().powerDistributor.intValue;
        }
        else if (statistic == CoreInternalSlot.PowerPlant)
        {
            rawKey += "_" + shipType.getCoreModules().powerPlant.intValue;
        }
        else if (statistic == CoreInternalSlot.Radar)
        {
            rawKey += "_" + shipType.getCoreModules().sensors.intValue;
        }
        else if (rawKey.startsWith("Military"))
        {
            rawKey += "_Size" + getMilitarySize();
        }

        return rawKey;
    }

    private void addEmptySlots(Map<String, Object> map)
    {
        var optionalCounts = new HashMap<Integer, Integer>();
        var militaryCounts = new HashMap<Integer, Integer>();

        Arrays.stream(shipType.getInternals().getSlots())
            .forEach(moduleSize ->
            {
                if (moduleSize.name().contains("MILITARY"))
                {
                    var current = militaryCounts.computeIfAbsent(moduleSize.intValue, (_k)-> 0) + 1;
                    militaryCounts.put(moduleSize.intValue, current);
                }
                else
                {
                    var current = optionalCounts.computeIfAbsent(moduleSize.intValue, (_k)-> 0) + 1;
                    optionalCounts.put(moduleSize.intValue, current);
                }
            });

        shipModules.forEach((statistic, moduleData)->
        {
            if (statistic.getKey().contains("_Size"))
            {
                var sizeStart = statistic.getKey().indexOf("_");
                var rawSize = statistic.getKey().substring(sizeStart + 5);
                var size = Integer.parseInt(rawSize);
                var left = optionalCounts.get(size) - 1;
                optionalCounts.put(size, left);
            }
            else if (statistic.getKey().contains("Military"))
            {
                var size = getMilitarySize();
                var left = militaryCounts.get(size) - 1;
                militaryCounts.put(size, left);
            }
        });

        militaryCounts.forEach((size, count) -> IntStream.range(0, count)
            .mapToObj(i -> "Empty" + "Military_" + (i + 1) + "_Size" + size)
            .forEach(slot->
            {
                var empty = new HashMap<String, Object>();
                empty.put("name", "[Empty]");
                map.put(slot, empty);
            }));

        optionalCounts.forEach((size, count) -> IntStream.range(0, count)
            .mapToObj(i -> "Empty" + "_" + (i + 1) + "_Size" + size)
            .forEach(slot->
            {
                var empty = new HashMap<String, Object>();
                empty.put("name", "[Empty]");
                map.put(slot, empty);
            }));

        var hardpointCounts = new HashMap<String, Integer>();

        Arrays.stream(shipType.getHardpoints().getSlots())
            .forEach(moduleSize ->
            {
                var current = hardpointCounts.computeIfAbsent(moduleSize.name(), (_k)-> 0) + 1;
                hardpointCounts.put(moduleSize.name(), current);
            });

        shipModules.forEach((statistic, moduleData)->
        {
            if (statistic.getKey().contains("Hardpoint"))
            {
                var hardPointStart = statistic.getKey().indexOf("Hardpoint");
                var rawSize = statistic.getKey().substring(0, hardPointStart);
                var left = hardpointCounts.get(rawSize) - 1;
                hardpointCounts.put(rawSize, left);
            }
        });

        hardpointCounts.forEach((size, count) -> IntStream.range(0, count)
            .mapToObj(i->"Empty_" + size + "Hardpoint" + (i + 1))
            .forEach(slot->
            {
                var empty = new HashMap<String, Object>();
                empty.put("name","[Empty]");
                map.put(slot, empty);
            }));
    }

    //endregion

    public boolean savePoiData(long systemAddress, String poiText)
    {
        return database.computeInTransaction(transaction ->
        {
            var system = getStarSystemEntity(transaction, systemAddress);
            if (system == null) return false;
            var newPoi = transaction.newEntity(EntityKeys.POI_NOTE);
            newPoi.setLink(EntityKeys.STAR_SYSTEM, system);
            system.addLink(EntityKeys.POI_NOTE, newPoi);
            newPoi.setBlobString(EntityKeys.POI_TEXT, poiText);
            return true;
        });
    }

    public boolean deletePoiData(long systemAddress, String poiId)
    {
        return database.computeInTransaction(transaction ->
        {
            var system = getStarSystemEntity(transaction, systemAddress);
            if (system == null) return false;

            String[] parts = poiId.split("-");
            var type = Integer.parseInt(parts[0]);
            var local = Long.parseLong(parts[1]);
            var entityId = new PersistentEntityId(type, local);
            var note = transaction.getEntity(entityId);
            var parent = note.getLink(EntityKeys.STAR_SYSTEM);
            if (parent == null) return false;

            if (parent.getId().equals(system.getId()))
            {
                return system.deleteLink(EntityKeys.POI_NOTE, note)
                    && note.delete();
            }
            return false;
        });
    }

    private List<TaskSummary> getTaskSummaries()
    {
        return database.computeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return Collections.emptyList();

            return EntityUtilities.entityStream(commander.getLinks(EntityKeys.TASK))
                .map(entity ->
                {
                    try
                    {
                        var key = ((String) entity.getProperty(EntityKeys.TASK_KEY));
                        int count = ((Integer) Objects.requireNonNull(entity.getProperty(EntityKeys.TASK_COUNT)));
                        return new TaskSummary(key, count);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        });
    }

    public void completeTask(TaskRecipe recipe)
    {
        var key = taskCatalog.taskMap.get(recipe);
        System.out.println("Key: " + key);
        adjustTask(key, "subtract");
    }

    public boolean adjustTask(String taskKey, String type)
    {
        TaskCatalog.AdjustmentType adjustmentType =
            TaskCatalog.AdjustmentType.fromString(type);

        if (adjustmentType == null)
        {
            return false;
        }

        if (!taskCatalog.keyMap.containsKey(taskKey))
        {
            return false;
        }

        var resultCount = database.computeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return null;

            var taskEntity = EntityUtilities.entityStream(commander.getLinks(EntityKeys.TASK))
                .filter(task -> Objects.equals(task.getProperty(EntityKeys.TASK_KEY), taskKey))
                .findFirst().orElseGet(() ->
                {
                    if (adjustmentType == TaskCatalog.AdjustmentType.SUBTRACT)
                    {
                        return null;
                    }

                    var newTask = txn.newEntity(EntityKeys.TASK);
                    newTask.setLink(EntityKeys.COMMANDER, commander);
                    commander.addLink(EntityKeys.TASK, newTask);
                    newTask.setProperty(EntityKeys.TASK_KEY, taskKey);
                    newTask.setProperty(EntityKeys.TASK_COUNT, 0);
                    return newTask;
                });

            if (taskEntity == null) return null;

            var currentCount = ((Integer) taskEntity.getProperty(EntityKeys.TASK_COUNT));
            if (currentCount == null) return null;

            switch (adjustmentType)
            {
                case ADD:
                    currentCount++;
                    break;

                case SUBTRACT:
                    currentCount--;
                    break;

                case DELETE:
                    currentCount = -1;
                    break;
            }

            if (currentCount < 1)
            {
                commander.deleteLink(EntityKeys.TASK, taskEntity);
                taskEntity.delete();
                return 0;
            }
            else
            {
                taskEntity.setProperty(EntityKeys.TASK_COUNT, currentCount);
                return currentCount;
            }
        });

        if (resultCount == null) return false;

        emitTaskData(globalUpdate, taskKey, resultCount);

        executeWithLock(() -> globalUpdate.accept("Task", "materials"));

        return true;
    }

    //region Complex JSON Object Writers

    public String writeLoadoutJson()
    {
        var map = new HashMap<String, Object>();

        shipModules.forEach((statistic, moduleData) ->
            map.put(formatSlotKey(statistic), moduleData.toJson()));

        addEmptySlots(map);

        return JSONSupport.Write.jsonToString.apply(map);
    }

    public String writeExtendedStatsJson()
    {
        var map = new HashMap<String, Object>();
        map.put("statistics", extendedStats);
        return JSONSupport.Write.jsonToString.apply(map);
    }

    public String writeMarketData()
    {
        return JSONSupport.Write.jsonToString.apply(marketData);
    }

    public String writeCartographicData(long systemAddress)
    {
        return JSONSupport.Write.jsonToString.apply(prepareCartographicData(systemAddress));
    }

    public String writeCatalogList()
    {
        return JSONSupport.Write.jsonToString.apply(prepareCatalogList());
    }

    public String writeTaskCatalog()
    {
        return rawCatalogJson;
    }

    private static class PotentialTrade
    {
        public final String key;
        public final long yield;
        public final long stock;

        private PotentialTrade(String key, long yield, long stock)
        {
            this.key = key;
            this.yield = yield;
            this.stock = stock;
        }
    }

    public String writeTaskMaterials()
    {
        var pendingCosts = new HashMap<Material, Long>();
        var pendingYields = new HashMap<Material, Long>();
        var summaries = getTaskSummaries();
        var costCounts = new HashMap<TaskCost, RunningCostData>();
        summaries.forEach(summary ->
        {
            var recipe = taskCatalog.keyMap.get(summary.key);
            var name = determineTaskData(recipe).name;
            var isTrade = recipe instanceof MaterialTradeRecipe;

            recipe.costStream()
                .filter(costData -> costData.quantity > 0)
                .forEach(costData ->
                {
                    var runningData = costCounts.computeIfAbsent(costData.cost, (_k) -> new RunningCostData());
                    runningData.runningCount.addAndGet(costData.quantity * summary.count);
                    var relatedTask = new RelatedTask(name, summary.count, isTrade);
                    runningData.relatedTasks.add(relatedTask);
                    costCounts.put(costData.cost, runningData);
                    if (isTrade)
                    {
                        var material = ((Material) costData.cost);
                        var yield = Math.abs(costData.quantity) * summary.count;
                        long current = pendingYields.computeIfAbsent(material, (_k) -> 0L);
                        current += yield;
                        pendingCosts.put(material, current);
                    }
                });

            if (isTrade)
            {
                recipe.costStream()
                    .filter(costData -> costData.quantity < 0)
                    .forEach(costData ->
                    {
                        var material = ((Material) costData.cost);
                        var yield = Math.abs(costData.quantity) * summary.count;
                        long current = pendingYields.computeIfAbsent(material, (_k) -> 0L);
                        current += yield;
                        pendingYields.put(material, current);
                    });
            }
        });

        var dataMap = new HashMap<String, Object>();
        costCounts.forEach((cost, count) ->
        {
            long current = 0L;
            var name = cost.getLocalizedName();
            if (cost instanceof Material)
            {
                current = Optional.ofNullable(materials.get(cost))
                    .map(Long::valueOf)
                    .orElse(0L);
            }
            else if (cost instanceof Commodity)
            {
                current = Optional.ofNullable(cargo.get(cost))
                    .map(commodity -> commodity.count)
                    .map(Long::valueOf)
                    .orElse(0L);
            }
            else if (cost instanceof CreditCost)
            {
                current = creditBalance;
                name = "Credits";
            }

            var costDeficit = current >= count.runningCount.get()
                ? 0
                : count.runningCount.get() - current;

            PotentialTrade bestYieldTrade = null;
            PotentialTrade bestStockTrade = null;

            if (costDeficit > 0)
            {
                if (cost instanceof Material)
                {
                    var potentialTrades = new ArrayList<PotentialTrade>();

                    ((Material) cost).getTradeBlueprint()
                        .map(TaskBlueprint::recipeStream)
                        .ifPresent(recipes -> recipes.forEach(recipe ->
                        {
                            var material = new AtomicReference<Material>();
                            var isCommitted = new AtomicBoolean();
                            var yield = recipe.costStream().filter(c -> c.quantity < 0)
                                .map(c-> c.quantity)
                                .map(Math::abs)
                                .findFirst().orElse(0L);

                            long stock = recipe.costStream().filter(c -> c.quantity > 0)
                                .filter(c -> c.cost instanceof Material)
                                .filter(c -> materials.get(c.cost) != null)
                                .peek(c ->
                                {
                                    Optional.ofNullable(costCounts.get(c.cost))
                                        .flatMap(d -> d.relatedTasks.stream()
                                            .filter(zz -> !zz.isTrade)
                                            .findFirst())
                                        .ifPresent(_x -> isCommitted.set(true));
                                })
                                .peek(c -> material.set(((Material) c.cost)))
                                .map(c ->
                                {
                                    var currentStock = materials.get(c.cost);
                                    var pendingStock = pendingCosts.get(c.cost);
                                    if (pendingStock == null)
                                    {
                                        pendingStock = 0L;
                                    }
                                    System.out.println("Pending: " + pendingStock);
                                    return currentStock - pendingStock;
                                })
                                .findFirst().orElse(0L);

                            if (!isCommitted.get() && stock > 0)
                            {
                                var key = taskCatalog.taskMap.get(recipe);
                                potentialTrades.add(new PotentialTrade(key, yield, stock));
                            }
                        }));

                    if (!potentialTrades.isEmpty())
                    {
                        potentialTrades.sort(Comparator
                            .comparingLong((PotentialTrade v)->v.stock)
                            .reversed());
                        var t2 = potentialTrades.get(0);
                        System.out.println("Best stock: " + t2.key
                            + " s= " + t2.stock
                            + " y= " + t2.yield);
                        bestStockTrade = t2;

                        potentialTrades.sort(Comparator
                            .comparingLong((PotentialTrade v)->v.yield)
                            .reversed());
                        var t1 = potentialTrades.get(0);
                        System.out.println("Best yield: " + t1.key
                            + " s= " + t1.stock
                            + " y= " + t1.yield);
                        bestYieldTrade = t1;
                    }
                }
            }


            var costMap = new HashMap<String, Object>();

            var relatedTaskNames = count.relatedTasks.stream()
                .map(RelatedTask::toMap)
                .collect(Collectors.toSet());

            costMap.put("needed", count.runningCount.get());
            costMap.put("deficit", costDeficit);
            costMap.put("related", relatedTaskNames);

            if (cost instanceof Material && pendingYields.containsKey(cost))
            {
                costMap.put("pending", pendingYields.get(cost));
            }

            if (bestStockTrade != null)
            {
                var stockRecipe = taskCatalog.keyMap.get(bestStockTrade.key);
                var data = determineTaskData(stockRecipe);
                var stockMap = new HashMap<String, Object>();
                stockMap.put("key", bestStockTrade.key);
                stockMap.put("name", data.name);
                costMap.put("stockTrade", stockMap);

                if (!bestStockTrade.equals(bestYieldTrade))
                {
                    var yieldRecipe = taskCatalog.keyMap.get(bestYieldTrade.key);
                    var yieldData = determineTaskData(yieldRecipe);
                    var yieldMap = new HashMap<String, Object>();
                    yieldMap.put("key", bestYieldTrade.key);
                    yieldMap.put("name", yieldData.name);
                    costMap.put("yieldTrade", yieldMap);
                }
            }

            dataMap.put(name, costMap);
        });
        return JSONSupport.Write.jsonToString.apply(dataMap);
    }

    private String writeMaterialEvent(Material material, Integer count)
    {
        var event = new HashMap<String, Object>();
        event.put("name", material.name());
        event.put("count", count.toString());
        return JSONSupport.Write.jsonToString.apply(event);
    }

    //endregion

    private TaskData determineModuleTaskData(ModulePurchaseRecipe taskRecipe)
    {
        var baseName = taskRecipe.product.cost.getLocalizedName();

        var size = ((ShipModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.Size)
            .map(d->d.doubleValue)
            .map(Double::intValue)
            .orElse(-1);

        var grade = ((ShipModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.Class)
            .map(d->d.stringValue)
            .orElse("");

        var mount = ((ShipModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.WeaponMode)
            .map(d->d.stringValue)
            .orElse("");

        var isArmour = baseName.endsWith("Armour");

        var sortRank = 0;
        var shipType = "";
        var name = baseName;

        if (isArmour)
        {
            if (baseName.contains("Lightweight"))
            {
                sortRank = 1;
                shipType = baseName.substring(0, baseName.indexOf("Lightweight") - 1);
            }
            else if (baseName.contains("Reinforced"))
            {
                sortRank = 2;
                shipType = baseName.substring(0, baseName.indexOf("Reinforced") - 1);
            }
            else if (baseName.contains("Military"))
            {
                sortRank = 3;
                shipType = baseName.substring(0, baseName.indexOf("Military") - 1);
            }
            else if (baseName.contains("Mirrored"))
            {
                sortRank = 4;
                shipType = baseName.substring(0, baseName.indexOf("Mirrored") - 1);
            }
            else if (baseName.contains("Reactive"))
            {
                sortRank = 5;
                shipType = baseName.substring(0, baseName.indexOf("Reactive") - 1);
            }
        }
        else
        {
            var gradeEffect = 0;
            switch (grade.toUpperCase())
            {
                case "A":
                    gradeEffect = 5;
                    break;

                case "B":
                    gradeEffect = 4;
                    break;

                case "C":
                    gradeEffect = 3;
                    break;

                case "D":
                    gradeEffect = 2;
                    break;

                case "E":
                    gradeEffect = 1;
                    break;
            }

            if (name.toLowerCase().contains("enhanced performance thrusters"))
            {
                gradeEffect += 1;
            }

            sortRank = (size * 10) + gradeEffect;

            name = size + grade + " " + baseName;
            if (!mount.isEmpty())
            {
                name += " [" + mount + "]";
            }
        }

        name = "Purchase - " + name;

        var costs = new ArrayList<Map<String, Object>>();
        var costMap = new HashMap<String, Object>();

        costMap.put("amount", NumberFormat
            .getNumberInstance(Locale.getDefault())
            .format(taskRecipe.price.quantity));

        costMap.put("unit", "Credits");
        costs.add(costMap);

        var effects = ((ShipModule) taskRecipe.product.cost).itemEffects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                return effectMap;
            }).collect(Collectors.toList());

        return new TaskData(name, shipType, sortRank, effects, costs);
    }

    private TaskData determineModificationTaskData(ModificationRecipe modificationRecipe)
    {
        var prefix = taskCatalog.typePrefixes.get(taskCatalog.taskMap.get(modificationRecipe));
        var name = prefix
            + " - " + modificationRecipe.getParentBlueprintName()
            + " - " + modificationRecipe.getShortLabel();
        var sortRank = 0;
        var enumName = modificationRecipe.getName();
        var token = enumName.lastIndexOf("_");
        var grade = enumName.substring(token + 1);
        sortRank = Integer.parseInt(grade);

        var costs = modificationRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = modificationRecipe.effects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();

                var value = effect.getDoubleValue();
                var valueSign = (value > 0) ? "+": "";
                var valueString = valueSign + value;
                var impact = effect.effect.moreIsGood
                    ? value > 0
                        ? "positive"
                        : "negative"
                    : value > 0
                        ? "negative"
                        : "positive";

                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", valueString);
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", impact);
                return effectMap;
            }).collect(Collectors.toList());

        return new TaskData(name, sortRank, effects, costs);
    }

    private TaskData determineExperimentalTaskData(ExperimentalRecipe experimentalRecipe)
    {
        var prefix = taskCatalog.typePrefixes.get(taskCatalog.taskMap.get(experimentalRecipe));

        var name = prefix + " - " + experimentalRecipe.getDisplayLabel();

        var costs = experimentalRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = experimentalRecipe.effects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();

                String valueString;
                String impact;
                if (effect.isNumerical())
                {
                    var value = effect.getDoubleValue();
                    var valueSign = (value > 0)
                        ? "+"
                        : "";

                    valueString = valueSign + value;
                    impact = effect.effect.moreIsGood
                        ? value > 0
                        ? "positive"
                        : "negative"
                        : value > 0
                            ? "negative"
                            : "positive";
                }
                else
                {
                    valueString = effect.stringValue;
                    impact = "positive";
                }

                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", valueString);
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", impact);
                return effectMap;
            }).collect(Collectors.toList());

        return new TaskData(name, 0, effects, costs);
    }

    private TaskData determineTechBrokerTaskData(TechnologyRecipe technologyRecipe)
    {
        var name = "Unlock " + technologyRecipe.getShortLabel();

        var costs = technologyRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = Stream.of(technologyRecipe.getModules())
            .map(module ->
            {
                var size = module.itemEffects()
                    .effectByName(ItemEffect.Size)
                    .map(d->d.doubleValue)
                    .map(Double::intValue)
                    .orElse(-1);

                var grade = module.itemEffects()
                    .effectByName(ItemEffect.Class)
                    .map(d->d.stringValue)
                    .orElse("");

                Map<String, Object> effectMap = new HashMap<>();
                var effect = size + grade + " " + module.displayText();
                effectMap.put("effect", effect);
                effectMap.put("value", "unlock");
                effectMap.put("unit", "");
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var rank = 0;
        if (technologyRecipe.getModules().length == 1)
        {
            var module = technologyRecipe.getModules()[0];
            var size = module.itemEffects()
                .effectByName(ItemEffect.Size)
                .map(d->d.doubleValue)
                .map(Double::intValue)
                .orElse(0);

            var grade = module.itemEffects()
                .effectByName(ItemEffect.Class)
                .map(d->d.stringValue)
                .orElse("");

            var gradeEffect = 0;
            switch (grade.toUpperCase())
            {
                case "A":
                    gradeEffect = 5;
                    break;

                case "B":
                    gradeEffect = 4;
                    break;

                case "C":
                    gradeEffect = 3;
                    break;

                case "D":
                    gradeEffect = 2;
                    break;

                case "E":
                    gradeEffect = 1;
                    break;
            }

            rank = (size * 10) + gradeEffect;
        }

        return new TaskData(name, rank, effects, costs);
    }

    private TaskData determineTradeTaskData(MaterialTradeRecipe tradeRecipe)
    {
        var qty = new AtomicLong(0);
        var priceType = new AtomicReference<MaterialSubCostCategory>(null);
        var yieldType = new AtomicReference<MaterialSubCostCategory>(null);
        var costs = tradeRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                MaterialSubCostCategory.findMatchingSubCategory(costData.cost)
                    .ifPresent(priceType::set);

                Map<String, Object> costMap = new HashMap<>();
                qty.set(costData.quantity);
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = tradeRecipe.costStream()
            .filter(costData -> costData.quantity < 0)
            .map(costData ->
            {
                MaterialSubCostCategory.findMatchingSubCategory(costData.cost)
                    .ifPresent(yieldType::set);

                var abs = Math.abs(costData.quantity);
                var impact = qty.get() < abs
                    ? "positive"
                    : "negative";

                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", costData.cost.getLocalizedName());
                effectMap.put("value", "acquire");
                effectMap.put("unit", abs);
                effectMap.put("impact", impact);
                effectMap.put("grade", costData.cost.getGrade().name());
                return effectMap;
            }).collect(Collectors.toList());

        var rank = qty.intValue();
        if (!Objects.equals(priceType.get(), yieldType.get()))
        {
            rank += 100;
        }

        return new TaskData(tradeRecipe.getDisplayLabel(), rank, effects, costs);
    }

    private TaskData determineSynthesisTaskData(SynthesisRecipe synthesisRecipe)
    {
        var costs = synthesisRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = synthesisRecipe.effects().effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var name = "Synthesize - " + synthesisRecipe.getDisplayLabel();
        var rank = 0;
        if (name.contains("Basic"))
        {
            rank = 1;
        }
        else if (name.contains("Standard"))
        {
            rank = 2;
        }
        else if (name.contains("Premium"))
        {
            rank = 3;
        }
        return new TaskData(name, rank, effects, costs);
    }

    private TaskData determineTaskData(TaskRecipe recipe)
    {
        if (recipe instanceof ModulePurchaseRecipe)
        {
            return determineModuleTaskData(((ModulePurchaseRecipe) recipe));
        }
        if (recipe instanceof ModificationRecipe)
        {
            return determineModificationTaskData(((ModificationRecipe) recipe));
        }
        if (recipe instanceof ExperimentalRecipe)
        {
            return determineExperimentalTaskData(((ExperimentalRecipe) recipe));
        }
        if (recipe instanceof TechnologyRecipe)
        {
            return determineTechBrokerTaskData(((TechnologyRecipe) recipe));
        }
        if (recipe instanceof MaterialTradeRecipe)
        {
            return determineTradeTaskData(((MaterialTradeRecipe) recipe));
        }
        if (recipe instanceof SynthesisRecipe)
        {
            return determineSynthesisTaskData(((SynthesisRecipe) recipe));
        }
        return new TaskData(recipe.getDisplayLabel(), 0);
    }

    @SuppressWarnings("unchecked")
    public String buildTaskCatalog()
    {
        InputStream jsonStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/eng.json");
            jsonStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(jsonStream);

        ((Map<String, Object>) data.get("materials"))
            .forEach((key, value) ->
            {
                TaskCost material = Material.valueOf(key);
                material.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                material.setLocationInformation(String.join("\n", locations));
            });

        ((Map<String, Object>) data.get("commodities"))
            .forEach((key, value) ->
            {
                TaskCost commodity = Commodity.valueOf(key);
                commodity.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                commodity.setLocationInformation(String.join("\n", locations));
            });

        BiConsumer<String, TaskRecipe> addPair = (key, recipe) ->
        {
            var val = taskCatalog.keyMap.get(key);
            if (val == null)
            {
                taskCatalog.keyMap.put(key, recipe);
                taskCatalog.taskMap.put(recipe, key);
            }
            else
            {
                System.err.println("ERROR! " + key + " Already exists!");
            }
        };

        var modules = new HashMap<String, Map<String, Object>>();
        var synthesis = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var modifications = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var experimental = new HashMap<String, Map<String, Map<String, Object>>>();
        var technology = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var trades = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();

        var jsonMap  = new HashMap<String, Object>();
        jsonMap.put("modules", modules);
        jsonMap.put("synthesis", synthesis);
        jsonMap.put("modifications", modifications);
        jsonMap.put("experimental", experimental);
        jsonMap.put("technology", technology);
        jsonMap.put("trades", trades);

        // module purchases
        Stream.of(ModulePurchaseType.values()).forEach(modulePurchaseType ->
            modulePurchaseType.getBluePrints().forEach(taskBlueprint ->
            {
                Map<String, Object> currentBlueprint = modules
                    .computeIfAbsent(taskBlueprint.toString(), (_k) -> new HashMap<>());

                taskBlueprint.recipeStream().map(r -> ((ModulePurchaseRecipe) r)).forEach(taskRecipe ->
                {
                    var key = "Purchase"
                        + ":" + taskBlueprint.toString()
                        + ":" + taskRecipe.getEnumName();

                    addPair.accept(key, taskRecipe);

                    var taskData = determineModuleTaskData(taskRecipe);

                    var dataMap = new HashMap<String, Object>();
                    dataMap.put("key", key);
                    dataMap.put("name", taskData.name);
                    dataMap.put("sort", taskData.rank);
                    dataMap.put("costs", taskData.costs);
                    dataMap.put("effects", taskData.effects);

                    if (!taskData.ship.isEmpty())
                    {
                        dataMap.put("ship", taskData.ship);
                    }

                    currentBlueprint.put(taskRecipe.getEnumName(), dataMap);
                });
            }));

        // synthesis
        Stream.of(SynthesisCategory.values()).forEach(synthesisCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = synthesis
                .computeIfAbsent(synthesisCategory.name(), (_k)-> new HashMap<>());

            synthesisCategory.typeStream().forEach(synthesisType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(synthesisType.name(), (_k)-> new HashMap<>());

                synthesisType.blueprintStream().forEach(synthesisBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(synthesisBlueprint.name(), (_k)-> new HashMap<>());

                    synthesisBlueprint.recipeStream().forEach(synthesisRecipe ->
                    {
                        var key = synthesisCategory.name()
                            + ":" + synthesisType.name()
                            + ":" + synthesisBlueprint.name()
                            + ":" + synthesisRecipe.name();

                        addPair.accept(key, synthesisRecipe);
                        var taskData = determineSynthesisTaskData(synthesisRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);

                        currentBlueprint.put(synthesisRecipe.name(), dataMap);
                    });
                });
            });
        });

        // modifications
        Stream.of(ModificationCategory.values()).forEach(modificationCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = modifications
                .computeIfAbsent(modificationCategory.name(), (_k)-> new HashMap<>());

            modificationCategory.typeStream().forEach(modificationType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(modificationType.name(), (_k)-> new HashMap<>());

                modificationType.blueprintStream().forEach(modificationBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(modificationBlueprint.name(), (_k)-> new HashMap<>());

                    modificationBlueprint.recipeStream().map(r-> ((ModificationRecipe) r)).forEach(modificationRecipe ->
                    {
                        var key = "Modification"
                            + ":" + modificationCategory.name()
                            + ":" + modificationType.getName()
                            + ":" + modificationBlueprint.name()
                            + ":" + modificationRecipe.getName();

                        addPair.accept(key, modificationRecipe);
                        taskCatalog.typePrefixes.put(key, modificationType.toString());

                        var taskData = determineModificationTaskData(modificationRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);

                        currentBlueprint.put(modificationRecipe.getName(), dataMap);
                    });
                });
            });
        });

        // experimental effects
        Stream.of(ExperimentalCategory.values()).forEach(experimentalCategory ->
        {
            Map<String, Map<String, Object>> currentCategory = experimental
                .computeIfAbsent(experimentalCategory.name(), (_k)-> new HashMap<>());

            experimentalCategory.typeStream().forEach(experimentalType ->
            {
                Map<String, Object> currentType = currentCategory
                    .computeIfAbsent(experimentalType.name(), (_k)-> new HashMap<>());

                experimentalType.blueprintStream().forEach(experimentalBlueprint ->
                    experimentalBlueprint.recipeStream().map(e-> ((ExperimentalRecipe) e))
                        .forEach(experimentalRecipe ->
                        {
                            var key = "Experimental"
                                + ":" + experimentalCategory.name()
                                + ":" + experimentalType.getName()
                                + ":" + experimentalRecipe.getName();

                            addPair.accept(key, experimentalRecipe);
                            taskCatalog.typePrefixes.put(key, experimentalType.toString());

                            var taskData = determineExperimentalTaskData(experimentalRecipe);

                            var dataMap = new HashMap<String, Object>();
                            dataMap.put("key", key);
                            dataMap.put("name", taskData.name);
                            dataMap.put("sort", taskData.rank);
                            dataMap.put("costs", taskData.costs);
                            dataMap.put("effects", taskData.effects);

                            currentType.put(experimentalRecipe.getName(), dataMap);
                        }));
            });
        });

        // technology unlocks
        Stream.of(TechnologyCategory.values()).forEach(technologyCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = technology
                .computeIfAbsent(technologyCategory.name(), (_k)-> new HashMap<>());

            technologyCategory.typeStream().forEach(technologyType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(technologyType.name(), (_k)-> new HashMap<>());

                technologyType.blueprintStream().forEach(technologyBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(technologyBlueprint.name(), (_k)-> new HashMap<>());

                    technologyBlueprint.recipeStream().forEach(technologyRecipe ->
                    {
                        var key = "Unlock"
                            + ":" + technologyCategory.name()
                            + ":" + technologyType.getName()
                            + ":" + technologyBlueprint.name()
                            + ":" + technologyRecipe.getName();

                        addPair.accept(key, technologyRecipe);

                        var taskData = determineTechBrokerTaskData(technologyRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);
                        currentBlueprint.put(technologyRecipe.getName(), dataMap);
                    });
                });
            });
        });

        // todo: engineer unlocks

        // trades
        Stream.of(MaterialTradeType.values()).forEach(materialTradeType ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = trades
                .computeIfAbsent(materialTradeType.name(), (_k)-> new HashMap<>());

            materialTradeType.subCategoryStream().forEach(materialSubCostCategory ->
            {
                Map<String, Map<String, Object>> currentSubType = currentCategory
                    .computeIfAbsent(materialSubCostCategory.name(), (_k)-> new HashMap<>());

                materialSubCostCategory.materials().forEach(material ->
                {
                    material.getTradeBlueprint().ifPresent(materialTradeBlueprint ->
                    {
                        Map<String, Object> currentBlueprint = currentSubType
                            .computeIfAbsent(materialTradeBlueprint.toString(), (_k)-> new HashMap<>());

//                        System.out.println(((MaterialTradeBlueprint) materialTradeBlueprint)
//                            .material.getGrade().getNumericalValue());

//                        currentBlueprint.put("grade", ((MaterialTradeBlueprint) materialTradeBlueprint)
//                            .material.getGrade().getNumericalValue());

                        materialTradeBlueprint.recipeStream().map(r-> ((MaterialTradeRecipe) r))
                            .forEach(materialTradeRecipe ->
                            {
                                var key = "Trade"
                                    + ":" + materialTradeType.getName()
                                    + ":" + materialSubCostCategory.name()
                                    + ":" + materialTradeBlueprint.toString()
                                    + ":" + materialTradeRecipe.getName();

                                addPair.accept(key, materialTradeRecipe);

                                var taskData = determineTradeTaskData(materialTradeRecipe);

                                var dataMap = new HashMap<String, Object>();
                                dataMap.put("key", key);
                                dataMap.put("name", taskData.name);
                                dataMap.put("sort", taskData.rank);
                                dataMap.put("costs", taskData.costs);
                                dataMap.put("effects", taskData.effects);
                                currentBlueprint.put(materialTradeRecipe.getName(), dataMap);
                            });
                    });
                });
            });
        });

        return JSONSupport.Write.jsonToString.apply(jsonMap);
    }
}
