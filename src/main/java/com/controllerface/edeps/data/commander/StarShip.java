package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.ModifierData;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.equipment.modules.CoreInternalModule;
import com.controllerface.edeps.structures.equipment.ships.*;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/24/2018.
 *
 * Storage object used to manage a commander's ship
 *
 * NOTE: Mutable state data object
 *
 */
public class StarShip
{
    private Ship ship;
    private SimpleStringProperty shipDisplayName = new SimpleStringProperty("None");

    private ObservableList<ShipStatisticData> statistics = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> coreInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> optionalInternals = FXCollections.observableArrayList();
    private ObservableList<ShipModuleData> hardpoints = FXCollections.observableArrayList();

    public StarShip()
    {

    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
        coreInternals.clear();
        optionalInternals.clear();
        hardpoints.clear();
        initializeBaseStats();
    }

    private void initializeBaseStats()
    {
        Platform.runLater(this::resetStats);
    }

    private void resetStats()
    {
        statistics.clear();

        shipDisplayName.set(ship.getBaseShipStats().getDisplayName());

        statistics.add(new ShipStatisticData(ship.getBaseShipStats().getShipSize()));
        statistics.add(new ShipStatisticData(ship.getBaseShipStats().getManufacturer()));

        statistics.add(new ShipStatisticData(ShipStat.Mass_Lock_Factor, ship.getBaseShipStats().getMassLockFactor()));
        statistics.add(new ShipStatisticData(ShipStat.Crew_Seats, ship.getBaseShipStats().getCrewSeats()));
        statistics.add(new ShipStatisticData(ShipStat.SLF_Capable, ship.getBaseShipStats().isSlfCapable()));

        statistics.add(new ShipStatisticData(ShipStat.Agility, ship.getBaseShipStats().getAgility()));
        statistics.add(new ShipStatisticData(ShipStat.Hull_Mass, ship.getBaseShipStats().getHullMass()));
        statistics.add(new ShipStatisticData(ShipStat.Hull_Hardness, ship.getBaseShipStats().getHullHardness()));

        statistics.add(new ShipStatisticData(ShipStat.Speed, ship.getBaseShipStats().getSpeed()));
        statistics.add(new ShipStatisticData(ShipStat.Boost_Speed, ship.getBaseShipStats().getBoostSpeed()));

        statistics.add(new ShipStatisticData(ShipStat.Max_Speed, ship.getBaseShipStats().getMaxSpeed()));
        statistics.add(new ShipStatisticData(ShipStat.Max_Boost_Speed, ship.getBaseShipStats().getMaxBoostSpeed()));

        statistics.add(new ShipStatisticData(ShipStat.Armor_Rating, ship.getBaseShipStats().getArmorRating()));
        statistics.add(new ShipStatisticData(ShipStat.Base_Shield, ship.getBaseShipStats().getBaseShield()));
    }


