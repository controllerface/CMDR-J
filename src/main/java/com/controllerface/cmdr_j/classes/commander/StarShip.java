package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ShipModuleData;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ships.Ship;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/24/2018.
 *
 * Storage object used to manage a commander's ship
 *
 * NOTE: Mutable state data object
 *
 */
public class StarShip
{
    private Ship ship;
    private final SimpleStringProperty shipID = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipGivenName = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipDisplayName = new SimpleStringProperty("Loading...");
    private final SimpleStringProperty shipManufacturerName = new SimpleStringProperty("Loading...");

    private double currentFuel = 0d; // todo: use this

    private final List<ShipStatisticData> statistics = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> coreInternals = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> optionalInternals = new CopyOnWriteArrayList<>();
    private final List<ShipModuleData> hardpoints = new CopyOnWriteArrayList<>();

    private final ObservableList<ShipStatisticData> observableStatistics = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableCoreInternals = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableOptionalInternals = FXCollections.observableArrayList();
    private final ObservableList<ShipModuleData> observableHardpoints = FXCollections.observableArrayList();

    StarShip() {}

    public void associateShipManufacturer(Label makeLabel)
    {
        makeLabel.textProperty().bind(shipManufacturerName);
    }

    public void associateShipDisplayName(Label displayLabel)
    {
        displayLabel.textProperty().bind(shipDisplayName);
    }

    public void associateShipGivenName(Label givenNameLabel)
    {
        givenNameLabel.textProperty().bind(shipGivenName);
    }

    public void associateShipID(Label shipIDLabel)
    {
        shipIDLabel.textProperty().bind(shipID);
    }

    public void associateStatisticsTable(TableView<ShipStatisticData> statTable)
    {
        SortedList<ShipStatisticData> sorted = new SortedList<>(observableStatistics);
        statTable.setItems(sorted);

        observableStatistics.addListener((ListChangeListener<ShipStatisticData>) c -> statTable.refresh());
        sorted.setComparator(Comparator.comparing(ShipStatisticData::stat));
    }

    public void associateCoreTable(TableView<ShipModuleData> coreTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableCoreInternals);
        coreTable.setItems(sorted);

