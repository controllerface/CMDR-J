package com.controllerface.edeps.enums.modifications;

/**
 * Created by Stephen on 4/6/2018.
 */
public enum ModificationEffect
{
    All_Resistances(true),
    Ammo_Capacity(true),
    Armour_Piercing(true),
    Auto_Reload_While_Firing(true),
    Boot_Time(false),
    Broken_Regen_Rate(true),
    Burst_Rate_Of_Fire(true),
    Burst_Size(true),
    Clip_Size(true),
    Damage(true),
    Damage_Falloff_Start(true),
    Distributor_Draw(false),
    Duration(true),
    Engines_Capacity(true),
    Engines_Recharge(true),
    Explosive_Resitance(true),
    Facing_Limit(true),
    Heat_Efficiency(false),
    Hull_Boost(true),
    Hull_Reinforcement(true),
    Integrity(true),
    Jitter(false),
    Kinetic_Resistance(true),
    Mass(false),
    Maximum_Fuel_Per_Jump(true),
    Maximum_Range(true),
    Optimal_Mass(true),
    Optimal_Multiplier(true),
    Optimal_Strength(true),
    Power_Capacity(true),
    Power_Draw(false),
    Power_Generation(true),
    Power_Recharge(true),
    Range(true),
    Rate_Of_Fire(true),
    Reload_Time(false),
    Scan_Angle(true),
    Scan_Range(true),
    Scan_Rate(true),
    Scan_Time(false),
    Shield_Boost(true),
    Shield_Reinforcement(true),
    Shot_Speed(true),
    Spin_Up_Time(false),
    Systems_Capacity(true),
    Systems_Recharge(true),
    Target_Armor_Hardness_Reduced(true),
    Target_Sensor_Acuity_Reduced(true),
    Target_Signature_Increased(true),
    Target_Speed_Reduced(true),
    Target_Tracking_Reduced(true),
    Thermal_Load(false),
    Thermal_Resistance(true),
    Weapons_Capacity(true),
    Weapons_Recharge(true),
    Wing_Shield_Regeneration(true);

    private final boolean moreIsGood;

    ModificationEffect(boolean moreIsGood)
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
