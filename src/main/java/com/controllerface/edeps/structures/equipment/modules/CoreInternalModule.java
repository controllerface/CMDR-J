package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
public enum CoreInternalModule implements ShipModule
{

    /**
     * Cargo Bay Door
     */
    ModularCargoBayDoor,

    /**
     * Cockpits
     */

    Vulture_Cockpit,
    Python_Cockpit,


    /**
     * Ship Armor
     */

    Vulture_Armour_Grade1,
    Vulture_Armour_Grade2,
    Vulture_Armour_Grade3,
    Vulture_Armour_Grade4,
    Vulture_Armour_Grade5,

    Python_Armour_Grade1,
    Python_Armour_Grade2,
    Python_Armour_Grade3,
    Python_Armour_Grade4,
    Python_Armour_Grade5,

    /**
     * Power Plants
     */

    Int_Powerplant_Size2_Class1,
    Int_Powerplant_Size2_Class2,
    Int_Powerplant_Size2_Class3,
    Int_Powerplant_Size2_Class4,
    Int_Powerplant_Size2_Class5,

    Int_Powerplant_Size3_Class1,
    Int_Powerplant_Size3_Class2,
    Int_Powerplant_Size3_Class3,
    Int_Powerplant_Size3_Class4,
    Int_Powerplant_Size3_Class5,

    Int_Powerplant_Size4_Class1,
    Int_Powerplant_Size4_Class2,
    Int_Powerplant_Size4_Class3,
    Int_Powerplant_Size4_Class4,
    Int_Powerplant_Size4_Class5,

    Int_Powerplant_Size5_Class1,
    Int_Powerplant_Size5_Class2,
    Int_Powerplant_Size5_Class3,
    Int_Powerplant_Size5_Class4,
    Int_Powerplant_Size5_Class5,

    Int_Powerplant_Size6_Class1,
    Int_Powerplant_Size6_Class2,
    Int_Powerplant_Size6_Class3,
    Int_Powerplant_Size6_Class4,
    Int_Powerplant_Size6_Class5,

    Int_Powerplant_Size7_Class1,
    Int_Powerplant_Size7_Class2,
    Int_Powerplant_Size7_Class3,
    Int_Powerplant_Size7_Class4,
    Int_Powerplant_Size7_Class5,

    Int_Powerplant_Size8_Class1,
    Int_Powerplant_Size8_Class2,
    Int_Powerplant_Size8_Class3,
    Int_Powerplant_Size8_Class4,
    Int_Powerplant_Size8_Class5,


    /**
     * Thrusters
     */

    Int_Engine_Size2_Class1,
    Int_Engine_Size2_Class2,
    Int_Engine_Size2_Class3,
    Int_Engine_Size2_Class4,
    Int_Engine_Size2_Class5,

    Int_Engine_Size3_Class1,
    Int_Engine_Size3_Class2,
    Int_Engine_Size3_Class3,
    Int_Engine_Size3_Class4,
    Int_Engine_Size3_Class5,

    Int_Engine_Size4_Class1,
    Int_Engine_Size4_Class2,
    Int_Engine_Size4_Class3,
    Int_Engine_Size4_Class4,
    Int_Engine_Size4_Class5,

    Int_Engine_Size5_Class1,
    Int_Engine_Size5_Class2,
    Int_Engine_Size5_Class3,
    Int_Engine_Size5_Class4,
    Int_Engine_Size5_Class5,

    Int_Engine_Size6_Class1,
    Int_Engine_Size6_Class2,
    Int_Engine_Size6_Class3,
    Int_Engine_Size6_Class4,
    Int_Engine_Size6_Class5,

    Int_Engine_Size7_Class1,
    Int_Engine_Size7_Class2,
    Int_Engine_Size7_Class3,
    Int_Engine_Size7_Class4,
    Int_Engine_Size7_Class5,

    Int_Engine_Size8_Class1,
    Int_Engine_Size8_Class2,
    Int_Engine_Size8_Class3,
    Int_Engine_Size8_Class4,
    Int_Engine_Size8_Class5,



    /**
     * Frame Shift Drives
     */

    Int_Hyperdrive_Size2_Class1,
    Int_Hyperdrive_Size2_Class2,
    Int_Hyperdrive_Size2_Class3,
    Int_Hyperdrive_Size2_Class4,
    Int_Hyperdrive_Size2_Class5,

    Int_Hyperdrive_Size3_Class1,
    Int_Hyperdrive_Size3_Class2,
    Int_Hyperdrive_Size3_Class3,
    Int_Hyperdrive_Size3_Class4,
    Int_Hyperdrive_Size3_Class5,

