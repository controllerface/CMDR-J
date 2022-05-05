package com.controllerface.cmdr_j.classes.core;

import com.controllerface.cmdr_j.classes.data.*;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.engineers.KnownEngineer;
import com.controllerface.cmdr_j.enums.equipment.modules.*;
import com.controllerface.cmdr_j.enums.equipment.suits.SuitGearSlot;
import com.controllerface.cmdr_j.utilities.JSONSupport;
import com.controllerface.cmdr_j.interfaces.Procedure;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.commander.Statistic;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.utilities.database.EntityKeys;
import com.controllerface.cmdr_j.utilities.database.EntityUtilities;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipType;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.utilities.UIFunctions;
import jetbrains.exodus.entitystore.*;

import java.time.Duration;
import java.time.Instant;
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
    /**
     * Held when emitting events to ensure data consistency.
     */
    private final Lock stateLock = new ReentrantLock(true);

    /**
     * Name of the directory where the database will be written. If not already present, it
     * will be created. The path is relative to the current user's home directory and will be
     * written within the program's CMDR_J directory.
     */
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
     * Catalog of all possible tasks that a user can plan and track progress towards in the UI.
     */
    private final TaskCatalog taskCatalog = new TaskCatalog();

    /**
     * The task catalog is built at construction time, as the buildTaskCatalog() method
     * is called, but the return value is actually the raw JSON representation of that
     * catalog. This is done for efficiency as the catalog itself is quite large and
     * may be requested multiple times, so serializing it more than once is just wasteful.
     */
    private final String rawCatalogJson = taskCatalog.buildTaskCatalog();

    /**
     * In addition to the catalog itself, cost associations (i.e. the list of things each item can be used
     * for) are also pre-calculated. These values are static and do not change so are best to calculate once.
     */
    private final String rawCostAssociations = calculateRawCostAssociations(taskCatalog);

    /**
     * Base stats about the currently loaded commander, including the commander's name, credits
     * and other game stats. Updated frequently during gameplay.
     */
    private final Map<Statistic, String> commanderStats = new HashMap<>();

    /**
     * Extended stats about the currently loaded commander, includes information like total play time,
     * amount spent on various items or income from various activities. Updated only on startup.
     */
    private final Map<String, Map<String, String>> extendedStats = new HashMap<>();

    /**
     * Describes the current commander's status with all known engineers. Current status with all engineers
     * is summarized on startup, but data for an individual engineer may be update during gameplay.
     */
    private final Map<KnownEngineer, Map<String, Object>> engineerProgress = new HashMap<>();

    /**
     * Base stats about the current commander's current ship, includes information like ship name, make,
     * and model. Updated during gameplay when player changes ships.
     */
    private final Map<Statistic, String> shipStats = new HashMap<>();

    /**
     * Data describing the loadout of the player's current ship, including weapons and core/optional modules.
     */
    private final Map<Statistic, ShipModuleData> shipModules = new HashMap<>();

    /**
     * Data describing the loadout of the player's current suit, including weapons and optionally their modifications.
     */
    private final Map<Statistic, SuitModuleData> suitModules = new HashMap<>();


    /**
     * Player's crafting material inventory.
     */
    private final Map<Material, Integer> materials = new HashMap<>();

    private final Map<Consumable, Integer> consumables = new HashMap<>();

    /**
     * Player's current cargo inventory, stored in their current ship.
     */
    private final Map<Commodity, CommodityData> cargo = new HashMap<>();

    /**
     * Information about the commodity market at the currently docked station or outpost, if available.
     * Data is cleared when undocking.
     */
    private final Map<String, Object> commodityMarketData = new HashMap<>();

    /**
     * Information about the modules for sale in the outfitting menu at the currently docked station or outpost,
     * if available. Data is cleared when undocking.
     */
    private final Map<String, Object> outfittingMarketData = new HashMap<>();

    /**
     * Information about the ships for sale in the shipyard menu at the currently docked station or outpost,
     * if available. Data is cleared when undocking.
     */
    private final Map<String, Object> shipyardMarketData = new HashMap<>();

    /**
     * When a route has been plotted on the galaxy map, contains the route as a series of ordered route entries.
     */
    private final List<RouteEntry> currentRoute = new ArrayList<>();

    /**
     * When in a populated star system, this contains information on the local factions. Updates up exit from
     * hyperspace and on game load.
     */
    private final List<Map<String, Object>> systemFactions = new ArrayList<>();

    /**
     * When in a populated star system, this contains information on any ongoing conflicts that may be active.
     * Updates up exit from hyperspace and on game load.
     */
    private final List<Map<String, Object>> localConflicts = new ArrayList<>();

    /**
     * If the player is on the surface of a planet and has selected a waypoint or other surface point to
     * track, this will contain the opaque, unique ID referencing that location within the DB. If the
     * tracked location is the player's last known ship location or a settlement, the value will not be
     * a database ID but some other string describing the tracked location.
     */
    private final AtomicReference<String> trackedLocation = new AtomicReference<>("");

    /**
     * If the player is currently participating in any community goals, this will contain information
     * describing those goals. In general, this data updates whenever teh player checks the CG status
     * from a station mission board. However, the game is not always consistent in this behavior and
     * will sometimes not emit the required event when doing this. Also, sometimes the game will just
     * randomly update the data and emit the event.
     */
    private final List<Map<String, Object>> communityGoals = new ArrayList<>();

    private String commanderName = "";
    private String dockedLocation = "";
    private long creditBalance = 0;
    private double currentFuel = 0;
    private double currentReserveFuel = 0;
    private int cargoCapacity = 0;

    private String suitType;
    private ShipType shipType;
    private StarSystem starSystem;
    private StellarBody nearestBody;
    private PledgedPower pledgedPower;

    private double touchdownLatitude = -1;
    private double touchdownLongitude = -1;

    private LocalCoordinates localCoordinates;
    private SettlementLocation localSettlement;

    private VehicleState vehicleState = VehicleState.UNKNOWN;

    //region Filters and Comparators

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

    //endregion

    //region Internal Classes

    public enum VehicleState
    {
        STARSHIP,
        SRV,
        SPACESUIT,
        UNKNOWN,
        ;
    }

    public static class StatGroup
    {
        public Double calculatedValue = 0.0;
        public Double rawValue = 0.0;
        public Double baseValue = 0.0;
        public Double boostValue = 0.0;
        public Double baseMultiplier = 0.0;
        public Double boostMultiplier = 0.0;
        public Double minmax = 0.0;
    }

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
        final long id;

        private CommodityData(String name, Integer count, ItemGrade grade, long id)
        {
            this.name = name;
            this.count = count;
            this.grade = grade;
            this.id = id;
        }

        private CommodityData adjustAndClone(Integer adjustment)
        {
            return new CommodityData(name, count + adjustment, grade, id);
        }

        String toJson()
        {
            Map<String, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("id", id);
            data.put("count", count);
            data.put("type", grade.name().toLowerCase());
            return JSONSupport.Write.jsonToString.apply(data);
        }
    }

    public static class TaskData
    {
        public final String name;
        public final String ship;
        public final Integer rank;
        public final List<Map<String, Object>> effects;
        public final List<Map<String, Object>> costs;
        public final List<Map<String, Object>> engineers;

        public TaskData(String name,
                         String ship,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs,
                         List<Map<String, Object>> engineers)
        {
            this.name = name;
            this.ship = ship;
            this.rank = rank;
            this.effects = effects;
            this.costs = costs;
            this.engineers = engineers;
        }

        public TaskData(String name,
                         String ship,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs)
        {
            this(name, ship, rank, effects, costs, Collections.emptyList());
        }

        public TaskData(String name,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs,
                         List<Map<String, Object>> engineers)
        {
            this(name, "", rank, effects, costs, engineers);
        }

        public TaskData(String name,
                         Integer rank,
                         List<Map<String, Object>> effects,
                         List<Map<String, Object>> costs)
        {
            this(name, "", rank, effects, costs, Collections.emptyList());
        }

        public TaskData(String name, Integer rank)
        {
            this(name, "", rank,
                Collections.emptyList(),
                Collections.emptyList(),
                Collections.emptyList());
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

    //endregion

    public GameState(BiConsumer<String, String> globalUpdate)
    {
        this.globalUpdate = globalUpdate;

        this.database = PersistentEntityStores
            .newInstance(UIFunctions.DATA_FOLDER + DATABASE_DIRECTORY);

//        database.executeInTransaction(txn ->
//        {
//            EntityUtilities.entityStream(txn.getAll(EntityKeys.TASK))
//                .forEach(task->
//                {
//                    task.getLinkNames().forEach(n-> System.out.println("link" + n));
//                    var c = task.getLink(EntityKeys.COMMANDER);
//                    c.deleteLink(EntityKeys.TASK, task);
//                    task.delete();
//                });
//        });

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

    /**
     * this constructor is used for testing purposes only.
     *
     * @param dbDirectory directory to use for DB data used during test
     */
    public GameState(String dbDirectory)
    {
        this.globalUpdate = (a, b) ->
            System.out.println("event: " + a + " data: " + b);

        this.database = PersistentEntityStores
            .newInstance(UIFunctions.DATA_FOLDER + dbDirectory);
    }

    /**
     * Used to guard event emission for thread safety.
     *
     * @param procedure event emission procedure to execute
     */
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

    //region Commander Stats

    public void adjustCreditBalance(long adjustment)
    {
        creditBalance += adjustment;
        var balance = String.valueOf(creditBalance);
        commanderStats.put(CommanderStat.Credits, balance);
        executeWithLock(() -> globalUpdate.accept(CommanderStat.Credits.getName(), balance));
        executeWithLock(() -> globalUpdate.accept("Task", "materials"));
        emitAllTaskData(globalUpdate);
    }

    public void setCommanderStat(Statistic statistic, String value)
    {
        executeWithLock(() ->
        {
            commanderStats.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
            updateInternalState(statistic, value);
        });
    }

    public void setExtendedStats(String category, Map<String, String> stats)
    {
        extendedStats.put(category, stats);
    }

    public void setEngineerProgress(KnownEngineer knownEngineer, Map<String, Object> data)
    {
        if (starSystem != null)
        {
            data.put("distance", knownEngineer.getLocation().distanceBetween(starSystem));
        }
        engineerProgress.put(knownEngineer, data);
    }

    private void updateInternalState(Statistic statistic, String value)
    {
        // player

        if (statistic instanceof CommanderStat)
        {
            if (statistic == CommanderStat.Commander)
            {
                commanderName = commanderStats.get(CommanderStat.Commander);
                database.executeInTransaction(this::ensureCommanderExists);
            }

            if (statistic == CommanderStat.Credits)
            {
                creditBalance = Long.parseLong(value.replace(",",""));
                emitAllTaskData(globalUpdate);
            }
        }

//        if (statistic instanceof RankStat)
//        {
//            // ignore for now
//        }

        // ship

        if (statistic instanceof ShipStat)
        {
            if (statistic == ShipStat.Fuel_Level)
            {
                currentFuel = Double.parseDouble(value.replace(",",""));
            }

            if (statistic == ShipStat.ReserveLevel)
            {
                currentReserveFuel = Double.parseDouble(value.replace(",",""));
            }

//            if (statistic == ShipStat.ReserveCapacity)
//            {
//                // todo: parse value
//            }
//
//            if (statistic == ShipStat.Fuel_Capacity)
//            {
//                // todo: parse value
//            }

            if (statistic == ShipStat.CargoCapacity)
            {
                cargoCapacity = Integer.parseInt(value.replace(",",""));
            }

            if (statistic == ShipStat.Ship)
            {
                shipType = ShipType.findShip(value).orElse(null);
                if (shipType == null)
                {
                    suitType = SpaceSuit.findModule(value)
                        .map(SpaceSuit::getName)
                        .orElse(null);

                    if (suitType == null)
                    {
                        System.err.println("Could not determine ship or suit type: " + value);
                    }
                    else
                    {
                        executeWithLock(() -> globalUpdate.accept("Suit_Data", suitType));
                    }
                }
                else
                {
                    executeWithLock(() -> globalUpdate.accept("Ship_Data", shipType.toJson()));
                }
            }
        }
    }

    public void setVehicleState(VehicleState vehicleState)
    {
        this.vehicleState = vehicleState;
    }

    //endregion

    //region Ship Stats and Loadout

    public void setShipStat(Statistic statistic, String value)
    {
        executeWithLock(() ->
        {
            shipStats.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
            updateInternalState(statistic, value);
        });
    }

    public void updateMainFuelLevel(double fuelLevel)
    {
        currentFuel = fuelLevel;
        var fuelString = String.valueOf(currentFuel);
        shipStats.put(ShipStat.Fuel_Level, fuelString);
        executeWithLock(() -> globalUpdate.accept(ShipStat.Fuel_Level.getName(), fuelString));
    }

    public void updateFuelLevels(double main, double reservoir)
    {
        updateMainFuelLevel(main);

        currentReserveFuel = reservoir;
        var reservoirString = String.valueOf(currentReserveFuel);
        shipStats.put(ShipStat.ReserveLevel, reservoirString);
        executeWithLock(() -> globalUpdate.accept(ShipStat.ReserveLevel.getName(), reservoirString));
    }

    public void refillFuel()
    {
        currentFuel = Double.parseDouble(shipStats.get(ShipStat.Fuel_Capacity));
        currentReserveFuel = Double.parseDouble(shipStats.get(ShipStat.ReserveCapacity));
        shipStats.put(ShipStat.Fuel_Level, shipStats.get(ShipStat.Fuel_Capacity));
        shipStats.put(ShipStat.ReserveLevel, shipStats.get(ShipStat.ReserveCapacity));
        executeWithLock(() -> globalUpdate.accept(ShipStat.Fuel_Level.getName(), String.valueOf(currentFuel)));
        executeWithLock(() -> globalUpdate.accept(ShipStat.ReserveLevel.getName(), String.valueOf(currentReserveFuel)));
    }

    public void clearShipModules()
    {
        shipModules.clear();
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



    public void clearSuitModules()
    {
        suitModules.clear();
    }

    public void setSuitModule(Statistic moduleSlot, SuitModuleData suitModuleData)
    {
        suitModules.put(moduleSlot, suitModuleData);
    }



    private ShipModuleData findShieldGenerator()
    {
        return shipModules.values().stream()
            .filter(moduleData -> moduleData.module.modificationType() == ModificationType.Shield_Generator)
            .findFirst()
            .orElse(null);
    }

    //endregion

    //region Missions

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

    public void expireOldMissions(Set<Long> retain)
    {
        database.executeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return;

            //noinspection SuspiciousMethodCalls
            EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .filter(entity -> !retain.contains(entity.getProperty("missionID")))
                .forEach(mission ->
            {
                commander.deleteLink(EntityKeys.MISSION, mission);
                mission.delete();
            });
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
        executeWithLock(() -> globalUpdate.accept("Missions", "clear"));
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

    public void redirectMission(long missionID, String newSystem, String newStation)
    {
        database.executeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return;

            var mission = EntityUtilities.entityStream(commander.getLinks(EntityKeys.MISSION))
                .filter(entity -> Objects.equals(entity.getProperty("missionID"), missionID))
                .findFirst().orElse(null);

            if (mission == null)
            {
                // can happen if the mission has been completed and the the app reloads
                return;
            }

            var details = JSONSupport.Parse.jsonString.apply(mission.getBlobString("details"));
            details.put("NewDestinationSystem", newSystem);
            details.put("NewDestinationStation", newStation);
            var detailJson = JSONSupport.Write.jsonToString.apply(details);
            mission.setBlobString("details", detailJson);
        });

        executeWithLock(() -> emitMissionData(globalUpdate));
    }

    //endregion

    //region Powerplay Status

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

    //endregion

    //region Cargo Methods

    public void clearCargo()
    {
        cargo.clear();
        executeWithLock(() -> globalUpdate.accept("Cargo","Clear"));
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

    public void adjustCargoCount(Commodity commodity, Integer adjustment)
    {
        var commodityData = cargo.computeIfPresent(commodity,
            (k, data) -> data.adjustAndClone(adjustment));

        if (commodityData == null)
        {
            if (adjustment > 0)
            {
                commodityData = new CommodityData(commodity.getLocalizedName(),
                    adjustment,
                    commodity.getGrade(),
                    commodity.id);
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
        executeWithLock(() -> globalUpdate.accept("Task", "materials"));
        emitAllTaskData(globalUpdate);
    }

    public void setCargoCount(Commodity commodity, String name, Integer count)
    {
        var commodityData = new CommodityData(name, count, commodity.getGrade(), commodity.id);
        cargo.put(commodity, commodityData);
        var jsonData = commodityData.toJson();
        executeWithLock(() -> globalUpdate.accept("Cargo", jsonData));
        emitAllTaskData(globalUpdate);
    }

    public void setConsumableCount(Consumable consumable, Integer count)
    {
        consumables.put(consumable, count);
        executeWithLock(() -> globalUpdate.accept("Consumable", writeConsumableEvent(consumable, count)));
    }

    public void adjustConsumableCount(Consumable consumable, Integer count)
    {
        var currentCount = consumables.computeIfPresent(consumable, (k, c) -> c + count);
        if (currentCount == null)
        {
            if (count > 0)
            {
                consumables.put(consumable, count);
                currentCount = count;
            }
            else return;
        }
        var newCount = currentCount;
        executeWithLock(() -> globalUpdate.accept("Consumable", writeConsumableEvent(consumable, newCount)));
    }

    //endregion

    //region Galactic and System Location Information

    public void setCurrentRoute(List<RouteEntry> route)
    {
        currentRoute.clear();
        currentRoute.addAll(route);
        var routeData = prepareNavRouteData();
        executeWithLock(() -> globalUpdate.accept("Route", routeData));
    }

    public void setLocation(StarSystem starSystem)
    {
        this.nearestBody = null;
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
        emitAllTaskData(globalUpdate);
    }

    public void approachBody(StellarBody stellarBody)
    {
        nearestBody = stellarBody;
        String bodyData = JSONSupport.Write.jsonToString.apply(nearestBody.toMap());
        executeWithLock(() -> globalUpdate.accept("ApproachBody", bodyData));
        emitWaypointData(globalUpdate);
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

    public void dock(String dockedLocation)
    {
        this.dockedLocation = dockedLocation;
        executeWithLock(() -> globalUpdate.accept("Docked", this.dockedLocation));
    }

    public void undock()
    {
        dockedLocation = "";
        commodityMarketData.clear();
        outfittingMarketData.clear();
        shipyardMarketData.clear();
        emitMarketEvent();
        emitOutfittingEvent();
        emitShipyardEvent();
        executeWithLock(() -> globalUpdate.accept("Undocked", "undocked"));
    }

    public int findBodyId(String bodyName)
    {
        return database.computeInTransaction(txn ->
        {
            var currentSystem = getStarSystemEntity(txn, starSystem.address);
            if (currentSystem == null)
            {
                return -1;
            }

            var stellarBody = EntityUtilities.entityStream(currentSystem.getLinks(EntityKeys.STELLAR_BODY))
                .filter(entity -> Objects.equals(entity.getProperty(EntityKeys.STELLAR_BODY_NAME), bodyName))
                .findFirst()
                .orElse(null);

            if (stellarBody == null)
            {
                return -1;
            }
            return Optional.ofNullable(stellarBody.getProperty(EntityKeys.STELLAR_BODY_ID))
                .map(c-> ((int) c)).orElse(-1);
        });
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
        database.executeInTransaction(txn ->
        {
            var systemEntity = getStarSystemEntity(txn, stellarBody.address);
            if (systemEntity == null)
            {
                // todo: log an error: unexpected missing system during scan
                return;
            }

            var bodies = txn.find(EntityKeys.STELLAR_BODY, EntityKeys.STELLAR_BODY_ID, stellarBody.id);
            var bodyEntity = EntityUtilities.entityStream(bodies)
                .filter(body ->
                {
                    var linkedSystem = body.getLink(EntityKeys.STAR_SYSTEM);
                    if (linkedSystem == null) return false;
                    return linkedSystem.getId().compareTo(systemEntity.getId()) == 0;
                })
                .findFirst().orElseGet(() ->
                {
                    var newBody = txn.newEntity(EntityKeys.STELLAR_BODY);
                    newBody.setLink(EntityKeys.STAR_SYSTEM, systemEntity);
                    systemEntity.addLink(EntityKeys.STELLAR_BODY, newBody);
                    return newBody;
                });
            stellarBody.storeBodyData(bodyEntity);
        });
    }

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

    //endregion

    //region Market Info (Commodities, Outfitting, Shipyard)

    public void setOutfittingData(Map<String, Object> outfittingData)
    {
        this.outfittingMarketData.clear();
        this.outfittingMarketData.putAll(outfittingData);
        database.executeInTransaction(txn -> updateMarketData(txn, outfittingData));
    }

    public void setShipyardData(Map<String, Object> shipyardData)
    {
        this.shipyardMarketData.clear();
        this.shipyardMarketData.putAll(shipyardData);
        database.executeInTransaction(txn -> updateMarketData(txn, shipyardData));
    }

    public void setCommodityMarketData(Map<String, Object> commodityData)
    {
        this.commodityMarketData.clear();
        this.commodityMarketData.putAll(commodityData);
        database.executeInTransaction(txn -> updateMarketData(txn, commodityData));
    }

    private void updateMarketData(StoreTransaction txn, Map<String, Object> marketData)
    {
        var commander = getCommanderEntity(txn);
        var system = getStarSystemEntity(txn, starSystem.address);
        if (commander == null || system == null) return;

        var market = EntityUtilities.entityStream(commander.getLinks(EntityKeys.MARKET))
            .filter(stellarBody -> Objects.equals(stellarBody.getProperty(EntityKeys.MARKET_ID), marketData.get("marketId")))
            .findFirst().orElseGet(()->
            {
                var newMarket = txn.newEntity(EntityKeys.MARKET);
                newMarket.setLink(EntityKeys.COMMANDER, commander);
                newMarket.setLink(EntityKeys.STAR_SYSTEM, system);
                newMarket.setProperty(EntityKeys.MARKET_ID, ((Number) marketData.get("marketId")).longValue());
                commander.addLink(EntityKeys.MARKET, newMarket);
                return newMarket;
            });

        mapToEntity(marketData, market);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> queryMarketData(long itemId, long price, boolean export, boolean difference)
    {
        return database.computeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return Collections.emptyList();

            var typeKey = export
                ? "exports"
                : "imports";

            return EntityUtilities.entityStream(commander.getLinks(EntityKeys.MARKET))
                .map(mkt ->
                {
                    var systemEntity = mkt.getLink(EntityKeys.STAR_SYSTEM);
                    if (systemEntity == null)
                    {
                        // todo: log an error: missing system
                        return Collections.emptyMap();
                    }
                    var sys = StarSystem.unstoreSystemData(systemEntity);
                    if (sys == null)
                    {
                        // todo: log an error: malformed system data
                        return Collections.emptyMap();
                    }

                    var mktMap = entityToMap(mkt);

                    var current = Optional.ofNullable(commodityMarketData.get("marketId"))
                        .orElse(-1);
                    var checking = mktMap.get(EntityKeys.MARKET_ID);
                    if (current.equals(checking))
                    {
                        return Collections.emptyMap();
                    }

                    var commodities = ((Map<String, Map<String, Object>>) mktMap.get(typeKey));
                    if (commodities == null)
                    {
                        return Collections.emptyMap();
                    }

                    var item = commodities.values().stream()
                        .flatMap(t -> t.values().stream())
                        .map(i -> ((Map<String, Object>) i))
                        .filter(commodity -> ((Number) commodity.get("itemId")).longValue() == itemId)
                        .findFirst().orElse(Collections.emptyMap());

                    if (item.isEmpty())
                    {
                        return Collections.emptyMap();
                    }

                    var time = Instant.parse(((String) mktMap.get("timestamp")));

                    var age = Duration.between(time, Instant.now());
                    var ts = UIFunctions.Format.secondsToTimeString(age.toSeconds());

                    var thisPrice = ((Number) item.get("price")).longValue();
                    var impact = "";
                    if (difference)
                    {
                        var diff = thisPrice - price;
                        item.put("comparison", diff);
                        if (export)
                        {
                            if (diff < 0 )
                            {
                                impact = "positive";
                            }
                            else if (diff > 0 )
                            {
                                impact = "negative";
                            }
                        }
                        else
                        {
                            if (diff > 0 )
                            {
                                impact = "positive";
                            }
                            else if (diff < 0 )
                            {
                                impact = "negative";
                            }
                        }
                    }
                    else
                    {
                        var income = 0L;
                        if (export)
                        {
                            income = price - thisPrice;
                        }
                        else
                        {
                            income = thisPrice - price;
                        }
                        item.put("comparison", income);
                        if (income > 0)
                        {
                            impact = "positive";
                        }
                        else if (income < 0)
                        {
                            impact = "negative";
                        }
                    }

                    item.put("impact", impact);
                    item.put("age", ts);
                    item.put("system", sys.systemName);
                    item.put("market", mktMap.get("name"));
                    item.put("distance", starSystem.distanceBetween(sys));
                    return item;
                })
                .filter(m->!m.isEmpty())
                .map(f -> ((Map<String, Object>) f))
                .collect(Collectors.toList());
        });
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> queryItemData(long itemId)
    {
        return database.computeInTransaction(txn ->
        {
            var commander = getCommanderEntity(txn);
            if (commander == null) return Collections.emptyList();

            var categoryKey = determineCategoryKey(itemId);
            if (categoryKey.isEmpty())
            {
                return Collections.emptyList();
            }

            return EntityUtilities.entityStream(commander.getLinks(EntityKeys.MARKET))
                .map(market ->
                {
                    var systemEntity = market.getLink(EntityKeys.STAR_SYSTEM);
                    if (systemEntity == null)
                    {
                        return Collections.emptyMap();
                    }

                    var starSystem = StarSystem.unstoreSystemData(systemEntity);
                    if (starSystem == null)
                    {
                        return Collections.emptyMap();
                    }

                    var marketMap = entityToMap(market);

                    var itemCategory = ((Map<String, Map<String, Object>>) marketMap.get(categoryKey));
                    if (itemCategory == null)
                    {
                        return Collections.emptyMap();
                    }

                    Map<String, Object> item;

                    switch (categoryKey)
                    {
                        case "exports":
                            item = itemCategory.values().stream()
                                .flatMap(commodityType -> commodityType.values().stream())
                                .map(rawCommodity -> ((Map<String, Object>) rawCommodity))
                                .filter(commodityMap -> ((Number) commodityMap.get("itemId")).longValue() == itemId)
                                .findFirst()
                                .orElse(Collections.emptyMap());
                            break;

                        case "ships":
                            item = itemCategory.values().stream()
                                .filter(x-> ((Number) x.get("itemId")).longValue() == itemId)
                                .findFirst()
                                .orElse(Collections.emptyMap());
                            break;

                        case "modules":
                            item = itemCategory.values().stream()
                                .flatMap(type -> type.values().stream())
                                .map(modules -> ((Map<String, Object>) modules))
                                .filter(x-> ((Number) x.get("itemId")).longValue() == itemId)
                                .findFirst()
                                .orElse(Collections.emptyMap());
                            break;

                        default:
                            item = Collections.emptyMap();
                    }

                    if (item.isEmpty())
                    {
                        return Collections.emptyMap();
                    }

                    var time = Instant.parse(((String) marketMap.get("timestamp")));

                    var age = Duration.between(time, Instant.now());
                    var timeString = UIFunctions.Format.secondsToTimeString(age.toSeconds());

                    item.put("age", timeString);
                    item.put("system", starSystem.systemName);
                    item.put("market", marketMap.get("name"));
                    item.put("distance", this.starSystem.distanceBetween(starSystem));
                    return item;
                })
                .filter(itemData -> !itemData.isEmpty())
                .map(itemData -> ((Map<String, Object>) itemData))
                .collect(Collectors.toList());
        });
    }

    //endregion

    //region Community Goals

    private void emitCommunityGoals(BiConsumer<String, String> sink)
    {
        sink.accept("CommunityGoal", "clear");
        communityGoals.forEach(goal->
        {
            var json = JSONSupport.Write.jsonToString.apply(goal);
            sink.accept("CommunityGoal", json);
        });
    }

    public void finishCommunityGoal(int goalId)
    {
        var remaining = this.communityGoals.stream()
            .filter(goal -> ((Number) goal.get("CGID")).intValue() != goalId)
            .collect(Collectors.toList());

        setCommunityGoals(remaining);
    }

    public void setCommunityGoals(List<Map<String, Object>> communityGoals)
    {
        this.communityGoals.clear();
        this.communityGoals.addAll(communityGoals);
        executeWithLock(() -> emitCommunityGoals(globalUpdate));
    }

    //endregion

    //region Crafting Materials

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
        executeWithLock(() -> globalUpdate.accept("Task", "materials"));
        emitAllTaskData(globalUpdate);
    }

    public void setMaterialCount(Material material, Integer count)
    {
        materials.put(material, count);
        executeWithLock(() -> globalUpdate.accept("Material", writeMaterialEvent(material, count)));
    }

    //endregion

    //region Planetary Surface, GPS Methods

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
        executeWithLock(() -> globalUpdate.accept("Land", nearestBody.name));
    }

    public void liftoff()
    {
        this.touchdownLatitude = -1;
        this.touchdownLongitude = -1;
        executeWithLock(() -> globalUpdate.accept("Liftoff", "liftoff"));
    }

    public void discoverSettlement(SettlementLocation settlementLocation)
    {
        database.executeInTransaction(txn ->
        {
            var bodyEntity = getStarNearestBodyEntity(txn);
            if (bodyEntity == null) return;

            var settlements = bodyEntity.getLinks(EntityKeys.PLANETARY_SETTLEMENT);
            var settlementEntity = EntityUtilities.entityStream(settlements)
                .filter(settlement ->
                    Objects.equals(settlement.getProperty(EntityKeys.MARKET_ID), settlementLocation.marketId))
                .findFirst().orElseGet(() ->
                {
                    var newSettlement = txn.newEntity(EntityKeys.PLANETARY_SETTLEMENT);
                    newSettlement.setLink(EntityKeys.STELLAR_BODY, bodyEntity);
                    bodyEntity.addLink(EntityKeys.PLANETARY_SETTLEMENT, newSettlement);
                    return newSettlement;
                });
            settlementLocation.storeSettlementData(settlementEntity);
        });
    }

    public SettlementLocation getLocalSettlement(Long marketID)
    {
        if (localSettlement == null || marketID == null) return null;

        return (localSettlement.marketId == marketID)
            ? localSettlement
            : null;
    }

    public void setClosestSettlement(SettlementLocation settlementLocation)
    {
        this.localSettlement = settlementLocation;
        if (localCoordinates == null) return;

        var map = this.localSettlement.toMap();
        var dist = calculateWaypointDistance(this.localSettlement.longitude, this.localSettlement.latitude);
        var unit = dist < 1000
            ? "m"
            : "km";
        if (unit.equals("km"))
        {
            dist = UIFunctions.Math.round(dist / 1000d, 1);
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
                .filter(body -> Objects.equals(body.getProperty(EntityKeys.STELLAR_BODY_ID), nearestBody.id))
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

            var dist = calculateWaypointDistance(waypointLongitude, waypointLatitude);
            var unit = dist < 1000
                ? "m"
                : "km";
            if (unit.equals("km"))
            {
                dist = UIFunctions.Math.round(dist / 1000d, 1);
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

    //endregion

    //region Factions and Conflicts

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

    //endregion

    //region Data Calculation Methods

    private String getBearing()
    {
        if (localCoordinates != null)
        {
            if (trackedLocation.get().equalsIgnoreCase("settlement"))
            {
                if (localSettlement != null)
                {
                    var bearing = UIFunctions.Math.calculateBearingAngle(localCoordinates.latitude,
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
                    var bearing = UIFunctions.Math.calculateBearingAngle(localCoordinates.latitude,
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
                    String[] parts = trackedLocation.get().split("-");
                    var type = Integer.parseInt(parts[0]);
                    var local = Long.parseLong(parts[1]);
                    var entityId = new PersistentEntityId(type, local);
                    var entity = txn.getEntity(entityId);
                    var latitude = ((Double) entity.getProperty(EntityKeys.WAYPOINT_LATITUDE));
                    var longitude = ((Double) entity.getProperty(EntityKeys.WAYPOINT_LONGITUDE));
                    if (latitude == null || longitude == null) return null;
                    return new GPSLocation(latitude, longitude);
                });

                if (waypointLocation != null)
                {
                    var bearing = UIFunctions.Math.calculateBearingAngle(localCoordinates.latitude,
                        localCoordinates.longitude,
                        waypointLocation.latitude,
                        waypointLocation.longitude);

                    return String.valueOf(bearing);
                }
            }
        }
        return "";
    }

    private int getMilitarySize()
    {
        return Arrays.stream(shipType.getInternals().getSlots())
            .filter(moduleSize -> moduleSize.name().contains("MILITARY"))
            .map(moduleSize -> moduleSize.intValue)
            .findFirst().orElseThrow();
    }

    private String prepareEngineerData()
    {
        Arrays.stream(KnownEngineer.values())
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
        engineerProgress.forEach(((engineer, data) -> formattedData.put(engineer.name(), data)));

        return JSONSupport.Write.jsonToString.apply(formattedData);
    }

    private String prepareNavRouteData()
    {
        var data = new HashMap<String, Object>();

        var routePoints = currentRoute.stream()
            .map(routeEntry ->
            {
                var formattedData = new HashMap<String, Object>();
                formattedData.put("name", routeEntry.starSystem.systemName);
                formattedData.put("distance", this.starSystem.distanceBetween(routeEntry.starSystem));
                formattedData.put("starClass", routeEntry.starClass);
                return formattedData;
            })
            .collect(Collectors.toList());

        data.put("route", routePoints);
        data.put("jumps", currentRoute.size() - 1);
        return JSONSupport.Write.jsonToString.apply(data);
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
     * @param waypointLongitude the waypoint's longitude
     * @param waypointLatitude the waypoint's latitude
     * @return the approximate distance between the two points in meters
     */
    private double calculateWaypointDistance(double waypointLongitude, double waypointLatitude)
    {
        return UIFunctions.Math.calculateSurfaceDistance(waypointLatitude, waypointLongitude,
            localCoordinates.latitude,
            localCoordinates.longitude,
            localCoordinates.altitude,
            localCoordinates.radius);
    }

    private double calculateEffectValue(ItemEffect effect)
    {
        return calculateFilteredEffectValue(effect, (_s) -> true);
    }

    private double calculateShieldBoosterEffect()
    {
        return shipModules.values().stream()
            .filter((m) -> m.module.modificationType() == ModificationType.Shield_Booster)
            .map(shipModuleData -> shipModuleData.effectByName(ItemEffect.DefenceModifierShieldMultiplier))
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
        return UIFunctions.Math.round(totalHullMass, 1);
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
                var share = UIFunctions.Math.round(((draw / powerCapacity) * 100), 2);
                var powerData = new HashMap<String, Object>();
                powerData.put("draw", UIFunctions.Math.round(draw, 2));
                powerData.put("powered", moduleData.powered ? "on" : "off");
                powerData.put("priority", moduleData.priority);
                powerData.put("share", share);
                moduleMap.put(moduleData.module.displayText(), powerData);
            });

        var output = new HashMap<String, Object>();
        output.put("capacity", UIFunctions.Math.round(powerCapacity, 2));
        output.put("powerDraw", UIFunctions.Math.round(powerDraw, 2));
        output.put("retractedDraw", UIFunctions.Math.round(retractedDraw, 2));
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
    private StatGroup calculateCurrentShieldStrength()
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
        ShipModuleData shieldGenerator = findShieldGenerator();

        // no generator means no shields, so just return zero
        if (shieldGenerator == null) return new StatGroup();

        // get the ships base hull mass, this affects shield strength. Strength calculations only take into
        // account the base mass, additional modules do not affect strength in-game
        double hullMass = shipType.getBaseShipStats().hullMass;
        double maximumMass = shieldGenerator.effectByName(ItemEffect.ShieldGenMaximumMass)
            .map(ItemEffectData::getDoubleValue)
            .orElse(Double.MIN_VALUE);

        // if the ship's mass exceeds maximum mass, the shield doesn't work
        if (hullMass > maximumMass) return new StatGroup();

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
        double accumulatedBoost = 1 + calculateShieldBoosterEffect() / 100d;

        double accumulatedShieldReinforcement = calculateEffectValue(ItemEffect.DefenceModifierShieldAddition);

        // apply all the multipliers to the ship's base shield value to calculate the total shield strength
        double calculatedShield = (baseShield * shieldMultiplier * accumulatedBoost) + accumulatedShieldReinforcement;

        StatGroup statGroup = new StatGroup();
        statGroup.calculatedValue = calculatedShield;
        statGroup.baseValue = baseShield;
        statGroup.rawValue = baseShield * shieldMultiplier * accumulatedBoost;
        statGroup.boostValue = accumulatedShieldReinforcement;
        statGroup.minmax = optimalMass - hullMass;

        statGroup.baseMultiplier = 0.0;
        statGroup.boostMultiplier = 0.0;

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
    private StatGroup calculateCurrentHullStrength()
    {
        if (shipType == null) return new StatGroup();

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

        StatGroup statGroup = new StatGroup();
        statGroup.calculatedValue = totalHullStrength;
        statGroup.baseValue = hullStrength;
        statGroup.rawValue = hullBoost;
        statGroup.boostValue = hullReinforcement;
        statGroup.minmax = 0d;

        statGroup.baseMultiplier = 0.0;
        statGroup.boostMultiplier = 0.0;
        // round the result to 1 decimal place to match the in-game UI
        return statGroup;
    }

    private StatGroup calculateArmorResistance(ItemEffect resistanceEffect)
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
            .map(n-> UIFunctions.Math.round(n, 5))
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
            .map(n -> UIFunctions.Math.round(n, 5))
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

        StatGroup statGroup = new StatGroup();
        statGroup.calculatedValue = UIFunctions.Math.round(actual,1);
        statGroup.rawValue = UIFunctions.Math.round(raw, 1);
        statGroup.minmax = UIFunctions.Math.round((combinedResistance - .7) * 100, 2);

        statGroup.boostMultiplier = UIFunctions.Math.round(boostResistance, 2);
        statGroup.baseMultiplier = UIFunctions.Math.round(baseResistance, 2);

        statGroup.boostValue = UIFunctions.Math.round((1.0 - (boostResistance)) * 100d, 2);
        statGroup.baseValue = UIFunctions.Math.round((1.0 - (baseResistance)) * 100d, 2);

        return statGroup;
    }

    private StatGroup calculateShieldResistance(ItemEffect resistanceEffect)
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
            .map(n-> UIFunctions.Math.round(n, 5))
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
            .map(n-> UIFunctions.Math.round(n, 5))
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

        StatGroup statGroup = new StatGroup();
        statGroup.calculatedValue = UIFunctions.Math.round(actual,1);
        statGroup.rawValue = UIFunctions.Math.round(raw, 1);
        statGroup.minmax = UIFunctions.Math.round((boosterResistance - .7) * 100, 2);

        statGroup.boostValue = UIFunctions.Math.round((1.0 - (boosterResistance)) * 100d, 2);
        statGroup.boostMultiplier = UIFunctions.Math.round(boosterResistance, 2);
        statGroup.baseValue = UIFunctions.Math.round((1.0 - (shieldResistence)) * 100d, 2);
        statGroup.baseMultiplier = UIFunctions.Math.round(shieldResistence, 2);

        return statGroup;
    }

    private StatGroup calculateResistance(ShipCharacteristic resistanceType)
    {
        StatGroup calculatedResistance;
        switch (resistanceType)
        {
            case Armour_Caustic:
                calculatedResistance = calculateArmorResistance(ItemEffect.CausticResistance);
                break;

            case Armour_Explosive:
                calculatedResistance = calculateArmorResistance(ItemEffect.ExplosiveResistance);
                break;

            case Armour_Kinetic:
                calculatedResistance = calculateArmorResistance(ItemEffect.KineticResistance);
                break;

            case Armour_Thermal:
                calculatedResistance = calculateArmorResistance(ItemEffect.ThermicResistance);
                break;

            case Shield_Explosive:
                calculatedResistance = calculateShieldResistance(ItemEffect.ExplosiveResistance);
                break;

            case Shield_Kinetic:
                calculatedResistance = calculateShieldResistance(ItemEffect.KineticResistance);
                break;

            case Shield_Thermal:
                calculatedResistance = calculateShieldResistance(ItemEffect.ThermicResistance);
                break;

            default: calculatedResistance = new StatGroup();
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
                damageData.put("total", UIFunctions.Math.round(dps, 2));
                damageData.put("thermal", UIFunctions.Math.round(damageShares.thermalShare, 2));
                damageData.put("kinetic", UIFunctions.Math.round(damageShares.kineticShare, 2));
                damageData.put("explosive", UIFunctions.Math.round(damageShares.explosiveShare, 2));
                damageData.put("absolute", UIFunctions.Math.round(damageShares.absoluteShare, 2));

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
        data.put("totalDPS", UIFunctions.Math.round(totalDPS, 2));
        data.put("totalThermal", UIFunctions.Math.round(thermalDamage.sum(), 2));
        data.put("totalKinetic", UIFunctions.Math.round(kineticDamage.sum(), 2));
        data.put("totalExplosive", UIFunctions.Math.round(explosiveDamage.sum(), 2));
        data.put("totalAbsolute", UIFunctions.Math.round(absoluteDamage.sum(), 2 ));

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
        data.put("regen", UIFunctions.Math.round(shieldRegenRate, 2));
        data.put("brokenRegen", UIFunctions.Math.round(brokenRegenRate, 2));
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

    private String calculateRawCostAssociations(TaskCatalog taskCatalog)
    {
        Map<String, Object> costAssociations = new HashMap<>();

        Stream.of(Material.values())
            .forEach(material ->
            {
                var recipeMap = new HashMap<String, Object>();

                // get recipes with parent chains
                material.getAssociated().stream()
                    .filter(recipe -> recipe.getParentBlueprint() != null)
                    .filter(recipe -> recipe.getParentBlueprint().getParentType() != null)
                    .filter(recipe -> taskCatalog.typedTaskMap.get(recipe.getParentBlueprint().getParentType()) != null)
                    .map(recipe -> taskCatalog.typedTaskMap.get(recipe.getParentBlueprint().getParentType()).get(recipe))
                    .filter(Objects::nonNull)
                    .forEach(recipeKey ->
                    {
                        var taskRecipe = taskCatalog.keyMap.get(recipeKey);
                        var displayLabel = taskRecipe.getDisplayLabel();
                        if (taskRecipe.getGrade() == ItemGrade.MicroMaterial)
                        {
                            var parentCategory = taskRecipe.getParentBlueprint().getParentType().getParentCategory();
                            displayLabel = displayLabel.replace("Micro-Material", parentCategory.toString());
                        }
                        else
                        {
                            var parentType = taskRecipe.getParentBlueprint().getParentType();
                            displayLabel = parentType + " :: " + taskRecipe.getParentBlueprint().toString()
                                + " :: " + taskRecipe.getShortLabel();
                        }

                        //System.out.println(recipeKey);
                        //System.out.println(displayLabel);

                        recipeMap.put(recipeKey, displayLabel);
                    });

                // get recipes without parent chains
                material.getAssociated().stream()
                    .filter(recipe -> recipe instanceof ExperimentalRecipe)
                    .map(recipe -> ((ExperimentalRecipe) recipe))
                    .forEach(recipe -> ExperimentalType.associatedTypes(recipe)
                        .forEach(type ->
                        {
                            var recipeKey = taskCatalog.typedTaskMap.get(type).get(recipe);
                            var displayLabel = type + " :: " + recipe.getShortLabel();

                            //System.out.println(recipeKey);
                            //System.out.println(displayLabel);

                            recipeMap.put(recipeKey, displayLabel);
                        }));

                material.getAssociated().stream()
                    .map(taskCatalog.untypedTaskMap::get)
                    .filter(Objects::nonNull)
                    .forEach(recipeKey ->
                    {
                        var taskRecipe = taskCatalog.keyMap.get(recipeKey);
                        var displayLabel = taskRecipe.getDisplayLabel();
                        if (taskRecipe.getGrade() == ItemGrade.MicroMaterial)
                        {
                            var parentCategory = taskRecipe.getParentBlueprint().getParentType().getParentCategory();
                            displayLabel = displayLabel.replace("Micro-Material", parentCategory.toString());
                        }
                        else if (taskRecipe.getGrade() == ItemGrade.SYNTHESIS_BASIC
                            || taskRecipe.getGrade() == ItemGrade.SYNTHESIS_STANDARD
                            || taskRecipe.getGrade() == ItemGrade.SYNTHESIS_PREMIUM)
                        {
                            displayLabel = "Synthesis :: " + displayLabel;
                        }
                        else if (taskRecipe.getGrade() == ItemGrade.TechnologyBroker)
                        {
                            displayLabel = "Unlock :: " + displayLabel;
                        }
                        else
                        {
                            displayLabel = taskRecipe.getGrade() + " :: " + taskRecipe.getShortLabel();
                        }

                        //System.out.println(recipeKey);
                        //System.out.println(displayLabel);

                        recipeMap.put(recipeKey, displayLabel);
                    });

                costAssociations.put(material.name(), recipeMap);
            });

//        Stream.of(Commodity.values())
//            .forEach(v->
//            {
//                v.getAssociated().stream()
//                    .filter(a -> a.getParentBlueprint() != null)
//                    .filter(a -> a.getParentBlueprint().getParentType() != null)
//                    .filter(a -> taskCatalog.typedTaskMap.get(a.getParentBlueprint().getParentType()) != null)
//                    .map(a -> taskCatalog.typedTaskMap.get(a.getParentBlueprint().getParentType()).get(a))
//                    .filter(Objects::nonNull)
//                    .forEach(System.out::println);
//
//                v.getAssociated().stream()
//                    .map(taskCatalog.untypedTaskMap::get)
//                    .filter(Objects::nonNull)
//                    .forEach(System.out::println);
//            });

        return JSONSupport.Write.jsonToString.apply(costAssociations);
    }

    //endregion

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

    private Entity getStarNearestBodyEntity(StoreTransaction transaction)
    {
        if (nearestBody == null) return null;

        var systemEntity = getStarSystemEntity(transaction, nearestBody.address);
        if (systemEntity == null) return null;

        return EntityUtilities.entityStream(systemEntity.getLinks(EntityKeys.STELLAR_BODY))
            .filter(entity -> Objects.equals(entity.getProperty(EntityKeys.STELLAR_BODY_ID), nearestBody.id))
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

                    var settlementList = EntityUtilities.entityStream(bodies)
                        .flatMap(body -> EntityUtilities.entityStream(body.getLinks(EntityKeys.PLANETARY_SETTLEMENT)))
                        .map(settlement ->
                        {
                            var settlementData = new HashMap<String, Object>();
                            bodyEntityToMap(settlement, settlementData);
                            return settlementData;
                        })
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
                    if (!settlementList.isEmpty())
                    {
                        data.put("settlements", settlementList);
                    }
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

    /**
     * When a client connects, this is called to ensure the client gets the current state
     * data. Note that after a client is connected, state data must be emitted as it changes
     * in individual events. IMPORTANT NOTE: this method must be updated whenever new state
     * events are added elsewhere. This method must provide a complete update of all possible
     * events, reflecting the entire game state.
     * @param directUpdate the event sink for the newly connected client
     */
    public void emitCurrentState(BiConsumer<String, String> directUpdate)
    {
        executeWithLock(() ->
        {
            // todo: as more state is tracked, this will need to be updated to make sure
            //  all important data is emitted during this call

            directUpdate.accept("ItemListing", "updated");

            commanderStats.forEach((statistic, value) ->
                directUpdate.accept(statistic.getName(), value));

            shipStats.forEach((statistic, value) ->
                directUpdate.accept(statistic.getName(), value));

            materials.forEach((material, value) ->
                directUpdate.accept("Material", writeMaterialEvent(material, value)));

            consumables.forEach((consumable, value) ->
                directUpdate.accept("Consumable", writeConsumableEvent(consumable, value)));

            directUpdate.accept("Cargo", "Clear");

            cargo.forEach((commodity, value) ->
                directUpdate.accept("Cargo", value.toJson()));

            directUpdate.accept("Suit", "updated");

            directUpdate.accept("Statistics", "updated");

            directUpdate.accept("Market", "updated");

            directUpdate.accept("Outfitting", "updated");

            directUpdate.accept("Shipyard", "updated");

            directUpdate.accept("Catalog", "updated");

            if (!dockedLocation.isEmpty())
            {
                executeWithLock(() -> globalUpdate.accept("Docked", dockedLocation));
            }

            if (starSystem != null)
            {
                directUpdate.accept("Location", starSystem.systemName);
                directUpdate.accept("Cartography", String.valueOf(starSystem.address));
            }

            if (shipType != null)
            {
                directUpdate.accept("Ship_Data", shipType.toJson());
            }

            if (suitType != null)
            {
                directUpdate.accept("Suit_Data", suitType);
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
                    var dist = calculateWaypointDistance(this.localSettlement.longitude, this.localSettlement.latitude);
                    var unit = dist < 1000
                        ? "m"
                        : "km";
                    if (unit.equals("km"))
                    {
                        dist = dist / 1000d;
                    }
                    dist = UIFunctions.Math.round(dist, 1);
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


            // todo: these should both gate on isinShip flag, which needs to be added

            if (vehicleState == VehicleState.STARSHIP)
            {
                directUpdate.accept("Loadout", "updated");
                directUpdate.accept("OffenseStats", calculateOffenseStats());
                directUpdate.accept("DefenseStats", calculateDefenseStats());
                directUpdate.accept("PowerStats", calculateCurrentPowerUsage());
                directUpdate.accept("CurrentMass", String.valueOf(calculateCurrentMass()));
            }

            directUpdate.accept("Missions", "clear");
            emitMissionData(directUpdate);

            emitAllTaskData(directUpdate);

            directUpdate.accept("Task", "materials");

            emitCommunityGoals(directUpdate);

            emitPledgedPower(directUpdate);
        });
    }

    public void emitEngineerData()
    {
        var engineerData = prepareEngineerData();
        executeWithLock(() -> globalUpdate.accept("Engineers", engineerData));
    }

    public void emitCurrentMass()
    {
        var currentMass = calculateCurrentMass();
        executeWithLock(() -> globalUpdate.accept("CurrentMass", String.valueOf(currentMass)));
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
        if (starSystem != null)
        {
            executeWithLock(() -> globalUpdate.accept("Cartography", String.valueOf(starSystem.address)));
        }
    }

    public void emitSuitLoadoutEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Suit", "updated"));
    }

    public void emitLoadoutEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Loadout", "updated"));
    }

    public void emitExtendedStatsEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Statistics", "updated"));
    }

    public void emitMarketEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Market", "updated"));
    }

    public void emitOutfittingEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Outfitting", "updated"));
    }

    public void emitShipyardEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Shipyard", "updated"));
    }

    public void emitSystemCatalog()
    {
        executeWithLock(() -> globalUpdate.accept("Catalog", "updated"));
    }

    public void emitMissionData()
    {
        emitMissionData(globalUpdate);
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
            var taskdata = taskCatalog.determineTaskData(task, taskKey);
            data.put("name", taskdata.name);
            data.put("costs", taskdata.costs);
            data.put("effects", taskdata.effects);
            if (!taskdata.engineers.isEmpty())
            {
                data.put("engineers", taskdata.engineers);
            }
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
        touchdownData.put("name", shipStats.get(ShipStat.Ship_Name));
        touchdownData.put("body", nearestBody.name);

        var dist = calculateWaypointDistance(touchdownLongitude, touchdownLatitude);
        var unit = dist < 1000
            ? "m"
            : "km";
        if (unit.equals("km"))
        {
            dist = dist / 1000d;
        }
        dist = UIFunctions.Math.round(dist, 1);
        touchdownData.put("distance", dist);
        touchdownData.put("unit", unit);

        var touchdownJson = JSONSupport.Write.jsonToString.apply(touchdownData);
        executeWithLock(() -> sink.accept("Touchdown", touchdownJson));
    }

    private void emitWaypointData(BiConsumer<String, String> sink)
    {
        if (starSystem == null || nearestBody == null || localCoordinates == null) return;

        var waypointData = database.computeInTransaction(txn ->
        {
            var currentSystem = getStarSystemEntity(txn, starSystem.address);
            if (currentSystem == null) return null;

            var currentBody = EntityUtilities.entityStream(currentSystem.getLinks(EntityKeys.STELLAR_BODY))
                .filter(body -> Objects.equals(body.getProperty(EntityKeys.STELLAR_BODY_ID), nearestBody.id))
                .findFirst()
                .orElse(null);

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

                    var dist = calculateWaypointDistance(waypointLongitude, waypointLatitude);
                    var unit = dist < 1000
                        ? "m"
                        : "km";
                    if (unit.equals("km"))
                    {
                        dist = UIFunctions.Math.round(dist / 1000d, 1);
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

    private void emitPledgedPower(BiConsumer<String, String> sink)
    {
        if (pledgedPower == null) return;
        var json = JSONSupport.Write.jsonToString.apply(pledgedPower.toMap());
        sink.accept("PowerPlay", json);
    }

    //endregion

    //region Formatting Functions

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
        else if (statistic == SuitGearSlot.SpaceSuit
            || statistic == SuitGearSlot.PrimaryWeapon1
            || statistic == SuitGearSlot.PrimaryWeapon2
            || statistic == SuitGearSlot.SecondaryWeapon)
        {
            rawKey = statistic.getText();
        }

        return rawKey;
    }

    private void formatStrength(HashMap<String, Object> dataMap, StatGroup stats, boolean minmax)
    {
        dataMap.put("value", UIFunctions.Math.round(stats.calculatedValue,0));
        dataMap.put("raw", UIFunctions.Math.round(stats.rawValue, 1));
        dataMap.put("base", UIFunctions.Math.round(stats.baseValue, 1));
        dataMap.put("reinforcement", UIFunctions.Math.round(stats.boostValue, 1));
        if (minmax)
        {
            dataMap.put("minmax", UIFunctions.Math.round(stats.minmax, 1));
        }
    }

    private void formatResistance(HashMap<String, Object> dataMap, StatGroup stats)
    {
        dataMap.put("value", UIFunctions.Math.round(stats.calculatedValue, 2));
        dataMap.put("raw", UIFunctions.Math.round(stats.rawValue,2));
        dataMap.put("base", UIFunctions.Math.round(stats.baseValue, 2));
        dataMap.put("boost", UIFunctions.Math.round(stats.boostValue, 2));
        dataMap.put("baseMultiplier", UIFunctions.Math.round(stats.baseMultiplier,2));
        dataMap.put("boostMultiplier", UIFunctions.Math.round(stats.boostMultiplier, 2));
        dataMap.put("minmax", UIFunctions.Math.round(stats.minmax, 2));
    }

    private Map<String, Object> entityToMap(Entity entity)
    {
        var map = new HashMap<String, Object>();
        entity.getPropertyNames()
            .forEach(property -> map.put(property, entity.getProperty(property)));

        entity.getBlobNames()
            .forEach(blobName ->
            {
                var json = entity.getBlobString(blobName);
                var jsonMap =  JSONSupport.Parse.jsonString.apply(json);
                map.put(blobName, jsonMap.get("json"));
            });
        return map;
    }

    private void mapToEntity(Map<String, Object> mapData, Entity entity)
    {
        mapData.forEach((name, value)->
        {
            if (value instanceof List)
            {
                var json = new HashMap<String, Object>();
                json.put("json", value);
                entity.setBlobString(name, JSONSupport.Write.jsonToString.apply(json));
                return;
            }
            else if (value instanceof Map)
            {
                var json = new HashMap<String, Object>();
                json.put("json", value);
                entity.setBlobString(name, JSONSupport.Write.jsonToString.apply(json));
                return;
            }

            if (value instanceof String)
            {
                if (((String) value).isEmpty())
                {
                    return;
                }
            }

            entity.setProperty(name, ((Comparable<?>) value));
        });
    }

    private String determineCategoryKey(long itemId)
    {
        if (Commodity.findById(itemId) != null)
        {
            return "exports";
        }
        else if (ShipType.findById(itemId) != null)
        {
            return "ships";
        }
        else if (CoreInternalModule.findById(itemId) != null
            || OptionalInternalModule.findById(itemId) != null
            || HardpointModule.findById(itemId) != null
            || UtilityModule.findById(itemId) != null)
        {
            return "modules";
        }
        return "";
    }

    private String determineModuleDisplayText(OwnableModule module)
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

        if (grade.isEmpty() || size ==-1) return module.displayText();
        else return size + grade + " " + module.displayText();
    }

    //endregion

    //region Task Tracking Methods

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

    public void completeTask(TaskType taskType, TaskRecipe recipe)
    {
        var key = taskCatalog.typedTaskMap.get(taskType).get(recipe);
        adjustTask(key, "subtract");
    }

    public void completeTask(TaskRecipe recipe)
    {
        var key = taskCatalog.untypedTaskMap.get(recipe);
        adjustTask(key, "subtract");
    }

    public String getTaskKey(TaskRecipe recipe)
    {
        return taskCatalog.untypedTaskMap.get(recipe);
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

    //endregion

    //region Complex JSON Object Writers

    public String writeItemQueryData(long id)
    {
        var results = new HashMap<String, Object>();
        results.put("results", queryItemData(id));
        return JSONSupport.Write.jsonToString.apply(results);
    }

    public String writeLoadoutJson()
    {
        var map = new HashMap<String, Object>();

        shipModules.forEach((statistic, moduleData) ->
            map.put(formatSlotKey(statistic), moduleData.toJson()));

        addEmptySlots(map);

        return JSONSupport.Write.jsonToString.apply(map);
    }

    public String writeSuitLoadoutJson()
    {
        var map = new HashMap<String, Object>();

        suitModules.forEach((statistic, moduleData) ->
            map.put(formatSlotKey(statistic), moduleData.toJson()));

        //addEmptySlots(map);

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
        return JSONSupport.Write.jsonToString.apply(commodityMarketData);
    }


    public String writeItemListing()
    {
        Map<String, Object> itemListing = new HashMap<>();

        Stream.of(Commodity.values())
            .filter(commodity -> commodity.id != -1L)
            .forEach(commodity ->
            {
                var name = commodity.getLocalizedName()
                    + " [" + commodity.id + "]";
                itemListing.put(String.valueOf(commodity.id), name);
            });

        Stream.of(ShipType.values())
            .filter(shipType -> shipType.id != -1L)
            .forEach(shipType ->
            {
                var name = shipType.getBaseShipStats().displayName
                    + " [" + shipType.id + "]";
                itemListing.put(String.valueOf(shipType.id), name);
            });

        Stream.of(CoreInternalModule.values())
            .filter(module -> module.id != -1L)
            .forEach(module ->
            {
                var name = determineModuleDisplayText(module)
                    + " [" + module.id + "]";
                itemListing.put(String.valueOf(module.id), name);
            });

        Stream.of(OptionalInternalModule.values())
            .filter(module -> module.id != -1L)
            .forEach(module ->
            {
                var name = determineModuleDisplayText(module)
                    + " [" + module.id + "]";
                itemListing.put(String.valueOf(module.id), name);
            });

        Stream.of(HardpointModule.values())
            .filter(module -> module.id != -1L)
            .forEach(module ->
            {
                var name = determineModuleDisplayText(module)
                    + " [" + module.id + "]";
                itemListing.put(String.valueOf(module.id), name);
            });

        Stream.of(UtilityModule.values())
            .filter(module -> module.id != -1L)
            .forEach(module ->
            {
                var name = determineModuleDisplayText(module)
                    + " [" + module.id + "]";
                itemListing.put(String.valueOf(module.id), name);
            });

        return JSONSupport.Write.jsonToString.apply(itemListing);
    }

    public String writeOutfittingData()
    {
        return JSONSupport.Write.jsonToString.apply(outfittingMarketData);
    }

    public String writeShipyardData()
    {
        return JSONSupport.Write.jsonToString.apply(shipyardMarketData);
    }

    public String writeMarketQueryData(long id, long price, boolean export, boolean difference)
    {
        var queryResults = new HashMap<String, Object>();
        var r = queryMarketData(id, price, export, difference);
        queryResults.put("results", r);
        return JSONSupport.Write.jsonToString.apply(queryResults);
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

    public String writeCostAssociations()
    {
        return rawCostAssociations;
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
            var name = taskCatalog.determineTaskData(recipe, summary.key).name;
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
                            var yield = recipe.costStream()
                                .map(costData-> costData.quantity)
                                .filter(quantity -> quantity < 0)
                                .map(Math::abs)
                                .findFirst()
                                .orElse(0L);

                            long stock = recipe.costStream()
                                .filter(costData -> costData.quantity > 0)
                                .filter(costData -> costData.cost instanceof Material)
                                .filter(costData -> materials.get(costData.cost) != null)
                                .peek(costData -> Optional.ofNullable(costCounts.get(costData.cost))
                                    .flatMap(runningCostData -> runningCostData.relatedTasks.stream()
                                        .filter(relatedTask -> !relatedTask.isTrade)
                                        .findFirst())
                                    .ifPresent(_x -> isCommitted.set(true)))
                                .peek(costData -> material.set(((Material) costData.cost)))
                                .map(costData ->
                                {
                                    var currentStock = materials.get(costData.cost);
                                    var pendingStock = pendingCosts.get(costData.cost);
                                    if (pendingStock == null)
                                    {
                                        pendingStock = 0L;
                                    }
                                    return currentStock - pendingStock;
                                })
                                .findFirst().orElse(0L);

                            if (!isCommitted.get() && stock > 0)
                            {
                                var key = taskCatalog.untypedTaskMap.get(recipe);
                                potentialTrades.add(new PotentialTrade(key, yield, stock));
                            }
                        }));

                    if (!potentialTrades.isEmpty())
                    {
                        potentialTrades.sort(Comparator
                            .comparingLong((PotentialTrade v)->v.stock)
                            .reversed());
                        bestStockTrade = potentialTrades.get(0);

                        potentialTrades.sort(Comparator
                            .comparingLong((PotentialTrade v)->v.yield)
                            .reversed());
                        bestYieldTrade = potentialTrades.get(0);
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
            costMap.put("grade", cost.getGrade());

            if (cost instanceof Material && pendingYields.containsKey(cost))
            {
                costMap.put("pending", pendingYields.get(cost));
            }

            if (bestStockTrade != null)
            {
                var stockRecipe = taskCatalog.keyMap.get(bestStockTrade.key);
                var data = taskCatalog.determineTaskData(stockRecipe, bestStockTrade.key);
                var stockMap = new HashMap<String, Object>();
                stockMap.put("key", bestStockTrade.key);
                stockMap.put("name", data.name);
                costMap.put("stockTrade", stockMap);

                if (!bestStockTrade.equals(bestYieldTrade))
                {
                    var yieldRecipe = taskCatalog.keyMap.get(bestYieldTrade.key);
                    var yieldData = taskCatalog.determineTaskData(yieldRecipe, bestYieldTrade.key);
                    var yieldMap = new HashMap<String, Object>();
                    yieldMap.put("key", bestYieldTrade.key);
                    yieldMap.put("name", yieldData.name);
                    costMap.put("yieldTrade", yieldMap);
                }
            }

            dataMap.put(name, costMap);
        });
        String apply = JSONSupport.Write.jsonToString.apply(dataMap);
        return apply;
    }

    private String writeMaterialEvent(Material material, Integer count)
    {
        var event = new HashMap<String, Object>();
        event.put("name", material.name());
        event.put("count", count.toString());
        return JSONSupport.Write.jsonToString.apply(event);
    }

    private String writeConsumableEvent(Consumable consumable, Integer count)
    {
        var event = new HashMap<String, Object>();
        event.put("name", consumable.getLocalizedName());
        event.put("count", count.toString());
        return JSONSupport.Write.jsonToString.apply(event);
    }

    //endregion
}
