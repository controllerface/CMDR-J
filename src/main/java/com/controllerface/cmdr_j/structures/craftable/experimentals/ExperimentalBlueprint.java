package com.controllerface.cmdr_j.structures.craftable.experimentals;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementRecipe;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum ExperimentalBlueprint implements ProcurementBlueprint
{
    // weapons
    Beam_Laser(EnumSet.of(ExperimentalRecipe.special_concordant_sequence,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_regeneration_sequence,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_thermal_conduit,
            ExperimentalRecipe.special_thermal_shock,
            ExperimentalRecipe.special_thermal_vent)),

    Burst_Laser(EnumSet.of(ExperimentalRecipe.special_concordant_sequence,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_inertial_impact,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_phasing_sequence,
            ExperimentalRecipe.special_scramble_spectrum,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_thermal_shock)),

    Pulse_Laser(EnumSet.of(ExperimentalRecipe.special_concordant_sequence,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_emissive_munitions,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_phasing_sequence,
            ExperimentalRecipe.special_scramble_spectrum,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_thermal_shock)),

    Cannon(EnumSet.of(ExperimentalRecipe.special_auto_loader,
            ExperimentalRecipe.special_dispersal_field,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_force_shell,
            ExperimentalRecipe.special_high_yield_shell,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_smart_rounds,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_thermal_cascade)),

    Multi_Cannon(EnumSet.of(ExperimentalRecipe.special_auto_loader,
            ExperimentalRecipe.special_corrosive_shell,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_emissive_munitions,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_incendiary_rounds,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_smart_rounds,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_thermal_shock)),

    Fragment_Cannon(EnumSet.of(ExperimentalRecipe.special_corrosive_shell,
            ExperimentalRecipe.special_blinding_shell,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_drag_munitions,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_incendiary_rounds,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_screening_shell,
            ExperimentalRecipe.special_weapon_lightweight)),

    Missile_Rack(EnumSet.of(ExperimentalRecipe.special_emissive_munitions,
            ExperimentalRecipe.special_fsd_interrupt,
            ExperimentalRecipe.special_overload_munitions,
            ExperimentalRecipe.special_penetrator_munitions,
            ExperimentalRecipe.special_thermal_cascade)),

    Seeker_Missile_Rack(EnumSet.of(ExperimentalRecipe.special_drag_munitions,
            ExperimentalRecipe.special_emissive_munitions,
            ExperimentalRecipe.special_overload_munitions,
            ExperimentalRecipe.special_thermal_cascade)),

    Torpedo_Pylon(EnumSet.of(ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_mass_lock_munition,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_penetrator_payload,
            ExperimentalRecipe.special_reverberating_cascade,
            ExperimentalRecipe.special_weapon_lightweight)),

    Mine_Launcher(EnumSet.of(ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_emissive_munitions,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_ion_disruptor,
            ExperimentalRecipe.special_overload_munitions,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_radiant_canister,
            ExperimentalRecipe.special_reverberating_cascade,
            ExperimentalRecipe.special_shiftlock_canister,
            ExperimentalRecipe.special_weapon_lightweight)),

    Plasma_Accelerator(EnumSet.of(ExperimentalRecipe.special_blinding_shell,
            ExperimentalRecipe.special_dispersal_field,
            ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_phasing_sequence,
            ExperimentalRecipe.special_plasma_slug,//_cooled,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_lock_breaker,
            ExperimentalRecipe.special_thermal_conduit)),

    Rail_Gun(EnumSet.of(ExperimentalRecipe.special_weapon_toughened,
            ExperimentalRecipe.special_feedback_cascade_cooled,
            ExperimentalRecipe.special_weapon_efficient,
            ExperimentalRecipe.special_weapon_rateoffire,
            ExperimentalRecipe.special_weapon_damage,
            ExperimentalRecipe.special_plasma_slug,//_cooled,
            ExperimentalRecipe.special_weapon_lightweight,
            ExperimentalRecipe.special_super_penetrator_cooled)),

    // util
    Shield_Booster(EnumSet.of(ExperimentalRecipe.special_shieldbooster_explosive,
            ExperimentalRecipe.special_shieldbooster_toughened,
            ExperimentalRecipe.special_shieldbooster_efficient,
            ExperimentalRecipe.special_shieldbooster_kinetic,
            ExperimentalRecipe.special_shieldbooster_chunky,
            ExperimentalRecipe.special_shieldbooster_thermic)),

    // optional
    Hull_Reinforcement_Package(EnumSet.of(ExperimentalRecipe.special_hullreinforcement_kinetic,
            ExperimentalRecipe.special_hullreinforcement_chunky,
            ExperimentalRecipe.special_hullreinforcement_explosive,
            ExperimentalRecipe.special_hullreinforcement_thermic)),

    Shield_Cell_Bank(EnumSet.of(ExperimentalRecipe.special_shieldcell_oversized,
            ExperimentalRecipe.special_shieldcell_toughened,
            ExperimentalRecipe.special_shieldcell_efficient,
            ExperimentalRecipe.special_shieldcell_gradual,
            ExperimentalRecipe.special_shieldcell_lightweight)),

    Shield_Generator(EnumSet.of(ExperimentalRecipe.special_shield_toughened,
            ExperimentalRecipe.special_shield_regenerative,
            ExperimentalRecipe.special_shield_kinetic,
            ExperimentalRecipe.special_shield_health,
            ExperimentalRecipe.special_shield_efficient,
            ExperimentalRecipe.special_shield_resistive,
            ExperimentalRecipe.special_shield_lightweight,
            ExperimentalRecipe.special_shield_thermic)),

    // core
    Frame_Shift_Drive(EnumSet.of(ExperimentalRecipe.special_fsd_fuelcapacity,
            ExperimentalRecipe.special_fsd_toughened,
            ExperimentalRecipe.special_fsd_heavy,
            ExperimentalRecipe.special_fsd_lightweight,
            ExperimentalRecipe.special_fsd_cooled)),

    Power_Distributor(EnumSet.of(ExperimentalRecipe.special_powerdistributor_capacity,
            ExperimentalRecipe.special_powerdistributor_toughened,
            ExperimentalRecipe.special_powerdistributor_efficient,
            ExperimentalRecipe.special_powerdistributor_lightweight,
            ExperimentalRecipe.special_powerdistributor_fast)),

    Power_Plant(EnumSet.of(ExperimentalRecipe.special_powerplant_toughened,
            ExperimentalRecipe.special_powerplant_highcharge,
            ExperimentalRecipe.special_powerplant_lightweight,
            ExperimentalRecipe.special_powerplant_cooled)),

    Thrusters(EnumSet.of(ExperimentalRecipe.special_engine_toughened,
            ExperimentalRecipe.special_engine_overloaded,
            ExperimentalRecipe.special_engine_haulage,
            ExperimentalRecipe.special_engine_lightweight,
            ExperimentalRecipe.special_engine_cooled)),

    Bulkheads(EnumSet.of(ExperimentalRecipe.special_armour_kinetic,
            ExperimentalRecipe.special_armour_chunky,
            ExperimentalRecipe.special_armour_explosive,
            ExperimentalRecipe.special_armour_thermic)),
    ;

    private final EnumSet<ExperimentalRecipe> recipes;
    private final String text;

    ExperimentalBlueprint(EnumSet<ExperimentalRecipe> recipes)
    {
        this.text = name().replace("_"," ");
        this.recipes = recipes;
    }

    public Stream<? extends ProcurementRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public String toString()
    {
        return text;
    }
}
