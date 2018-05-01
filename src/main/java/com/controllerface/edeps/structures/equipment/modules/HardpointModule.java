package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

import java.util.Arrays;

/**
 * Created by Stephen on 4/24/2018.
 */
public enum HardpointModule implements ShipModule
{
    /**
     * Beam Lasers
     */

    hpt_beamlaser_fixed_huge,
    hpt_beamlaser_fixed_large,
    hpt_beamlaser_fixed_medium,
    hpt_beamlaser_fixed_small,

    hpt_beamlaser_gimbal_huge,
    hpt_beamlaser_gimbal_large,
    hpt_beamlaser_gimbal_medium,
    hpt_beamlaser_gimbal_small,

    hpt_beamlaser_turret_large,
    hpt_beamlaser_turret_medium,
    hpt_beamlaser_turret_small,


    /**
     * Burst Lasers
     */

    hpt_pulselaserburst_fixed_huge,
    hpt_pulselaserburst_fixed_large,
    hpt_pulselaserburst_fixed_medium,
    hpt_pulselaserburst_fixed_small,

    hpt_pulselaserburst_gimbal_huge,
    hpt_pulselaserburst_gimbal_large,
    hpt_pulselaserburst_gimbal_medium,
    hpt_pulselaserburst_gimbal_small,

    hpt_pulselaserburst_turret_large,
    hpt_pulselaserburst_turret_medium,
    hpt_pulselaserburst_turret_small,

    /**
     * Pulse Lasers
     */

    hpt_pulselaser_fixed_huge,
    hpt_pulselaser_fixed_large,
    hpt_pulselaser_fixed_medium,
    hpt_pulselaser_fixed_small,

    hpt_pulselaser_gimbal_huge,
    hpt_pulselaser_gimbal_large,
    hpt_pulselaser_gimbal_medium,
    hpt_pulselaser_gimbal_small,

    hpt_pulselaser_turret_large,
    hpt_pulselaser_turret_medium,
    hpt_pulselaser_turret_small,


    /**
     * Multi-Cannons
     */

    hpt_multicannon_fixed_huge,
    hpt_multicannon_fixed_large,
    hpt_multicannon_fixed_medium,
    hpt_multicannon_fixed_small,

    hpt_multicannon_gimbal_huge,
    hpt_multicannon_gimbal_large,
    hpt_multicannon_gimbal_medium,
    hpt_multicannon_gimbal_small,

    hpt_multicannon_turret_medium,
    hpt_multicannon_turret_small,


    /**
     * Cannons
     */

    hpt_cannon_fixed_huge,
    hpt_cannon_fixed_large,
    hpt_cannon_fixed_medium,
    hpt_cannon_fixed_small,

    hpt_cannon_gimbal_huge,
    hpt_cannon_gimbal_large,
    hpt_cannon_gimbal_medium,
    hpt_cannon_gimbal_small,

    hpt_cannon_turret_large,
    hpt_cannon_turret_medium,
    hpt_cannon_turret_small,


    /**
     * Fragment Cannons
     */

    hpt_slugshot_fixed_large,
    hpt_slugshot_fixed_medium,
    hpt_slugshot_fixed_small,

    hpt_slugshot_gimbal_large,
    hpt_slugshot_gimbal_medium,
    hpt_slugshot_gimbal_small,

    hpt_slugshot_turret_large,
    hpt_slugshot_turret_medium,
    hpt_slugshot_turret_small,


    /**
     * Plasma Accelerators
     */

    hpt_plasmaaccelerator_fixed_huge,
    hpt_plasmaaccelerator_fixed_large,
    hpt_plasmaaccelerator_fixed_medium,


    /**
     * Railguns
     */

    hpt_railgun_fixed_medium,
    hpt_railgun_fixed_small,


    /**
     * Shield Boosters
     */

    hpt_shieldbooster_size0_class1,
    hpt_shieldbooster_size0_class2,
    hpt_shieldbooster_size0_class3,
    hpt_shieldbooster_size0_class4,
    hpt_shieldbooster_size0_class5,

    /**
     * Dumbfire Missile racks
     */

    hpt_dumbfiremissilerack_fixed_medium,
    hpt_dumbfiremissilerack_fixed_small,


    /**
     * Seeker Missile Racks
     */

    hpt_basicmissilerack_fixed_medium,
    hpt_basicmissilerack_fixed_small,


    /**
     * Mine Launchers
     */

    hpt_minelauncher_fixed_medium,
    hpt_minelauncher_fixed_small,
    hpt_minelauncher_fixed_small_impulse, // faction weapon


    /**
     * Torpedo Pylons
     */

    hpt_advancedtorppylon_fixed_medium,
    hpt_advancedtorppylon_fixed_small,


    /**
     * Mining Lasers
     */

    hpt_mininglaser_fixed_medium,
    hpt_mininglaser_turret_medium,
    hpt_mininglaser_fixed_small,
    hpt_mininglaser_turret_small,

    /**
     * Wake Scanners
     */

    hpt_cloudscanner_size0_class1,
    hpt_cloudscanner_size0_class2,
    hpt_cloudscanner_size0_class3,
    hpt_cloudscanner_size0_class4,
    hpt_cloudscanner_size0_class5,


    /**
     * Kill Warrant Scanners
     */

    hpt_crimescanner_size0_class1,
    hpt_crimescanner_size0_class2,
    hpt_crimescanner_size0_class3,
    hpt_crimescanner_size0_class4,
    hpt_crimescanner_size0_class5,


    /**
     * Manifest Scanners
     */

    hpt_cargoscanner_size0_class1,
    hpt_cargoscanner_size0_class2,
    hpt_cargoscanner_size0_class3,
    hpt_cargoscanner_size0_class4,
    hpt_cargoscanner_size0_class5,


    /**
     * Chaff Launcher, Heat-Sink Launcher, Point Defense, Electronic Countermeasures
     */

    hpt_chafflauncher_tiny,
    hpt_heatsinklauncher_turret_tiny,
    hpt_plasmapointdefence_turret_tiny,
    hpt_electroniccountermeasure_tiny,


    /**
     * Experimental (AEGIS, Anti-Thargoid) Weapons and Items
     */

    hpt_atmulticannon_fixed_large,
    hpt_atmulticannon_fixed_medium,
    hpt_atmulticannon_turret_large,
    hpt_atmulticannon_turret_medium,

    hpt_atdumbfiremissile_fixed_large,
    hpt_atdumbfiremissile_fixed_medium,
    hpt_atdumbfiremissile_turret_large,
    hpt_atdumbfiremissile_turret_medium,

    hpt_flakmortar_fixed_medium,
    hpt_flakmortar_turret_medium,

    hpt_antiunknownshutdown_tiny,
    hpt_xenoscanner_basic_tiny,

    ;


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