    Int_Hyperdrive_Size4_Class1,
    Int_Hyperdrive_Size4_Class2,
    Int_Hyperdrive_Size4_Class3,
    Int_Hyperdrive_Size4_Class4,
    Int_Hyperdrive_Size4_Class5,

    Int_Hyperdrive_Size5_Class1,
    Int_Hyperdrive_Size5_Class2,
    Int_Hyperdrive_Size5_Class3,
    Int_Hyperdrive_Size5_Class4,
    Int_Hyperdrive_Size5_Class5,

    Int_Hyperdrive_Size6_Class1,
    Int_Hyperdrive_Size6_Class2,
    Int_Hyperdrive_Size6_Class3,
    Int_Hyperdrive_Size6_Class4,
    Int_Hyperdrive_Size6_Class5,

    Int_Hyperdrive_Size7_Class1,
    Int_Hyperdrive_Size7_Class2,
    Int_Hyperdrive_Size7_Class3,
    Int_Hyperdrive_Size7_Class4,
    Int_Hyperdrive_Size7_Class5,


    /**
     * Life-Support Systems
     */

    Int_LifeSupport_Size1_Class1,
    Int_LifeSupport_Size1_Class2,
    Int_LifeSupport_Size1_Class3,
    Int_LifeSupport_Size1_Class4,
    Int_LifeSupport_Size1_Class5,

    Int_LifeSupport_Size2_Class1,
    Int_LifeSupport_Size2_Class2,
    Int_LifeSupport_Size2_Class3,
    Int_LifeSupport_Size2_Class4,
    Int_LifeSupport_Size2_Class5,

    Int_LifeSupport_Size3_Class1,
    Int_LifeSupport_Size3_Class2,
    Int_LifeSupport_Size3_Class3,
    Int_LifeSupport_Size3_Class4,
    Int_LifeSupport_Size3_Class5,

    Int_LifeSupport_Size4_Class1,
    Int_LifeSupport_Size4_Class2,
    Int_LifeSupport_Size4_Class3,
    Int_LifeSupport_Size4_Class4,
    Int_LifeSupport_Size4_Class5,

    Int_LifeSupport_Size5_Class1,
    Int_LifeSupport_Size5_Class2,
    Int_LifeSupport_Size5_Class3,
    Int_LifeSupport_Size5_Class4,
    Int_LifeSupport_Size5_Class5,

    Int_LifeSupport_Size6_Class1,
    Int_LifeSupport_Size6_Class2,
    Int_LifeSupport_Size6_Class3,
    Int_LifeSupport_Size6_Class4,
    Int_LifeSupport_Size6_Class5,

    Int_LifeSupport_Size7_Class1,
    Int_LifeSupport_Size7_Class2,
    Int_LifeSupport_Size7_Class3,
    Int_LifeSupport_Size7_Class4,
    Int_LifeSupport_Size7_Class5,

    Int_LifeSupport_Size8_Class1,
    Int_LifeSupport_Size8_Class2,
    Int_LifeSupport_Size8_Class3,
    Int_LifeSupport_Size8_Class4,
    Int_LifeSupport_Size8_Class5,


    /**
     * Power Distributors
     */

    Int_PowerDistributor_Size1_Class1,
    Int_PowerDistributor_Size1_Class2,
    Int_PowerDistributor_Size1_Class3,
    Int_PowerDistributor_Size1_Class4,
    Int_PowerDistributor_Size1_Class5,

    Int_PowerDistributor_Size2_Class1,
    Int_PowerDistributor_Size2_Class2,
    Int_PowerDistributor_Size2_Class3,
    Int_PowerDistributor_Size2_Class4,
    Int_PowerDistributor_Size2_Class5,

    Int_PowerDistributor_Size3_Class1,
    Int_PowerDistributor_Size3_Class2,
    Int_PowerDistributor_Size3_Class3,
    Int_PowerDistributor_Size3_Class4,
    Int_PowerDistributor_Size3_Class5,

    Int_PowerDistributor_Size4_Class1,
    Int_PowerDistributor_Size4_Class2,
    Int_PowerDistributor_Size4_Class3,
    Int_PowerDistributor_Size4_Class4,
    Int_PowerDistributor_Size4_Class5,

    Int_PowerDistributor_Size5_Class1,
    Int_PowerDistributor_Size5_Class2,
    Int_PowerDistributor_Size5_Class3,
    Int_PowerDistributor_Size5_Class4,
    Int_PowerDistributor_Size5_Class5,

