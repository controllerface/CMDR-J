package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;

import java.util.Arrays;

/**
 * Created by Stephen on 4/24/2018.
 */
public enum HardpointModule implements ShipModule
{
    //todo: add all faction specific and tech broker items from coriolis.io data files

    /**
     * Beam Lasers
     */

    hpt_beamlaser_fixed_huge(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Huge Fixed Beam Laser"),
    hpt_beamlaser_fixed_large(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Large Fixed Beam Laser"),
    hpt_beamlaser_fixed_medium(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Medium Fixed Beam Laser"),
    hpt_beamlaser_fixed_small(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Small Fixed Beam Laser"),

    hpt_beamlaser_gimbal_huge(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Huge Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_large(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Large Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_medium(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Medium Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_small(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Small Gimballed Beam Laser"),

    hpt_beamlaser_turret_large(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Large Turreted Beam Laser"),
    hpt_beamlaser_turret_medium(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Medium Turreted Beam Laser"),
    hpt_beamlaser_turret_small(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Small Turreted Beam Laser"),


    /**
     * Burst Lasers
     */

    hpt_pulselaserburst_fixed_huge(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Huge Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_large(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "large Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_medium(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Medium Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_small(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Small Fixed Burst Laser"),

    hpt_pulselaserburst_gimbal_huge(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Huge Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_large(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Large Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_medium(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Medium Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_small(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Small Gimballed Burst Laser"),

    hpt_pulselaserburst_turret_large(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Large Turreted Burst Laser"),
    hpt_pulselaserburst_turret_medium(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Medium Turreted Burst Laser"),
    hpt_pulselaserburst_turret_small(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Small Turreted Burst Laser"),

    /**
     * Pulse Lasers
     */

    hpt_pulselaser_fixed_huge(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Huge Fixed Pulse Laser"),
    hpt_pulselaser_fixed_large(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Large Fixed Pulse Laser"),
    hpt_pulselaser_fixed_medium(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Medium Fixed Pulse Laser"),
    hpt_pulselaser_fixed_small(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Small Fixed Pulse Laser"),

    hpt_pulselaser_gimbal_huge(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Huge Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_large(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Large Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_medium(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Medium Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_small(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Small Gimballed Pulse Laser"),

    hpt_pulselaser_turret_large(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Large Turreted Pulse Laser"),
    hpt_pulselaser_turret_medium(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Medium Turreted Pulse Laser"),
    hpt_pulselaser_turret_small(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser,
            "Small Turreted Pulse Laser"),


    /**
     * Multi-Cannons
     */

    hpt_multicannon_fixed_huge(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Huge Fixed Multi-Cannon"),
    hpt_multicannon_fixed_large(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Large Fixed Multi-Cannon"),
    hpt_multicannon_fixed_medium(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Medium Fixed Multi-Cannon"),
    hpt_multicannon_fixed_small(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Small Fixed Multi-Cannon"),

    hpt_multicannon_gimbal_huge(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Huge Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_large(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Large Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_medium(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Medium Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_small(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Small Gimballed Multi-Cannon"),

    hpt_multicannon_turret_medium(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Medium Turreted Multi-Cannon"),
    hpt_multicannon_turret_small(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon,
            "Small Turreted Multi-Cannon"),


    /**
     * Cannons
     */

    hpt_cannon_fixed_huge(ModificationType.Cannon, ExperimentalType.Cannon,
            "Huge Fixed Cannon"),
    hpt_cannon_fixed_large(ModificationType.Cannon, ExperimentalType.Cannon,
            "Large Fixed Cannon"),
    hpt_cannon_fixed_medium(ModificationType.Cannon, ExperimentalType.Cannon,
            "Medium Fixed Cannon"),
    hpt_cannon_fixed_small(ModificationType.Cannon, ExperimentalType.Cannon,
            "Small Fixed Cannon"),

    hpt_cannon_gimbal_huge(ModificationType.Cannon, ExperimentalType.Cannon,
            "Huge Gimballed Cannon"),
    hpt_cannon_gimbal_large(ModificationType.Cannon, ExperimentalType.Cannon,
            "Large Gimballed Cannon"),
    hpt_cannon_gimbal_medium(ModificationType.Cannon, ExperimentalType.Cannon,
            "Medium Gimballed Cannon"),
    hpt_cannon_gimbal_small(ModificationType.Cannon, ExperimentalType.Cannon,
            "Small Gimballed Cannon"),

    hpt_cannon_turret_large(ModificationType.Cannon, ExperimentalType.Cannon,
            "Large Turreted Cannon"),
    hpt_cannon_turret_medium(ModificationType.Cannon, ExperimentalType.Cannon,
            "Medium Turreted Cannon"),
    hpt_cannon_turret_small(ModificationType.Cannon, ExperimentalType.Cannon,
            "Small Turreted Cannon"),


    /**
     * Fragment Cannons
     */

    hpt_slugshot_fixed_large(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Large Fixed Fragment Cannon"),
    hpt_slugshot_fixed_medium(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Medium Fixed Fragment Cannon"),
    hpt_slugshot_fixed_small(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Small Fixed Fragment Cannon"),

    hpt_slugshot_gimbal_large(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Large Gimballed Fragment Cannon"),
    hpt_slugshot_gimbal_medium(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Medium Gimballed Fragment Cannon"),
    hpt_slugshot_gimbal_small(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Small Gimballed Fragment Cannon"),

    hpt_slugshot_turret_large(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Large Turreted Fragment Cannon"),
    hpt_slugshot_turret_medium(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Medium Turreted Fragment Cannon"),
    hpt_slugshot_turret_small(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Small Turreted Fragment Cannon"),


    /**
     * Plasma Accelerators
     */

    hpt_plasmaaccelerator_fixed_huge(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            "Huge Fixed Plasma Accelerator"),
    hpt_plasmaaccelerator_fixed_large(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            "Large Fixed Plasma Accelerator"),
    hpt_plasmaaccelerator_fixed_medium(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            "Medium Fixed Plasma Accelerator"),


    /**
     * Railguns
     */

    hpt_railgun_fixed_medium(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            "Medium Fixed Railgun"),
    hpt_railgun_fixed_small(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            "Small Fixed Railgun"),


    /**
     * Shield Boosters
     */

    hpt_shieldbooster_size0_class1(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            "0E Shield Booster"),
    hpt_shieldbooster_size0_class2(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            "0D Shield Booster"),
    hpt_shieldbooster_size0_class3(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            "0C Shield Booster"),
    hpt_shieldbooster_size0_class4(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            "0B Shield Booster"),
    hpt_shieldbooster_size0_class5(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster,
            "0A Shield Booster"),

    /**
     * Dumbfire Missile racks
     */

    hpt_dumbfiremissilerack_fixed_medium(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            "Medium Fixed Missile Rack"),
    hpt_dumbfiremissilerack_fixed_small(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            "Small Fixed Missile Rack"),


    /**
     * Seeker Missile Racks
     */

    hpt_basicmissilerack_fixed_medium(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            "Medium Fixed Seeker Missile Rack"),
    hpt_basicmissilerack_fixed_small(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            "Small Fixed Seeker Missile Rack"),


    /**
     * Mine Launchers
     */

    hpt_minelauncher_fixed_medium(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            "Medium Fixed Mine Launcher"),
    hpt_minelauncher_fixed_small(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            "Small Fixed Mine Launcher"),
    hpt_minelauncher_fixed_small_impulse(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher,
            "Small Fixed Shock Mine Launcher"),


    /**
     * Torpedo Pylons
     */

    hpt_advancedtorppylon_fixed_medium(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            "Medium Fixed Torpedo Pylon"),
    hpt_advancedtorppylon_fixed_small(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon,
            "Small Fixed Torpedo Pylon"),


    /**
     * Mining Lasers
     */

    hpt_mininglaser_fixed_medium(null, null,
            "Medium Fixed Mining Laser"),
    hpt_mininglaser_turret_medium(null, null,
            "Medium Turreted Mining Laser"),
    hpt_mininglaser_fixed_small(null, null,
            "Small Fixed Mining Laser"),
    hpt_mininglaser_turret_small(null, null,
            "Small Turreted Mining Laser"),

    /**
     * Wake Scanners
     */

    hpt_cloudscanner_size0_class1(ModificationType.Frame_Shift_Wake_Scanner, null,
            "0E FSD Wake Scanner"),
    hpt_cloudscanner_size0_class2(ModificationType.Frame_Shift_Wake_Scanner, null,
            "0D FSD Wake Scanner"),
    hpt_cloudscanner_size0_class3(ModificationType.Frame_Shift_Wake_Scanner, null,
            "0C FSD Wake Scanner"),
    hpt_cloudscanner_size0_class4(ModificationType.Frame_Shift_Wake_Scanner, null,
            "0B FSD Wake Scanner"),
    hpt_cloudscanner_size0_class5(ModificationType.Frame_Shift_Wake_Scanner, null,
            "0A FSD Wake Scanner"),


    /**
     * Kill Warrant Scanners
     */

    hpt_crimescanner_size0_class1(ModificationType.Kill_Warrant_Scanner, null,
            "0E Kill_warrant Scanner"),
    hpt_crimescanner_size0_class2(ModificationType.Kill_Warrant_Scanner, null,
            "0D Kill_warrant Scanner"),
    hpt_crimescanner_size0_class3(ModificationType.Kill_Warrant_Scanner, null,
            "0C Kill_warrant Scanner"),
    hpt_crimescanner_size0_class4(ModificationType.Kill_Warrant_Scanner, null,
            "0B Kill_warrant Scanner"),
    hpt_crimescanner_size0_class5(ModificationType.Kill_Warrant_Scanner, null,
            "0A Kill_warrant Scanner"),


    /**
     * Manifest Scanners
     */

    hpt_cargoscanner_size0_class1(ModificationType.Manifest_Scanner, null,
            "0E Manifest Scanner"),
    hpt_cargoscanner_size0_class2(ModificationType.Manifest_Scanner, null,
            "0D Manifest Scanner"),
    hpt_cargoscanner_size0_class3(ModificationType.Manifest_Scanner, null,
            "0C Manifest Scanner"),
    hpt_cargoscanner_size0_class4(ModificationType.Manifest_Scanner, null,
            "0B Manifest Scanner"),
    hpt_cargoscanner_size0_class5(ModificationType.Manifest_Scanner, null,
            "0A Manifest Scanner"),


    /**
     * Chaff Launcher, Heat-Sink Launcher, Point Defense, Electronic Countermeasures
     */

    hpt_chafflauncher_tiny(ModificationType.Chaff_Launcher, null,
            "Chaff Launcher"),
    hpt_heatsinklauncher_turret_tiny(ModificationType.Heat_Sink_Launcher, null,
            "Heat-Sink Launcher"),
    hpt_plasmapointdefence_turret_tiny(ModificationType.Point_Defense, null,
            "Point Defense Turret"),
    hpt_electroniccountermeasure_tiny(ModificationType.Electronic_Countermeasures, null,
            "Electronic Counter-Measures"),


    /**
     * Faction Specific Weapons
     */

    // todo: need to find out the ENUm values for these
    // Mining Lance/Mining Laser - (Zemina Torval)
    // Disruptor/Pulse Laser (Felicia Winters)
    // Enforcer/Multi-Cannon (Pranav Antal)

    // Archon Delaine
    hpt_pulselaserburst_fixed_small_scatter(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser,
            "Small Fixed Cytoscrambler (Burst Laser)"),

    // Edmund Mahon
    hpt_beamlaser_fixed_small_heat(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser,
            "Small Fixed Retributor (Beam Laser)"),

    // Zachary Hudson
    hpt_slugshot_fixed_large_range(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon,
            "Large Fixed Pacifier (Fragment Cannon)"),

    // Denton Patreus
    hpt_plasmaaccelerator_fixed_large_advanced(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator,
            "Large Fixed Plasma Accelerator (Advanced)"),

    // Arissa Lavigny-Duval
    hpt_railgun_fixed_medium_burst(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun,
            "Medium Fixed Imperial Hammer (Rail Gun)"),

    // Yuri Grom
    hpt_dumbfiremissilerack_fixed_medium_lasso(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack,
            "Medium Fixed Containment Missile (Missile Rack)"),

    // Li Yong-Rui
    hpt_drunkmissilerack_fixed_medium(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack,
            "Medium Pixed Pack-Hound (Seeker Missile Rack)"),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Weapons and Items
     */

    hpt_atmulticannon_fixed_large(null, null,
            "Large Fixed Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_fixed_medium(null, null,
            "Medium Fixed Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_turret_large(null, null,
            "Large Turreted Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_turret_medium(null, null,
            "Medium Turreted Anti-Thargoid Multi-Cannon"),

    hpt_atdumbfiremissile_fixed_large(null, null,
            "Large Fixed Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_fixed_medium(null, null,
            "Medium Fixed Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_turret_large(null, null,
            "Large Turreted Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_turret_medium(null, null,
            "Medium Turreted Anti-Thargoid Missile Rack"),

    hpt_flakmortar_fixed_medium(null, null,
            "Medium Fixed Remote Release Flak Launcher"),
    hpt_flakmortar_turret_medium(null, null,
            "Medium Turreted Remote Release Flak Launcher"),

    hpt_antiunknownshutdown_tiny(null, null,
            "Shutdown Field Neutraliser"),
    hpt_xenoscanner_basic_tiny(null, null,
            "Xeno Scanner"),

    //todo: add guardian and human tech broker weapons

    ;

    private final String displayText;
    private final ProcurementType modificationType;
    private final ProcurementType experimentalType;

    HardpointModule(ProcurementType modificationType, ProcurementType experimentalType, String displayText)
    {
        this.modificationType = modificationType;
        this.experimentalType = experimentalType;
        this.displayText = displayText;
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