        observableCoreInternals.addListener((ListChangeListener<ShipModuleData>) c -> coreTable.refresh());
        sorted.setComparator((a, b)->
        {
            CoreInternalSlot slotA = ((CoreInternalSlot) a.getModuleName());
            CoreInternalSlot slotB = ((CoreInternalSlot) b.getModuleName());
            return slotA.compareTo(slotB);
        });
    }

    public void associateOptionalTable(TableView<ShipModuleData> optionalTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableOptionalInternals);
        optionalTable.setItems(sorted);

        observableOptionalInternals.addListener((ListChangeListener<ShipModuleData>) c -> optionalTable.refresh());
        sorted.setComparator((a, b)->
        {
            OptionalInternalSlot slotA = ((OptionalInternalSlot) a.getModuleName());
            OptionalInternalSlot slotB = ((OptionalInternalSlot) b.getModuleName());
            return slotA.compareTo(slotB);
        });
    }

    public void associateHardpointTable(TableView<ShipModuleData> hardpointTable)
    {
        SortedList<ShipModuleData> sorted = new SortedList<>(observableHardpoints);
        hardpointTable.setItems(sorted);

        observableHardpoints.addListener((ListChangeListener<ShipModuleData>) c -> hardpointTable.refresh());
        sorted.setComparator((a, b)->
        {
            HardpointSlot slotA = ((HardpointSlot) a.getModuleName());
            HardpointSlot slotB = ((HardpointSlot) b.getModuleName());
            return slotA.compareTo(slotB);
        });
    }

    private void synchronizeStatistics()
    {
        Platform.runLater(()->
        {
            synchronized (observableStatistics)
            {
                observableStatistics.clear();
                observableStatistics.addAll(statistics);
            }
        });
    }

    private void synchronizeCoreInternals()
    {
        Platform.runLater(()->
        {
            synchronized (observableCoreInternals)
            {
                observableCoreInternals.clear();
                observableCoreInternals.addAll(coreInternals);
            }
        });
    }

    private void synchronizeOptionalInternals()
    {
        Platform.runLater(()->
        {
            synchronized (observableOptionalInternals)
            {
                observableOptionalInternals.clear();
                observableOptionalInternals.addAll(optionalInternals);
            }
        });
    }

    private void synchronizeHardpoints()
    {
        Platform.runLater(()->
        {
            synchronized (observableHardpoints)
            {
                observableHardpoints.clear();
                observableHardpoints.addAll(hardpoints);
            }
        });
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;

        synchronized (coreInternals)
        {
            coreInternals.clear();
            synchronizeCoreInternals();
        }

        synchronized (optionalInternals)
        {
            optionalInternals.clear();
            synchronizeOptionalInternals();
        }

        synchronized (hardpoints)
        {
            hardpoints.clear();
            synchronizeHardpoints();
        }

        resetBaseStats();
    }

    public void setGivenName(String givenName)
    {
        if (givenName == null) return;
        Platform.runLater(() ->
        {
            synchronized (shipGivenName)
            {
                shipGivenName.set(givenName);
            }
        });
    }

    public void setShipID(String ID)
    {
        if (ID == null) return;
        Platform.runLater(() ->
        {
            synchronized (shipID)
            {
                shipID.set(ID.toUpperCase());
            }
        });
    }

    public void setCurrentFuel(double currentFuel)
    {
        this.currentFuel = currentFuel;
    }

    private void resetBaseStats()
    {
        if (ship == null) return;

        // make a local copy just to be safe
        final String displayName = ship.getBaseShipStats().getDisplayName();
        final String manufacturer = ship.getBaseShipStats().getManufacturer().toString();

        Platform.runLater(()->
        {
            synchronized (shipDisplayName)
            {
                shipDisplayName.set(displayName);
            }

            synchronized (shipManufacturerName)
            {
                shipManufacturerName.set(manufacturer);
            }
        });

        synchronized (statistics)
        {
            statistics.clear();

            statistics.add(new ShipStatisticData(ship.getBaseShipStats().getShipSize()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Mass_Lock_Factor, ship.getBaseShipStats().getMassLockFactor()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Crew_Seats, ship.getBaseShipStats().getCrewSeats()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.SLF_Capable, ship.getBaseShipStats().isSlfCapable()));

            statistics.add(new ShipStatisticData(ShipCharacteristic.Base_Hull_Mass, ship.getBaseShipStats().getHullMass()));

            statistics.add(new ShipStatisticData(ShipCharacteristic.Agility, ship.getBaseShipStats().getAgility()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Speed, ship.getBaseShipStats().getSpeed()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Boost_Speed, ship.getBaseShipStats().getBoostSpeed()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Max_Speed, ship.getBaseShipStats().getMaxSpeed()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Max_Boost_Speed, ship.getBaseShipStats().getMaxBoostSpeed()));

            statistics.add(new ShipStatisticData(ShipCharacteristic.Hull_Hardness, ship.getBaseShipStats().getHullHardness()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Armor_Rating, ship.getBaseShipStats().getArmorRating()));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Base_Shield, ship.getBaseShipStats().getShield()));

            synchronizeStatistics();
        }
    }

    private synchronized Stream<ShipModuleData> bufferedStream(List<ShipModuleData> modules)
    {
        List<ShipModuleData> buffer = new ArrayList<>();

        if (modules == coreInternals)
        {
            synchronized (coreInternals)
            {
                buffer.addAll(coreInternals);
            }
        }

        if (modules == optionalInternals)
        {
            synchronized (optionalInternals)
            {
                buffer.addAll(optionalInternals);
            }
        }

        if (modules == hardpoints)
        {
            synchronized (hardpoints)
            {
                buffer.addAll(hardpoints);
            }
        }

        return buffer.stream();
    }

    synchronized void installShipModule(ShipModuleData shipModuleData)
    {
        // todo: perform checking for support in the Ship object

        // note the remove() calls in each conditional before the add calls. This may seem strange, but is leveraging
        // the overridden equals() method in the ShipModuleData class to ensure only one module is present in a given
        // internal slot. This makes it ok to call installShipModule() multiple times with new ShipModuleData objects that
        // contain updated stats (for example, if the player upgrades or changes a mod on an existing item).

        if (CoreInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            synchronized (coreInternals)
            {
                coreInternals.remove(shipModuleData);
                coreInternals.add(shipModuleData);
                synchronizeCoreInternals();
            }
        }

        if (OptionalInternalSlot.typeMatches(shipModuleData.getModuleName()))
        {
            synchronized (optionalInternals)
            {
                optionalInternals.remove(shipModuleData);
                optionalInternals.add(shipModuleData);
                synchronizeOptionalInternals();
            }
        }

        if (HardpointSlot.typeMatches(shipModuleData.getModuleName()))
        {
            synchronized (hardpoints)
            {
                hardpoints.remove(shipModuleData);
                hardpoints.add(shipModuleData);
                synchronizeHardpoints();
            }
        }

        // todo: determine if this can be delayed until all modules have been added in some cases, to avoid
        // unnecessary calculations
        calculateCurrentStats();
    }

    // rounds a double value to a given precision
    private double round(double value, int precision)
    {
        if (precision < 0) return value;
        BigDecimal decimal = new BigDecimal(value);
        decimal = decimal.setScale(precision, RoundingMode.HALF_UP);
        return decimal.doubleValue();
    }

    /**
     * Updates ship statistics table to reflect this ships' current characteristics
     */
    private void calculateCurrentStats()
    {
        double hullStrength = calculateCurrentHullStrength();
        double shieldStrength = calculateCurrentShieldStrength();

        double armourCausticResistance = calculateResistance(ShipCharacteristic.Armour_Caustic_Resistance);
        double armourExplosiveResistance = calculateResistance(ShipCharacteristic.Armour_Explosive_Resistance);
        double armourKineticResistance = calculateResistance(ShipCharacteristic.Armour_Kinetic_Resistance);
        double armourThermalResistance = calculateResistance(ShipCharacteristic.Armour_Thermal_Resistance);

        double shieldExplosiveResistance = calculateResistance(ShipCharacteristic.Shield_Explosive_Resistance);
        double shieldKineticResistance = calculateResistance(ShipCharacteristic.Shield_Kinetic_Resistance);
        double shieldThermalResistance = calculateResistance(ShipCharacteristic.Shield_Thermal_Resistance);

        synchronized (statistics)
        {
            resetBaseStats();

            statistics.add(new ShipStatisticData(ShipCharacteristic.Unladen_Mass, calculateUnladenHullMass()));

            statistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Strength, shieldStrength));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Kinetic_Resistance, shieldKineticResistance));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Thermal_Resistance, shieldThermalResistance));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Shield_Explosive_Resistance, shieldExplosiveResistance));

            statistics.add(new ShipStatisticData(ShipCharacteristic.Hull_Strength, hullStrength));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Kinetic_Resistance, armourKineticResistance));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Thermal_Resistance, armourThermalResistance));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Explosive_Resistance, armourExplosiveResistance));
            statistics.add(new ShipStatisticData(ShipCharacteristic.Armour_Caustic_Resistance, armourCausticResistance));

            synchronizeStatistics();
        }
    }

    private static final Predicate<Double> nonZero = (x) -> Objects.requireNonNull(x) != 0.0d;

    private double getArmorResistanceTotal(ItemEffect resistanceEffect)
    {
        Stream.Builder<Double> resistances = Stream.builder();

        coreInternals.stream()
                .filter(module -> module.getModule().modificationType() == ModificationType.Bulkheads)
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .mapToDouble(Double::doubleValue)
                .map(next -> 100d - next)
                .map(Math::abs)
                .map(next -> next / 100d)
                .forEach(resistances::accept);

        optionalInternals.stream()
                .filter(module -> module.getModule().modificationType() == ModificationType.Hull_Reinforcement_Package)
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(nonZero)
                .mapToDouble(Double::doubleValue)
                .map(next -> 100d - next)
                .map(Math::abs)
                .map(next -> next / 100d)
                .forEach(resistances::accept);

        double rawResistance = resistances.build()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        double calculatedResistance = 100 - rawResistance * 100d;


        if (calculatedResistance > 25)
        {
            calculatedResistance = UIFunctions.Data.mapRange(calculatedResistance, 25, 100, 25, 75);
        }

        return calculatedResistance;
    }

    private double getShieldResistanceTotal(ItemEffect resistanceEffect)
    {
        List<Double> resistances = new ArrayList<>();

        optionalInternals.stream()
                .filter(module -> module.getModule().modificationType() == ModificationType.Shield_Generator)
                .map(module -> module.getEffectValue(resistanceEffect))
                .filter(x -> x != 0)
                .mapToDouble(Double::doubleValue)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .forEach(resistances::add);

        hardpoints.stream()
                .filter(hardpoint -> hardpoint.getModule() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() == ModificationType.Shield_Booster)
                .filter(hardpoint -> hardpoint.getModule().modificationType() == ModificationType.Shield_Booster)
                .map(hardpoint -> hardpoint.getEffectValue(resistanceEffect))
                .filter(x -> x != 0)
                .mapToDouble(Double::doubleValue)
                .map(next -> 100d - next)
                .map(next -> next / 100d)
                .forEach(resistances::add);

        double rawResistance = resistances.stream()
                .mapToDouble(Double::doubleValue)
                .reduce(1, (a, b) -> a * b);

        double calculatedResistance = 100 - rawResistance * 100d;


        if (calculatedResistance > 50 && resistanceEffect != ItemEffect.ExplosiveResistance)
        {
            calculatedResistance = UIFunctions.Data.mapRange(calculatedResistance, 50, 100, 50, 75);
        }

        return calculatedResistance;
    }

    private double calculateResistance(ShipCharacteristic resistanceType)
    {
        double calculatedResistance;
        switch (resistanceType)
        {
            case Armour_Caustic_Resistance:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.CausticResistance);
                break;

            case Armour_Explosive_Resistance:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Armour_Kinetic_Resistance:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Armour_Thermal_Resistance:
                calculatedResistance = getArmorResistanceTotal(ItemEffect.ThermicResistance);
                break;

            case Shield_Explosive_Resistance:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ExplosiveResistance);
                break;

            case Shield_Kinetic_Resistance:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.KineticResistance);
                break;

            case Shield_Thermal_Resistance:
                calculatedResistance = getShieldResistanceTotal(ItemEffect.ThermicResistance);
                break;

            default: calculatedResistance = 0;
        }
        return round(calculatedResistance, 1);
    }

    /**
     * Calculates this ships' current hull strength. This check takes into account bulkhead armour and hull
     * reinforcement packages, and calculates a hull strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated hull strength for this ship
     */
    private double calculateCurrentHullStrength()
    {
        if (ship == null) return 0.0d;
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
        double hullStrength = ship.getBaseShipStats().getArmorRating();

        // loop through all the modules that can have hull reinforcement. For now, this
        // means only optional internals, but if this changes in the future, loop through
        // all relevant modules
        double hullReinforcement = optionalInternals.stream()
                .map(module -> module.getEffectValue(ItemEffect.DefenceModifierHealthAddition))
                .mapToDouble(Double::doubleValue)
                .sum();

        // right now, only armour modules can add hull boost, so we can loop through just the core
        // internals and filter in armour modules. In practice, this will only ever find one module
        double hullBoost = coreInternals.stream()
                .filter(m -> m.getModuleName() == CoreInternalSlot.Armour)
                .map(a -> a.getEffectValue(ItemEffect.DefenceModifierHealthMultiplier))
                .map(v -> v / 100d)
                .map(m -> hullStrength * m)
                .findFirst().orElse(0d);

        // calculate the final hull strength by adding the base bull, plus the boost and reinforcement adjustments
        double totalHullStrength = hullStrength +  hullBoost + hullReinforcement;

        // round the result to nearest whole number to match the in-game UI
        return round(totalHullStrength, 0);
    }

    /**
     * Calculates this ships' shield hull strength. This check takes into account the installed shield generator and
     * equipped shield boosters, and calculates a shield strength in a manner that should be consistent with what
     * the game produces in the cockpit UI panels.
     *
     * @return a calculated shield strength for this ship
     */
    private double calculateCurrentShieldStrength()
    {
        /*
        Before the total shield strength can be calculated, we must first determine the minimum and maximum mass
        and strength characteristics of the shield generator. When a modification is a applied to the optimal mass
        or optimal strength values of a shield generator, it also affects the associated minimum and maximum values
        of that characteristic. Unfortunately, the LoadoutHandler event only contains modified value for the optimal mass
        and/or strength stats. Fortunately calculating them is fairly easy, simply be determining the % change from
        the stock value and applying it to the minimum/maximum values as well.

        Note that for mass, the increase is not applied to the maximum value, so an increase in optimal mass will
        cause an increase in minimum mass, but NOT in maximum mass. For strength values, this is not teh case, and
        the percentage change is applied to both the minimum and maximum values.
         */

        // first check for an actual shield generator. The game ensures there will only ever be one generator
        // equipped, so there should only be one or none.
        ShipModuleData shieldGenerator = optionalInternals.stream()
                .filter(m->m.getModule().modificationType() == ModificationType.Shield_Generator)
                .findAny().orElse(null);

        // no generator means no shields, so just return zero
        if (shieldGenerator == null) return 0d;

        // get the ships base hull mass, this affects shield strength. Strength calculations only take into
        // account the base mass, additional modules do not affect strength in-game
        double hullMass = ship.getBaseShipStats().getHullMass();
        double maximumMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMaximumMass);

        // if the ship's mass exceeds maximum mass, the shield doesn't work
        if (hullMass > maximumMass) return 0d;

        // get the stock optimal mass so we can check for modifications
        double stockOptimalMass = shieldGenerator.getModule().itemEffects().effectStream()
                .filter(itemEffect -> itemEffect.getEffect() == ItemEffect.ShieldGenOptimalMass)
                .map(ItemEffectData::getDoubleValue)
                .findFirst().orElse(0d);

        // get the actual optimal and minimum mass values. if unmodified, optimal mass will match the stock value
        double optimalMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenOptimalMass);
        double minimumMass = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMinimumMass);

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
        double stockOptimalStrength = shieldGenerator.getModule().itemEffects().effectStream()
                .filter(e->e.getEffect()==ItemEffect.ShieldGenStrength)
                .map(ItemEffectData::getDoubleValue)
                .findFirst().orElse(0d);

        // get the actual optimal, minimum, and maximum values. As with mass, optimal will
        // equal stock if there is no modification applied. However, unlike mass, the modification
        // change must be applied to the maximum as well as the minimum
        double optimalStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenStrength);
        double minimumStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMinStrength);
        double maximumStrength = shieldGenerator.getEffectValue(ItemEffect.ShieldGenMaxStrength);

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
        double baseShield = ship.getBaseShipStats().getShield();

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
        double hullMassFactor = Math.min(1, hullMassRatio);
        double optimalMassFactor = Math.min(1, optimalMassRatio);

        // calculate a strength exponent to apply to the hull mass factor
        double strengthExponent = Math.log(strengthRatio) / Math.log(optimalMassFactor);

        // calculate the final shield power modifier
        double strengthPower = Math.pow(hullMassFactor, strengthExponent);

        // calculate the total shield multiplier and divide by 100, since it is applied as a percentage increase
        double shieldMultiplier = (minimumStrength + strengthPower * strengthRangeDifference) / 100d;

        // calculate the sum of 1 + all shield booster values, and divide by 100 for use as a percentage increase
        double accumulatedBoost = 1 + bufferedStream(hardpoints)
                .filter(Objects::nonNull)
                .filter(hardpoint -> hardpoint.getModule() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() != null)
                .filter(hardpoint -> hardpoint.getModule().modificationType() == ModificationType.Shield_Booster)
                .map(hardpoint -> hardpoint.getEffectValue(ItemEffect.DefenceModifierShieldMultiplier))
                .mapToDouble(Double::doubleValue)
                .sum() / 100d;

        // calculate all shield reinforcement
        double accumulatedShieldReinforcment = optionalInternals.stream()
                .map(m->m.getEffectValue(ItemEffect.DefenceModifierShieldAddition))
                .filter(i -> i != 0.0)
                .mapToDouble(i -> i).sum();

        // apply all the multipliers to the ship's base shield value to calculate the total shield strength
        double calculatedShield = (baseShield * shieldMultiplier * accumulatedBoost) + accumulatedShieldReinforcment;

        // round the result to nearest whole number to match the in-game UI
        return round(calculatedShield, 0);
    }

    private double calculateUnladenHullMass()
    {
        if (ship == null) return 0.0d;

        List<ShipModuleData> buffer;

        synchronized (coreInternals)
        {
            buffer = new ArrayList<>(coreInternals);
        }

        synchronized (optionalInternals)
        {
            buffer.addAll(optionalInternals);
        }

        synchronized (hardpoints)
        {
            buffer.addAll(hardpoints);
        }

        double moduleMass = buffer.stream()
                .map(module -> module.getEffectValue(ItemEffect.Mass))
                .mapToDouble(Double::doubleValue)
                .sum();

        double hullMass = ship.getBaseShipStats().getHullMass();

        double totalHullMass = //currentFuel +
                hullMass + moduleMass;

        // round the result to 1 decimal place to match the in-game UI
        return round(totalHullMass, 1);
    }
}