    Int_PowerDistributor_Size6_Class1,
    Int_PowerDistributor_Size6_Class2,
    Int_PowerDistributor_Size6_Class3,
    Int_PowerDistributor_Size6_Class4,
    Int_PowerDistributor_Size6_Class5,

    Int_PowerDistributor_Size7_Class1,
    Int_PowerDistributor_Size7_Class2,
    Int_PowerDistributor_Size7_Class3,
    Int_PowerDistributor_Size7_Class4,
    Int_PowerDistributor_Size7_Class5,

    Int_PowerDistributor_Size8_Class1,
    Int_PowerDistributor_Size8_Class2,
    Int_PowerDistributor_Size8_Class3,
    Int_PowerDistributor_Size8_Class4,
    Int_PowerDistributor_Size8_Class5,


    /**
     * Sensors
     */

    Int_Sensors_Size1_Class1,
    Int_Sensors_Size1_Class2,
    Int_Sensors_Size1_Class3,
    Int_Sensors_Size1_Class4,
    Int_Sensors_Size1_Class5,

    Int_Sensors_Size2_Class1,
    Int_Sensors_Size2_Class2,
    Int_Sensors_Size2_Class3,
    Int_Sensors_Size2_Class4,
    Int_Sensors_Size2_Class5,

    Int_Sensors_Size3_Class1,
    Int_Sensors_Size3_Class2,
    Int_Sensors_Size3_Class3,
    Int_Sensors_Size3_Class4,
    Int_Sensors_Size3_Class5,

    Int_Sensors_Size4_Class1,
    Int_Sensors_Size4_Class2,
    Int_Sensors_Size4_Class3,
    Int_Sensors_Size4_Class4,
    Int_Sensors_Size4_Class5,

    Int_Sensors_Size5_Class1,
    Int_Sensors_Size5_Class2,
    Int_Sensors_Size5_Class3,
    Int_Sensors_Size5_Class4,
    Int_Sensors_Size5_Class5,

    Int_Sensors_Size6_Class1,
    Int_Sensors_Size6_Class2,
    Int_Sensors_Size6_Class3,
    Int_Sensors_Size6_Class4,
    Int_Sensors_Size6_Class5,

    Int_Sensors_Size7_Class1,
    Int_Sensors_Size7_Class2,
    Int_Sensors_Size7_Class3,
    Int_Sensors_Size7_Class4,
    Int_Sensors_Size7_Class5,

    Int_Sensors_Size8_Class1,
    Int_Sensors_Size8_Class2,
    Int_Sensors_Size8_Class3,
    Int_Sensors_Size8_Class4,
    Int_Sensors_Size8_Class5,

    /**
     * Fuel Tanks
     */

    Int_FuelTank_Size1_Class1,
    Int_FuelTank_Size1_Class2,
    Int_FuelTank_Size1_Class3,
    Int_FuelTank_Size1_Class4,
    Int_FuelTank_Size1_Class5,

    Int_FuelTank_Size2_Class1,
    Int_FuelTank_Size2_Class2,
    Int_FuelTank_Size2_Class3,
    Int_FuelTank_Size2_Class4,
    Int_FuelTank_Size2_Class5,

    Int_FuelTank_Size3_Class1,
    Int_FuelTank_Size3_Class2,
    Int_FuelTank_Size3_Class3,
    Int_FuelTank_Size3_Class4,
    Int_FuelTank_Size3_Class5,

    Int_FuelTank_Size4_Class1,
    Int_FuelTank_Size4_Class2,
    Int_FuelTank_Size4_Class3,
    Int_FuelTank_Size4_Class4,
    Int_FuelTank_Size4_Class5,

    Int_FuelTank_Size5_Class1,
    Int_FuelTank_Size5_Class2,
    Int_FuelTank_Size5_Class3,
    Int_FuelTank_Size5_Class4,
    Int_FuelTank_Size5_Class5,

    Int_FuelTank_Size6_Class1,
    Int_FuelTank_Size6_Class2,
    Int_FuelTank_Size6_Class3,
    Int_FuelTank_Size6_Class4,
    Int_FuelTank_Size6_Class5,

    Int_FuelTank_Size7_Class1,
    Int_FuelTank_Size7_Class2,
    Int_FuelTank_Size7_Class3,
    Int_FuelTank_Size7_Class4,
    Int_FuelTank_Size7_Class5,

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

        return Arrays.stream(CoreInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
