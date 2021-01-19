package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.JSONSupport;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.data.EntityKeys;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipType;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.ui.UIFunctions;
import jetbrains.exodus.entitystore.PersistentEntityStore;
import jetbrains.exodus.entitystore.PersistentEntityStores;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PlayerState
{
    private final Lock stateLock = new ReentrantLock();

    /**
     * This object holds the persistent data related to this commander
     */
    private final PersistentEntityStore database =
        PersistentEntityStores.newInstance(UIFunctions.DATA_FOLDER + "/db");

    /**
     * This is an event sink used when state changes must be communicated to listening clients
     */
    private final BiConsumer<String, String> globalUpdate;

    private final Map<Statistic, String> commanderStatistics = new ConcurrentHashMap<>();
    private final Map<Statistic, String> shipStatistics = new ConcurrentHashMap<>();
    private final Map<Statistic, ShipModuleData> shipModules = new ConcurrentHashMap<>();
    private final Map<String, Map<String, String>> extendedStats = new ConcurrentHashMap<>();
    private final Map<Material, Integer> materials = new ConcurrentHashMap<>();
    private final Map<Commodity, CommodityData> cargo = new ConcurrentHashMap<>();
    private final Map<String, Object> marketData = new HashMap<>();

    /**
     * Contains the commander's current credit balance.
     */
    private long creditBalance = 0;

    // todo: need to account for resevoir value as well from status file
    private double currentFuel = 0;

    private ShipType shipType;

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

        String toJson()
        {
            Map<String, Object> data = new HashMap<>();
            data.put("name", name);
            data.put("count", count);
            data.put("type", grade.name().toLowerCase());
            return JSONSupport.Write.jsonToString.apply(data);
        }
    }

    public PlayerState(BiConsumer<String, String> globalUpdate)
    {
        this.globalUpdate = globalUpdate;
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

    public void clearCargo()
    {
        executeWithLock(() ->
        {
            cargo.clear();
            globalUpdate.accept("Cargo","Clear");
        });
    }

    public void clearShipModules()
    {
        shipModules.clear();
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

    public void setExtendedStats(String category, Map<String, String> stats)
    {
        extendedStats.put(category, stats);
    }

    public void setCargoCount(Commodity commodity, String name, Integer count)
    {
        executeWithLock(() ->
        {
            var commodityData = new CommodityData(name, count, commodity.getGrade());
            cargo.put(commodity, commodityData);
            globalUpdate.accept(name, commodityData.toJson());
        });
    }

    private String writeMaterialEvent(Material material, Integer count)
    {
        var event = new HashMap<String, Object>();
        event.put("name", material.name());
        event.put("count", count.toString());
        return JSONSupport.Write.jsonToString.apply(event);
    }

    public void setMaterialCount(Material material, Integer count)
    {
        executeWithLock(() ->
        {
            materials.put(material, count);
            globalUpdate.accept("Material", writeMaterialEvent(material, count));
        });
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

    public void setShipModule(Statistic statistic, ShipModuleData shipModuleData)
    {
        shipModules.put(statistic, shipModuleData);
    }

    public void adjustCreditBalance(long adjustment)
    {
        executeWithLock(() ->
        {
            creditBalance += adjustment;
            var balance = String.valueOf(creditBalance);
            commanderStatistics.put(CommanderStat.Credits, balance);
            globalUpdate.accept(CommanderStat.Credits.getName(), balance);
        });
    }

    private void updateInternalState(Statistic statistic, String value)
    {
        // player

        if (statistic instanceof CommanderStat)
        {
            if (statistic == CommanderStat.Commander)
            {
                database.executeInTransaction(txn ->
                {
                    String commander = commanderStatistics.get(CommanderStat.Commander);
                    if (txn.find(EntityKeys.COMMANDER, EntityKeys.NAME, commander).isEmpty())
                    {
                        txn.newEntity(EntityKeys.COMMANDER)
                            .setProperty(EntityKeys.NAME, commander);
                    }
                });
            }

            if (statistic == CommanderStat.Credits)
            {
                creditBalance = Long.parseLong(value.replace(",",""));
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
                // todo: parse value
                currentFuel = Double.parseDouble(value.replace(",",""));
            }

            if (statistic == ShipStat.Fuel_Capacity)
            {
                // todo: parse value
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

        if (statistic instanceof CoreInternalSlot)
        {

        }

        if (statistic instanceof CosmeticSlot)
        {

        }

        if (statistic instanceof HardpointSlot)
        {

        }

        if (statistic instanceof OptionalInternalSlot)
        {

        }
    }

    private double calculateEffectValue(ItemEffect effect)
    {
        return calculateFilteredEffectValue(effect, (_s) -> true);
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

    private static final Predicate<Statistic> nonWeaponSlots = (slot) ->
    {
        if (slot instanceof HardpointSlot)
        {
            return slot.getText().contains("Utility");
        }
        else return true;
    };

    private static final Comparator<Map.Entry<Statistic, ShipModuleData>> highestDraw =
        Comparator.comparingDouble((Map.Entry<Statistic, ShipModuleData> e) -> e.getValue().effectByName(ItemEffect.PowerDraw)
            .map(ef->ef.doubleValue).orElse(0.0d))
            .reversed();

    private String calculateCurrentPowerUsage()
    {
        var powerCapacity = calculateEffectValue(ItemEffect.PowerCapacity);

        var powerDraw = calculateEffectValue(ItemEffect.PowerDraw);

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




    //region UI Event Emitters

    public void emitLoadoutEvent()
    {
        executeWithLock(() -> globalUpdate.accept("Loadout", "updated"));
    }

    public void emitCurrentMass()
    {
        executeWithLock(() -> globalUpdate.accept("CurrentMass", String.valueOf(calculateCurrentMass())));
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
        executeWithLock(() -> globalUpdate.accept("PowerStats", calculateCurrentPowerUsage()));
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

            if (shipType != null)
            {
                directUpdate.accept("Ship_Data", shipType.toJson());
            }

            directUpdate.accept("CurrentMass", String.valueOf(calculateCurrentMass()));

            directUpdate.accept("PowerStats", calculateCurrentPowerUsage());
        });
    }

    //endregion

    //region Formatting Utils

    private String formatSlotKey(Statistic statistic)
    {
        // todo: process military modules
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

        return rawKey;
    }

    private void addEmptySlots(Map<String, Object> map)
    {
        var optionalCounts = new HashMap<Integer, Integer>();

        Arrays.stream(shipType.getInternals().getSlots())
            .forEach(moduleSize ->
            {
                var current = optionalCounts.computeIfAbsent(moduleSize.intValue, (_k)-> 0) + 1;
                optionalCounts.put(moduleSize.intValue, current);
            });

        shipModules.forEach((statistic, moduleData)->
        {
            // todo: handle military slots
            if (statistic.getKey().contains("_Size"))
            {
                var sizeStart = statistic.getKey().indexOf("_");
                var rawSize = statistic.getKey().substring(sizeStart + 5);
                var size = Integer.parseInt(rawSize);
                var left = optionalCounts.get(size) - 1;
                optionalCounts.put(size, left);
            }
        });

        optionalCounts.forEach((size, count) -> IntStream.range(0, count)
            .mapToObj(i -> "Empty_" + size + (i + 1))
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

    //endregion
}