    private void calculateCurrentStats()
    {

        //todo: this is pretty inefficient, since it clears and resets all stats for each module. Monitor performance
        // over time and if there are big lags at startup, consider fine tuning this to only make targeted changes
        Platform.runLater(()->
        {
            resetStats();

            // start with the base armor rating
            double hullStrength = ship.getBaseShipStats().getArmorRating();

            // buffer used to accumulate hull addition values
            AtomicReference<Double> hull_reinforcement = new AtomicReference<>(0d);

            // loop through all the modules that can have hull reinforcement. For now, this
            // means only optional internals, but if this changes in the future, loop through
            // all relevant modules
            optionalInternals.stream().forEach(opt->
            {
                // first get the stock modification value
                double addition = opt.getModule().itemEffects().effectStream()
                        .filter(e->e.getEffect()==ItemEffect.DefenceModifierHealthAddition)
                        .map(ItemEffectData::getDoubleValue)
                        .findFirst().orElse(0d);

                // if there's a modifier that changes the stock value, use it instead, otherwise
                // just use the stock value
                addition = opt.getModifiers().stream()
                        .filter(m->m.getEffect() == ItemEffect.DefenceModifierHealthAddition)
                        .map(ModifierData::getValue)
                        .findFirst().orElse(addition);

                // accumulate the hull addition this module adds
                hull_reinforcement.set(hull_reinforcement.get() + addition);
            });

            // this will hold the hull boost value
            AtomicReference<Double> hull_boost = new AtomicReference<>(0d);

            // right now, only armour modules can add hull boost, so we can loop through just the core
            // internals and filter out armour modules
            coreInternals.stream()
                    .filter(m->m.getModuleName() == CoreInternalSlot.Armour)
                    .forEach(mod->
                    {
                        // same as hull reinforcement, get the stock value first
                        Double stock = mod.getModule().itemEffects().effectStream()
                                .filter(e->e.getEffect()==ItemEffect.DefenceModifierHealthMultiplier)
                                .map(ItemEffectData::getDoubleValue)
                                .findFirst().orElse(null);

                        // stock should never be null, but we should check just in case
                        if (stock != null)
                        {
                            hull_boost.set(hullStrength * (stock / 100d));
                        }

                        // now check if there's a modifier for this value
                        Double modified = mod.getModifiers().stream()
                                .filter(m->m.getEffect() == ItemEffect.DefenceModifierHealthMultiplier)
                                .map(ModifierData::getValue)
                                .findFirst().orElse(null);

                        // if there's a modifier value, replace the calculated boost value
                        if (modified != null)
                        {
                            hull_boost.set(hullStrength * (modified / 100d));
                        }
                    });

            // finally, calculate the final hull strength
            double finalS = hullStrength + hull_reinforcement.get() + hull_boost.get();

            // round so the output matches the game UI. Note that rounding is done AFTER calculations
            finalS = Math.round(finalS);

            double armourCausticResistance = 0d;
            double armourExplosiveResistance = 0d;
            double armourKineticResistance = 0d;
            double armourThermalResistance = 0d;

            double shieldStrength = ship.getBaseShipStats().getBaseShield();
            double shieldExplosiveResistance = 0d;
            double shieldKineticResistance = 0d;
            double shieldThermalResistance = 0d;

            statistics.add(new ShipStatisticData(ShipStat.Hull_Strength, finalS));
            statistics.add(new ShipStatisticData(ShipStat.Armour_Caustic_Resistance, armourCausticResistance));
            statistics.add(new ShipStatisticData(ShipStat.Armour_Explosive_Resistance, armourExplosiveResistance));
            statistics.add(new ShipStatisticData(ShipStat.Armour_Kinetic_Resistance, armourKineticResistance));
            statistics.add(new ShipStatisticData(ShipStat.Armour_Thermal_Resistance, armourThermalResistance));

            statistics.add(new ShipStatisticData(ShipStat.Shield_Strength, shieldStrength));
            statistics.add(new ShipStatisticData(ShipStat.Shield_Explosive_Resistance, shieldExplosiveResistance));
            statistics.add(new ShipStatisticData(ShipStat.Shield_Kinetic_Resistance, shieldKineticResistance));
            statistics.add(new ShipStatisticData(ShipStat.Shield_Thermal_Resistance, shieldThermalResistance));
        });
    }

    public ObservableList<ShipStatisticData> getStatistics()
    {
        return statistics;
    }

    public ObservableStringValue getShipDisplayName()
    {
        return shipDisplayName;
    }

    public ObservableList<ShipModuleData> getCoreInternals()
    {
        return coreInternals;
    }

    public ObservableList<ShipModuleData> getOptionalInternals()
    {
        return optionalInternals;
    }

    public ObservableList<ShipModuleData> getHardpoints()
    {
        return hardpoints;
    }

    public void setShipModule(ShipModuleData shipModuleData)
    {
        // todo: perform checking for support in the Ship object

        // note the remove() calls in each conditional before the add calls. This may seem strange, but is leveraging
        // the overridden equals() method in the ShipModuleData class to ensure only one module is present in a given
        // internal slot. This makes it ok to call setShipModule() multiple times with new ShipModuleData objects that
        // contain updated stats (for example, if the player upgrades or changes a mod on an existing item).

        if (CoreInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            coreInternals.remove(shipModuleData);
            coreInternals.add(shipModuleData);
        }

        if (OptionalInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            optionalInternals.remove(shipModuleData);
            optionalInternals.add(shipModuleData);
        }

        if (HardpointSlot.typeMatches(shipModuleData.getModuleName()))
        {
            hardpoints.remove(shipModuleData);
            hardpoints.add(shipModuleData);
        }

        calculateCurrentStats();
    }
}
