package com.controllerface.cmdr_j.enums.craftable.modifications;

import com.controllerface.cmdr_j.interfaces.tasks.TaskCategory;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 3/31/2018.
 */
public enum ModificationCategory implements TaskCategory
{
    Core_Internal(EnumSet.of(ModificationType.Frame_Shift_Drive,
        ModificationType.Life_Support,
        ModificationType.Power_Distributor,
        ModificationType.Power_Plant,
        ModificationType.Sensors,
        ModificationType.Thrusters,
        ModificationType.Bulkheads)),

    Optional_Internal(EnumSet.of(ModificationType.Auto_Field_Maintenence_Unit,
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
        ModificationType.Shield_Generator)),

    Utility_Mounts(EnumSet.of(ModificationType.Chaff_Launcher,
        ModificationType.Heat_Sink_Launcher,
        ModificationType.Point_Defense,
        ModificationType.Electronic_Countermeasures,
        ModificationType.Frame_Shift_Wake_Scanner,
        ModificationType.Kill_Warrant_Scanner,
        ModificationType.Manifest_Scanner,
        ModificationType.Shield_Booster)),

    Weapon_Hardpoints(EnumSet.of(ModificationType.Beam_Laser,
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
        ModificationType.Rail_Gun)),

    Suits(EnumSet.of(ModificationType.Added_Melee_Damage,
        ModificationType.Combat_Movement_Speed,
        ModificationType.Damage_Resistance,
        ModificationType.Enhanced_Tracking,
        ModificationType.Extra_Ammo_Capacity,
        ModificationType.Extra_Backpack_Capacity,
        ModificationType.Faster_Shield_Regen,
        ModificationType.Improved_Battery_Capacity,
        ModificationType.Improved_Jump_Assist,
        ModificationType.Increased_Air_Reserves,
        ModificationType.Increased_Sprint_Duration,
        ModificationType.Night_Vision,
        ModificationType.Reduced_Tool_Battery_Consumption
    )),

    Personal_Weapons(EnumSet.of(ModificationType.Faster_Handling,
        ModificationType.Greater_Range,
        ModificationType.Head_Shot_Damage,
        ModificationType.Improved_Hip_Fire_Accuracy,
        ModificationType.Magazine_Size,
        ModificationType.Noise_Suppressor,
        ModificationType.Reload_Speed,
        ModificationType.Scope,
        ModificationType.Stability,
        ModificationType.Stowed_Reloading)),

    ;

    private final EnumSet<ModificationType> modificationTypes;

    ModificationCategory(EnumSet<ModificationType> modificationTypes)
    {
        this.modificationTypes = modificationTypes;
        this.modificationTypes.forEach(t->t.setParentCategory(this));
    }

    public Stream<ModificationType> typeStream()
    {
        return modificationTypes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }
}
