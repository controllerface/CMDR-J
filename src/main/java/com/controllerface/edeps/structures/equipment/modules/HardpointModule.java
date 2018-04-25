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

    Hpt_BeamLaser_Turret_Small,
    Hpt_BeamLaser_Turret_Medium,
    Hpt_BeamLaser_Turret_Large,

    Hpt_BeamLaser_Gimbal_Small,
    Hpt_BeamLaser_Gimbal_Medium,
    Hpt_BeamLaser_Gimbal_Large,
    Hpt_BeamLaser_Gimbal_Huge,

    Hpt_BeamLaser_Fixed_Small,
    Hpt_BeamLaser_Fixed_Medium,
    Hpt_BeamLaser_Fixed_Large,
    Hpt_BeamLaser_Fixed_Huge,


    /**
     * Burst Lasers
     */

    Hpt_BurstLaser_Turret_Small,
    Hpt_BurstLaser_Turret_Medium,
    Hpt_BurstLaser_Turret_Large,

    Hpt_BurstLaser_Gimbal_Small,
    Hpt_BurstLaser_Gimbal_Medium,
    Hpt_BurstLaser_Gimbal_Large,
    Hpt_BurstLaser_Gimbal_Huge,

    Hpt_BurstLaser_Fixed_Small,
    Hpt_BurstLaser_Fixed_Medium,
    Hpt_BurstLaser_Fixed_Large,
    Hpt_BurstLaser_Fixed_Huge,


    /**
     * Pulse Lasers
     */

    Hpt_PulseLaser_Turret_Small,
    Hpt_PulseLaser_Turret_Medium,
    Hpt_PulseLaser_Turret_Large,

    Hpt_PulseLaser_Gimbal_Small,
    Hpt_PulseLaser_Gimbal_Medium,
    Hpt_PulseLaser_Gimbal_Large,
    Hpt_PulseLaser_Gimbal_Huge,

    Hpt_PulseLaser_Fixed_Small,
    Hpt_PulseLaser_Fixed_Medium,
    Hpt_PulseLaser_Fixed_Large,
    Hpt_PulseLaser_Fixed_Huge,


    /**
     * Multi-Cannons
     */

    Hpt_MultiCannon_Turret_Small,
    Hpt_MultiCannon_Turret_Medium,

    Hpt_MultiCannon_Gimbal_Small,
    Hpt_MultiCannon_Gimbal_Medium,
    Hpt_MultiCannon_Gimbal_Large,
    Hpt_MultiCannon_Gimbal_Huge,

    Hpt_MultiCannon_Fixed_Small,
    Hpt_MultiCannon_Fixed_Medium,
    Hpt_MultiCannon_Fixed_Large,
    Hpt_MultiCannon_Fixed_Huge,


    /**
     * Cannons
     */

    Hpt_Cannon_Turret_Small,
    Hpt_Cannon_Turret_Medium,

    Hpt_Cannon_Gimbal_Small,
    Hpt_Cannon_Gimbal_Medium,
    Hpt_Cannon_Gimbal_Large,
    Hpt_Cannon_Gimbal_Huge,

    Hpt_Cannon_Fixed_Small,
    Hpt_Cannon_Fixed_Medium,
    Hpt_Cannon_Fixed_Large,
    Hpt_Cannon_Fixed_Huge,


    /**
     * Fragment Cannons
     */

    Hpt_Fragment_Cannon_Turret_Small,
    Hpt_Fragment_Cannon_Turret_Medium,
    Hpt_Fragment_Cannon_Turret_Large,

    Hpt_Fragment_Cannon_Gimbal_Small,
    Hpt_Fragment_Cannon_Gimbal_Medium,
    Hpt_Fragment_Cannon_Gimbal_Large,

    Hpt_Fragment_Cannon_Fixed_Small,
    Hpt_Fragment_Cannon_Fixed_Medium,
    Hpt_Fragment_Cannon_Fixed_Large,


    /**
     * Plasma Accelerators
     */

    Hpt_Plasma_Accelerator_Fixed_Medium,
    Hpt_Plasma_Accelerator_Fixed_Large,
    Hpt_Plasma_Accelerator_Fixed_Huge,


    /**
     * Railguns
     */

    Hpt_Railgun_Fixed_Small,
    Hpt_Railgun_Fixed_Medium,


    /**
     * Shield Boosters
     */

    Hpt_ShieldBooster_Size0_Class1,
    Hpt_ShieldBooster_Size0_Class2,
    Hpt_ShieldBooster_Size0_Class3,
    Hpt_ShieldBooster_Size0_Class4,
    Hpt_ShieldBooster_Size0_Class5,

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
