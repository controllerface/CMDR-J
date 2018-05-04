package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

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

    hpt_beamlaser_fixed_huge("Huge Fixed Beam Laser"),
    hpt_beamlaser_fixed_large("Large Fixed Beam Laser"),
    hpt_beamlaser_fixed_medium("Medium Fixed Beam Laser"),
    hpt_beamlaser_fixed_small("Small Fixed Beam Laser"),

    hpt_beamlaser_gimbal_huge("Huge Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_large("Large Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_medium("Medium Gimballed Beam Laser"),
    hpt_beamlaser_gimbal_small("Small Gimballed Beam Laser"),

    hpt_beamlaser_turret_large("Large Turreted Beam Laser"),
    hpt_beamlaser_turret_medium("Medium Turreted Beam Laser"),
    hpt_beamlaser_turret_small("Small Turreted Beam Laser"),


    /**
     * Burst Lasers
     */

    hpt_pulselaserburst_fixed_huge("Huge Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_large("large Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_medium("Medium Fixed Burst Laser"),
    hpt_pulselaserburst_fixed_small("Small Fixed Burst Laser"),

    hpt_pulselaserburst_gimbal_huge("Huge Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_large("Large Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_medium("Medium Gimballed Burst Laser"),
    hpt_pulselaserburst_gimbal_small("Small Gimballed Burst Laser"),

    hpt_pulselaserburst_turret_large("Large Turreted Burst Laser"),
    hpt_pulselaserburst_turret_medium("Medium Turreted Burst Laser"),
    hpt_pulselaserburst_turret_small("Small Turreted Burst Laser"),

    /**
     * Pulse Lasers
     */

    hpt_pulselaser_fixed_huge("Huge Fixed Pulse Laser"),
    hpt_pulselaser_fixed_large("Large Fixed Pulse Laser"),
    hpt_pulselaser_fixed_medium("Medium Fixed Pulse Laser"),
    hpt_pulselaser_fixed_small("Small Fixed Pulse Laser"),

    hpt_pulselaser_gimbal_huge("Huge Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_large("Large Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_medium("Medium Gimballed Pulse Laser"),
    hpt_pulselaser_gimbal_small("Small Gimballed Pulse Laser"),

    hpt_pulselaser_turret_large("Large Turreted Pulse Laser"),
    hpt_pulselaser_turret_medium("Medium Turreted Pulse Laser"),
    hpt_pulselaser_turret_small("Small Turreted Pulse Laser"),


    /**
     * Multi-Cannons
     */

    hpt_multicannon_fixed_huge("Huge Fixed Multi-Cannon"),
    hpt_multicannon_fixed_large("Large Fixed Multi-Cannon"),
    hpt_multicannon_fixed_medium("Medium Fixed Multi-Cannon"),
    hpt_multicannon_fixed_small("Small Fixed Multi-Cannon"),

    hpt_multicannon_gimbal_huge("Huge Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_large("Large Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_medium("Medium Gimballed Multi-Cannon"),
    hpt_multicannon_gimbal_small("Small Gimballed Multi-Cannon"),

    hpt_multicannon_turret_medium("Medium Turreted Multi-Cannon"),
    hpt_multicannon_turret_small("Small Turreted Multi-Cannon"),


    /**
     * Cannons
     */

    hpt_cannon_fixed_huge("Huge Fixed Cannon"),
    hpt_cannon_fixed_large("Large Fixed Cannon"),
    hpt_cannon_fixed_medium("Medium Fixed Cannon"),
    hpt_cannon_fixed_small("Small Fixed Cannon"),

    hpt_cannon_gimbal_huge("Huge Gimballed Cannon"),
    hpt_cannon_gimbal_large("Large Gimballed Cannon"),
    hpt_cannon_gimbal_medium("Medium Gimballed Cannon"),
    hpt_cannon_gimbal_small("Small Gimballed Cannon"),

    hpt_cannon_turret_large("Large Turreted Cannon"),
    hpt_cannon_turret_medium("Medium Turreted Cannon"),
    hpt_cannon_turret_small("Small Turreted Cannon"),


    /**
     * Fragment Cannons
     */

    hpt_slugshot_fixed_large("Large Fixed Fragment Cannon"),
    hpt_slugshot_fixed_medium("Medium Fixed Fragment Cannon"),
    hpt_slugshot_fixed_small("Small Fixed Fragment Cannon"),

    hpt_slugshot_gimbal_large("Large Gimballed Fragment Cannon"),
    hpt_slugshot_gimbal_medium("Medium Gimballed Fragment Cannon"),
    hpt_slugshot_gimbal_small("Small Gimballed Fragment Cannon"),

    hpt_slugshot_turret_large("Large Turreted Fragment Cannon"),
    hpt_slugshot_turret_medium("Medium Turreted Fragment Cannon"),
    hpt_slugshot_turret_small("Small Turreted Fragment Cannon"),


    /**
     * Plasma Accelerators
     */

    hpt_plasmaaccelerator_fixed_huge("Huge Fixed Plasma Accelerator"),
    hpt_plasmaaccelerator_fixed_large("Large Fixed Plasma Accelerator"),
    hpt_plasmaaccelerator_fixed_medium("Medium Fixed Plasma Accelerator"),


    /**
     * Railguns
     */

    hpt_railgun_fixed_medium("Medium Fixed Railgun"),
    hpt_railgun_fixed_small("Small Fixed Railgun"),


    /**
     * Shield Boosters
     */

    hpt_shieldbooster_size0_class1("0E Shield Booster"),
    hpt_shieldbooster_size0_class2("0D Shield Booster"),
    hpt_shieldbooster_size0_class3("0C Shield Booster"),
    hpt_shieldbooster_size0_class4("0B Shield Booster"),
    hpt_shieldbooster_size0_class5("0A Shield Booster"),

    /**
     * Dumbfire Missile racks
     */

    hpt_dumbfiremissilerack_fixed_medium("Medium Fixed Missile Rack"),
    hpt_dumbfiremissilerack_fixed_small("Small Fixed Missile Rack"),


    /**
     * Seeker Missile Racks
     */

    hpt_basicmissilerack_fixed_medium("Medium Fixed Seeker Missile Rack"),
    hpt_basicmissilerack_fixed_small("Small Fixed Seeker Missile Rack"),


    /**
     * Mine Launchers
     */

    hpt_minelauncher_fixed_medium("Medium Fixed Mine Launcher"),
    hpt_minelauncher_fixed_small("Small Fixed Mine Launcher"),
    hpt_minelauncher_fixed_small_impulse("Small Fixed Impulse Mine Launcher"), // faction weapon


    /**
     * Torpedo Pylons
     */

    hpt_advancedtorppylon_fixed_medium("Medium Fixed Torpedo Pylon"),
    hpt_advancedtorppylon_fixed_small("Small Fixed Torpedo Pylon"),


    /**
     * Mining Lasers
     */

    hpt_mininglaser_fixed_medium("Medium Fixed Mining Laser"),
    hpt_mininglaser_turret_medium("Medium Turreted Mining Laser"),
    hpt_mininglaser_fixed_small("Small Fixed Mining Laser"),
    hpt_mininglaser_turret_small("Small Turreted Mining Laser"),

    /**
     * Wake Scanners
     */

    hpt_cloudscanner_size0_class1("0E FSD Wake Scanner"),
    hpt_cloudscanner_size0_class2("0D FSD Wake Scanner"),
    hpt_cloudscanner_size0_class3("0C FSD Wake Scanner"),
    hpt_cloudscanner_size0_class4("0B FSD Wake Scanner"),
    hpt_cloudscanner_size0_class5("0A FSD Wake Scanner"),


    /**
     * Kill Warrant Scanners
     */

    hpt_crimescanner_size0_class1("0E Kill_warrant Scanner"),
    hpt_crimescanner_size0_class2("0D Kill_warrant Scanner"),
    hpt_crimescanner_size0_class3("0C Kill_warrant Scanner"),
    hpt_crimescanner_size0_class4("0B Kill_warrant Scanner"),
    hpt_crimescanner_size0_class5("0A Kill_warrant Scanner"),


    /**
     * Manifest Scanners
     */

    hpt_cargoscanner_size0_class1("0E Manifest Scanner"),
    hpt_cargoscanner_size0_class2("0D Manifest Scanner"),
    hpt_cargoscanner_size0_class3("0C Manifest Scanner"),
    hpt_cargoscanner_size0_class4("0B Manifest Scanner"),
    hpt_cargoscanner_size0_class5("0A Manifest Scanner"),


    /**
     * Chaff Launcher, Heat-Sink Launcher, Point Defense, Electronic Countermeasures
     */

    hpt_chafflauncher_tiny("Chaff Launcher"),
    hpt_heatsinklauncher_turret_tiny("Heat-Sink Launcher"),
    hpt_plasmapointdefence_turret_tiny("Point Defense Turret"),
    hpt_electroniccountermeasure_tiny("Electronic Counter-Measures"),


    /**
     * Experimental (AEGIS, Anti-Thargoid) Weapons and Items
     */

    hpt_atmulticannon_fixed_large("Large Fixed Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_fixed_medium("Medium Fixed Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_turret_large("Large Turreted Anti-Thargoid Multi-Cannon"),
    hpt_atmulticannon_turret_medium("Medium Turreted Anti-Thargoid Multi-Cannon"),

    hpt_atdumbfiremissile_fixed_large("Large Fixed Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_fixed_medium("Medium Fixed Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_turret_large("Large Turreted Anti-Thargoid Missile Rack"),
    hpt_atdumbfiremissile_turret_medium("Medium Turreted Anti-Thargoid Missile Rack"),

    hpt_flakmortar_fixed_medium("Medium Fixed Remote Release Flak Launcher"),
    hpt_flakmortar_turret_medium("Medium Turreted Remote Release Flak Launcher"),

    hpt_antiunknownshutdown_tiny("Shutdown Field Neutraliser"),
    hpt_xenoscanner_basic_tiny("Xeno Scanner"),

    //todo: add guardian and human tech broker weapons

    ;

    private final String displayText;

    HardpointModule(String displayText)
    {
        this.displayText = displayText;
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
