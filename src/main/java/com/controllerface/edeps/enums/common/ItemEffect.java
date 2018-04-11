package com.controllerface.edeps.enums.common;

/**
 * Created by Stephen on 4/6/2018.
 */
public enum ItemEffect
{
    All_Resistances(true),
    Ammo_Capacity(true),
    Area_FSD_Reboot(true),
    Area_Heat_Increased_Sensors_Disrupted(true),
    Armour_Piercing(true),
    Auto_Reload_While_Firing(true),
    Boot_Time(false),
    Broken_Regen_Rate(true),
    Burst_Rate_Of_Fire(true),
    Burst_Size(true),
    Clip_Size(true),
    Damage(true),
    Damage_Falloff_Start(true),
    Damage_Increases_With_Heat_Level(true),
    Damage_Partially_Explosive(true),
    Damage_Partially_Kinetic(true),
    Damage_Partially_Thermal(true),
    Distributor_Draw(false),
    Duration(true),
    Effectiveness_Increase_Against_Munitions(true),
    Engines_Capacity(true),
    Engines_Recharge(true),
    Explosive_Resitance(true),
    Facing_Limit(true),
    Heat_Efficiency(false),
    Heat_Reduced_When_Striking_Target(true),
    Hull_Boost(true),
    Hull_Reinforcement(true),
    Integrity(true),
    Jitter(false),
    Kinetic_Resistance(true),
    Mass(false),
    Maximum_Fuel_Per_Jump(true),
    Maximum_Range(true),
    No_Damage_To_Untargeted_Ships(true),
    Optimal_Mass(true),
    Optimal_Multiplier(true),
    Optimal_Strength(true),
    Part_Of_Damage_Through_Shields(true),
    Power_Capacity(true),
    Power_Draw(false),
    Power_Generation(true),
    Power_Recharge(true),
    Range(true),
    Rate_Of_Fire(true),
    Regen_Rate(true),
    Reload_From_Ship_Fuel(true),
    Reload_Time(false),
    Scan_Angle(true),
    Scan_Range(true),
    Scan_Rate(true),
    Scan_Time(false),
    Shield_Boost(true),
    Shield_Reinforcement(true),
    Shielded_Target_Heat_Increased(true),
    Shot_Speed(true),
    Spin_Up_Time(false),
    Systems_Capacity(true),
    Systems_Recharge(true),
    Target_Armor_Hardness_Reduced(true),
    Target_FSD_Inhibited(true),
    Target_FSD_Reboot(true),
    Target_Heat_Increased(true),
    Target_Loses_Target_Lock(true),
    Target_Module_Damage(true),
    Target_Module_Malfunction(true),
    Target_Pushed_Off_Course(true),
    Target_Sensor_Acuity_Reduced(true),
    Target_Shield_Cell_Disrupted(true),
    Target_Shield_Generator_Damaged(true),
    Target_Signature_Increased(true),
    Target_Speed_Reduced(true),
    Target_Thrusters_Reboot(true),
    Target_Tracking_Reduced(true),
    Target_Wing_Shield_Regeneration(true),
    Thermal_Load(false),
    Thermal_Resistance(true),
    Weapons_Capacity(true),
    Weapons_Recharge(true),
    Wing_Shield_Regeneration_Increased(true);

    private final boolean moreIsGood;

    ItemEffect(boolean moreIsGood)
    {
        this.moreIsGood = moreIsGood;
    }

    public boolean isMoreGood()
    {
        return moreIsGood;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
