package com.controllerface.edeps.enums.modifications;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 3/31/2018.
 */
public enum ModificationCategory
{
    Weapon_Hardpoints(ModificationType.Beam_Laser,
            ModificationType.Burst_Laser,
            ModificationType.Pulse_Laser,
            ModificationType.Cannon,
            ModificationType.Multi_Cannon,
            ModificationType.Fragment_Cannon,
            ModificationType.Missile_Rack,
            ModificationType.Seeker_Missile_Rack,
            ModificationType.Torpedo_Pylon,
            ModificationType.Mine_Launcher,
            ModificationType.Plasma_Accelerator,
            ModificationType.Rail_Gun),

    Utility_Mounts(ModificationType.Chaff_Launcher,
            ModificationType.Heat_Sink_Launcher,
            ModificationType.Point_Defense,
            ModificationType.Electronic_Countermeasures,
            ModificationType.Frame_Shift_Wake_Scanner,
            ModificationType.Kill_Warrant_Scanner,
            ModificationType.Manifest_Scanner,
            ModificationType.Shield_Booster),

    Optional_Internal(ModificationType.Auto_Field_Maintenence_Unit,
            ModificationType.Hull_Reinforcement_Package,
            ModificationType.Detailed_Surface_Scanner,
            ModificationType.Refinery,
            ModificationType.Frame_Shift_Drive_Interdictor,
            ModificationType.Fuel_Scoop,
            ModificationType.Collector_Limpet_Controller,
            ModificationType.Prospector_Limpet_Controller,
            ModificationType.Fuel_Transfer_Limpet,
            ModificationType.Hatch_Breaker_Limpet,
            ModificationType.Shield_Cell_Bank,
            ModificationType.Shield_Generator),

    Core_Internal(ModificationType.Frame_Shift_Drive,
            ModificationType.Life_Support,
            ModificationType.Power_Distributor,
            ModificationType.Power_Plant,
            ModificationType.Sensors,
            ModificationType.Thrusters,
            ModificationType.Bulkheads);

    private final ModificationType[] modificationTypes;

    ModificationCategory(ModificationType ... modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<ModificationType> typeStream()
    {
        return Arrays.stream(modificationTypes);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
