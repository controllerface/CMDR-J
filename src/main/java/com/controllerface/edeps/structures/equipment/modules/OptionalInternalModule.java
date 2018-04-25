package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
public enum OptionalInternalModule implements ShipModule
{
    /**
     * Shield Generators
     */

    Int_ShieldGenerator_Size5_Class1,
    Int_ShieldGenerator_Size5_Class2,
    Int_ShieldGenerator_Size5_Class3,
    Int_ShieldGenerator_Size5_Class4,
    Int_ShieldGenerator_Size5_Class5,

    Int_ShieldGenerator_Size6_Class1,
    Int_ShieldGenerator_Size6_Class2,
    Int_ShieldGenerator_Size6_Class3,
    Int_ShieldGenerator_Size6_Class4,
    Int_ShieldGenerator_Size6_Class5,

    Int_ShieldGenerator_Size7_Class1,
    Int_ShieldGenerator_Size7_Class2,
    Int_ShieldGenerator_Size7_Class3,
    Int_ShieldGenerator_Size7_Class4,
    Int_ShieldGenerator_Size7_Class5,

    Int_ShieldGenerator_Size8_Class1,
    Int_ShieldGenerator_Size8_Class2,
    Int_ShieldGenerator_Size8_Class3,
    Int_ShieldGenerator_Size8_Class4,
    Int_ShieldGenerator_Size8_Class5,

    Int_ShieldGenerator_Size5_Class3_Fast,
    Int_ShieldGenerator_Size6_Class3_Fast,
    Int_ShieldGenerator_Size7_Class3_Fast,
    Int_ShieldGenerator_Size8_Class3_Fast,

    /**
     * Hull Reinforcement Packages
     */

    Int_HullReinforcement_Size1_Class1,
    Int_HullReinforcement_Size1_Class2,

    Int_HullReinforcement_Size2_Class1,
    Int_HullReinforcement_Size2_Class2,

    Int_HullReinforcement_Size3_Class1,
    Int_HullReinforcement_Size3_Class2,

    Int_HullReinforcement_Size4_Class1,
    Int_HullReinforcement_Size4_Class2,

    Int_HullReinforcement_Size5_Class1,
    Int_HullReinforcement_Size5_Class2,

    /**
     * Module Reinforcement Packages
     */

    Int_ModuleReinforcement_Size1_Class1,
    Int_ModuleReinforcement_Size1_Class2,

    Int_ModuleReinforcement_Size2_Class1,
    Int_ModuleReinforcement_Size2_Class2,

    Int_ModuleReinforcement_Size3_Class1,
    Int_ModuleReinforcement_Size3_Class2,

    Int_ModuleReinforcement_Size4_Class1,
    Int_ModuleReinforcement_Size4_Class2,

    Int_ModuleReinforcement_Size5_Class1,
    Int_ModuleReinforcement_Size5_Class2,

    /**
     * Fuel Scoops
     */

    Int_FuelScoop_Size1_Class1,
    Int_FuelScoop_Size1_Class2,
    Int_FuelScoop_Size1_Class3,
    Int_FuelScoop_Size1_Class4,
    Int_FuelScoop_Size1_Class5,

    Int_FuelScoop_Size2_Class1,
    Int_FuelScoop_Size2_Class2,
    Int_FuelScoop_Size2_Class3,
    Int_FuelScoop_Size2_Class4,
    Int_FuelScoop_Size2_Class5,

    Int_FuelScoop_Size3_Class1,
    Int_FuelScoop_Size3_Class2,
    Int_FuelScoop_Size3_Class3,
    Int_FuelScoop_Size3_Class4,
    Int_FuelScoop_Size3_Class5,

    Int_FuelScoop_Size4_Class1,
    Int_FuelScoop_Size4_Class2,
    Int_FuelScoop_Size4_Class3,
    Int_FuelScoop_Size4_Class4,
    Int_FuelScoop_Size4_Class5,

    Int_FuelScoop_Size5_Class1,
    Int_FuelScoop_Size5_Class2,
    Int_FuelScoop_Size5_Class3,
    Int_FuelScoop_Size5_Class4,
    Int_FuelScoop_Size5_Class5,

    Int_FuelScoop_Size6_Class1,
    Int_FuelScoop_Size6_Class2,
    Int_FuelScoop_Size6_Class3,
    Int_FuelScoop_Size6_Class4,
    Int_FuelScoop_Size6_Class5,

    Int_FuelScoop_Size7_Class1,
    Int_FuelScoop_Size7_Class2,
    Int_FuelScoop_Size7_Class3,
    Int_FuelScoop_Size7_Class4,
    Int_FuelScoop_Size7_Class5,

    Int_FuelScoop_Size8_Class1,
    Int_FuelScoop_Size8_Class2,
    Int_FuelScoop_Size8_Class3,
    Int_FuelScoop_Size8_Class4,
    Int_FuelScoop_Size8_Class5,

    /**
     * Cargo Racks
     */

    Int_CargoRack_Size6_Class1,

    /**
     * Limpet Controllers
     */

    Int_DroneControl_Collection_Size3_Class5,

    /**
     * SRV Bays
     */

    Int_BuggyBay_Size2_Class2,

    /**
     * Planetary Approach Suite
     */
    Int_PlanetApproachSuite,

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

        return Arrays.stream(OptionalInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
