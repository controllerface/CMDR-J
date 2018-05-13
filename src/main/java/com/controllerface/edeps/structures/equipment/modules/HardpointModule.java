package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;

import java.util.Arrays;

/**
 * Created by Stephen on 4/24/2018.
 */
@SuppressWarnings("unchecked")
public enum HardpointModule implements ShipModule
{
    /**
     * Beam Lasers
     */

    hpt_beamlaser_fixed_small("Small Fixed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_gimbal_small("Small Gimballed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_turret_small("Small Turreted Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),

    hpt_beamlaser_fixed_small_heat("Small Fixed Retributor (Beam Laser)", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),

    hpt_beamlaser_fixed_medium("Medium Fixed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_gimbal_medium("Medium Gimballed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_turret_medium("Medium Turreted Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),

    hpt_beamlaser_fixed_large("Large Fixed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_gimbal_large("Large Gimballed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_turret_large("Large Turreted Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),

    hpt_beamlaser_fixed_huge("Huge Fixed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),
    hpt_beamlaser_gimbal_huge("Huge Gimballed Beam Laser", ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            new ItemEffects()),


    /**
     * Burst Lasers
     */

    hpt_pulselaserburst_fixed_small("Small Fixed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_gimbal_small("Small Gimballed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_turret_small("Small Turreted Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),

    hpt_pulselaserburst_fixed_small_scatter("Small Fixed Cytoscrambler (Burst Laser)", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),

    hpt_pulselaserburst_fixed_medium("Medium Fixed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_gimbal_medium("Medium Gimballed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_turret_medium("Medium Turreted Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),

    hpt_pulselaserburst_fixed_large("large Fixed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_gimbal_large("Large Gimballed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_turret_large("Large Turreted Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),

    hpt_pulselaserburst_fixed_huge("Huge Fixed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),
    hpt_pulselaserburst_gimbal_huge("Huge Gimballed Burst Laser", ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            new ItemEffects()),


    /**
     * Pulse Lasers
     */

    hpt_pulselaser_fixed_small("Small Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_gimbal_small("Small Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_turret_small("Small Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),

    hpt_pulselaser_fixed_medium("Medium Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_gimbal_medium("Medium Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_turret_medium("Medium Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),

    hpt_pulselaser_fixed_medium_disruptor("Medium Fixed Disruptor (Pulse Laser)", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),

    hpt_pulselaser_fixed_large("Large Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_gimbal_large("Large Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_turret_large("Large Turreted Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),

    hpt_pulselaser_fixed_huge("Huge Fixed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),
    hpt_pulselaser_gimbal_huge("Huge Gimballed Pulse Laser", ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            new ItemEffects()),


    /**
     * Multi-Cannons
     */

    hpt_multicannon_fixed_small("Small Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_gimbal_small("Small Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_turret_small("Small Turreted Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),

    hpt_multicannon_fixed_small_strong("Small Fixed Enforcer (Multi-Cannon)", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),

    hpt_multicannon_fixed_medium("Medium Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_gimbal_medium("Medium Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_turret_medium("Medium Turreted Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),

    hpt_multicannon_fixed_large("Large Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_gimbal_large("Large Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),

    hpt_multicannon_fixed_huge("Huge Fixed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),
    hpt_multicannon_gimbal_huge("Huge Gimballed Multi-Cannon", ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            new ItemEffects()),


    /**
     * Cannons
     */

    hpt_cannon_fixed_small("Small Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_small("Small Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_small("Small Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_medium("Medium Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_medium("Medium Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_medium("Medium Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_large("Large Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_large("Large Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_turret_large("Large Turreted Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),

    hpt_cannon_fixed_huge("Huge Fixed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),
    hpt_cannon_gimbal_huge("Huge Gimballed Cannon", ModificationType.Cannon, ExperimentalType.Cannon,
            new ItemEffects()),


    /**
     * Fragment Cannons
     */
    hpt_slugshot_fixed_small("Small Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_small("Small Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_small("Small Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_medium("Medium Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_medium("Medium Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_medium("Medium Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_large("Large Fixed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_gimbal_large("Large Gimballed Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),
    hpt_slugshot_turret_large("Large Turreted Fragment Cannon", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),

    hpt_slugshot_fixed_large_range("Large Fixed Pacifier (Fragment Cannon)", ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            new ItemEffects()),


    /**
     * Plasma Accelerators
     */

    hpt_plasmaaccelerator_fixed_medium("Medium Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_large_advanced("Large Fixed Plasma Accelerator (Advanced)", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_large("Large Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),
    hpt_plasmaaccelerator_fixed_huge("Huge Fixed Plasma Accelerator", ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            new ItemEffects()),


    /**
     * Railguns
     */

    hpt_railgun_fixed_small("Small Fixed Railgun", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),

    hpt_railgun_fixed_medium_burst("Medium Fixed Imperial Hammer (Rail Gun)", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),

    hpt_railgun_fixed_medium("Medium Fixed Railgun", ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            new ItemEffects()),


    /**
     * Shield Boosters
     */

    hpt_shieldbooster_size0_class1("0E Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class2("0D Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class3("0C Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class4("0B Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),
    hpt_shieldbooster_size0_class5("0A Shield Booster", ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            new ItemEffects()),

    /**
     * Dumbfire Missile racks
     */

    hpt_dumbfiremissilerack_fixed_small("Small Fixed Missile Rack", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),

    hpt_dumbfiremissilerack_fixed_medium_lasso("Medium Fixed Containment Missile (Missile Rack)", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),

    hpt_dumbfiremissilerack_fixed_medium("Medium Fixed Missile Rack", ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            new ItemEffects()),



    /**
     * Seeker Missile Racks
     */

    hpt_basicmissilerack_fixed_small("Small Fixed Seeker Missile Rack", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),

    hpt_drunkmissilerack_fixed_medium("Medium Pixed Pack-Hound (Seeker Missile Rack)", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),

    hpt_basicmissilerack_fixed_medium("Medium Fixed Seeker Missile Rack", ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            new ItemEffects()),


    /**
     * Mine Launchers
     */

    hpt_minelauncher_fixed_small("Small Fixed Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),
    hpt_minelauncher_fixed_small_impulse("Small Fixed Shock Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),
    hpt_minelauncher_fixed_medium("Medium Fixed Mine Launcher", ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            new ItemEffects()),

    /**
     * Torpedo Pylons
     */

    hpt_advancedtorppylon_fixed_small("Small Fixed Torpedo Pylon", ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            new ItemEffects()),
    hpt_advancedtorppylon_fixed_medium("Medium Fixed Torpedo Pylon", ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            new ItemEffects()),


    /**
     * Mining Lasers
     */
    hpt_mininglaser_fixed_small("Small Fixed Mining Laser", null, null,
            new ItemEffects()),
    hpt_mininglaser_turret_small("Small Turreted Mining Laser", null, null,
            new ItemEffects()),

    hpt_mininglaser_fixed_small_advanced("Small Fixed Mining Lance", null, null,
            new ItemEffects()),

    hpt_mininglaser_fixed_medium("Medium Fixed Mining Laser", null, null,
            new ItemEffects()),
    hpt_mininglaser_turret_medium("Medium Turreted Mining Laser", null, null,
            new ItemEffects()),


    /**
     * Wake Scanners
     */

    hpt_cloudscanner_size0_class1("0E FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class2("0D FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class3("0C FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class4("0B FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),
    hpt_cloudscanner_size0_class5("0A FSD Wake Scanner", ModificationType.Frame_Shift_Wake_Scanner, null,
            new ItemEffects()),


    /**
     * Kill Warrant Scanners
     */

    hpt_crimescanner_size0_class1("0E Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class2("0D Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class3("0C Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class4("0B Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),
    hpt_crimescanner_size0_class5("0A Kill_warrant Scanner", ModificationType.Kill_Warrant_Scanner, null,
            new ItemEffects()),


    /**
     * Manifest Scanners
     */

    hpt_cargoscanner_size0_class1("0E Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class2("0D Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class3("0C Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class4("0B Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),
    hpt_cargoscanner_size0_class5("0A Manifest Scanner", ModificationType.Manifest_Scanner, null,
            new ItemEffects()),


    /**
     * Chaff Launcher, Heat-Sink Launcher, Point Defense, Electronic Countermeasures
     */

    hpt_chafflauncher_tiny("Chaff Launcher", ModificationType.Chaff_Launcher, null,
            new ItemEffects()),
    hpt_heatsinklauncher_turret_tiny("Heat-Sink Launcher", ModificationType.Heat_Sink_Launcher, null,
            new ItemEffects()),
    hpt_plasmapointdefence_turret_tiny("Point Defense Turret", ModificationType.Point_Defense, null,
            new ItemEffects()),
    hpt_electroniccountermeasure_tiny("Electronic Counter-Measures", ModificationType.Electronic_Countermeasures, null,
            new ItemEffects()),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Weapons and Items
     */

    hpt_atmulticannon_fixed_large("Large Fixed Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_fixed_medium("Medium Fixed Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_turret_large("Large Turreted Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),
    hpt_atmulticannon_turret_medium("Medium Turreted Anti-Thargoid Multi-Cannon", null, null,
            new ItemEffects()),

    hpt_atdumbfiremissile_fixed_large("Large Fixed Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_fixed_medium("Medium Fixed Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_turret_large("Large Turreted Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),
    hpt_atdumbfiremissile_turret_medium("Medium Turreted Anti-Thargoid Missile Rack", null, null,
            new ItemEffects()),

    hpt_flakmortar_fixed_medium("Medium Fixed Remote Release Flak Launcher", null, null,
            new ItemEffects()),
    hpt_flakmortar_turret_medium("Medium Turreted Remote Release Flak Launcher", null, null,
            new ItemEffects()),

    /**
     * Guardian Weapons
     */

    // todo: find ENUM values for these
    // Guardian Shard Cannon/Fixed
    // Guardian Shard Cannon/Turreted

    hpt_guardian_gausscannon_fixed_medium("Medium Fixed Guardian Gauss Cannon", null, null,
            new ItemEffects()),

    hpt_guardian_plasmalauncher_fixed_medium("Medium Fixed Guardian Plasma Launcher", null, null,
            new ItemEffects()),

    hpt_guardian_plasmalauncher_turret_medium("Medium Turreted Guardian Plasma Launcher", null, null,
            new ItemEffects()),


    /**
     * Human Tech Broker Weapons
     */

    // todo: verify ENUM values for these, they may be guessed

    hpt_causticmissile_fixed_medium("Medium Fixed Enzyme Missile Rack", null, null,
            new ItemEffects()),

    hpt_flechettelauncher_fixed_medium("Medium Fixed Remote Release Flechette Launcher", null, null,
            new ItemEffects()),
    hpt_flechettelauncher_turret_medium("Medium Turreted Remote Release Flechette Launcher", null, null,
            new ItemEffects()),

    hpt_plasmashockcannon_fixed_medium("Medium Fixed Shock Cannon", null, null,
            new ItemEffects()),
    hpt_plasmashockcannon_gimbal_medium("Medium Gimballed Shock Cannon", null, null,
            new ItemEffects()),
    hpt_plasmashockcannon_turret_medium("Medium Turreted Shock Cannon", null, null,
            new ItemEffects()),

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;
    private final ItemEffects itemEffects;

    HardpointModule(String displayText, ProcurementType modificationType, ProcurementType experimentalType, ItemEffects itemEffects)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
        this.itemEffects = itemEffects;
    }

    @Override
    public ProcurementType modificationType()
    {
        return modificationType;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return experimentalType;
    }

    @Override
    public String displayText()
    {
        return displayText;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return itemEffects;
    }

    public static ShipModule findModule(String moduleName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(moduleName);
        }
        catch (Exception e)
        {
            exception = e;
            if (moduleName == null || moduleName.isEmpty()) throw e;
        }

        return Arrays.stream(HardpointModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(() -> exception);
    }
}
