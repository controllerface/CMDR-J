package com.controllerface.cmdr_j.enums.craftable.experimentals;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.recipes.experimental.*;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/10/2018.
 */
public enum ExperimentalRecipe implements ProcurementRecipe
{
    special_armour_kinetic(new AngledPlating_Armour()),
    special_armour_chunky(new DeepPlating_Armour()),
    special_armour_explosive(new LayeredPlating_Armour()),
    special_armour_thermic(new ReflectivePlating_Armour()),

    special_hullreinforcement_kinetic(new AngledPlating_HullReinforcement()),
    special_hullreinforcement_chunky(new DeepPlating_HullReinforcement()),
    special_hullreinforcement_explosive(new LayeredPlating_HullReinforcement()),
    special_hullreinforcement_thermic(new ReflectivePlating_HullReinforcement()),

    special_shieldbooster_explosive(new BlastBlock()),
    special_shieldbooster_toughened(new DoubleBraced_ShieldBooster()),
    special_shieldbooster_efficient(new FlowControl_ShieldBooster()),
    special_shieldbooster_kinetic(new ForceBlock_ShieldBooster()),
    special_shieldbooster_chunky(new SuperCapacitors()),
    special_shieldbooster_thermic(new ThermoBlock_ShieldBooster()),

    special_shieldcell_oversized(new BossCells()),
    special_shieldcell_toughened(new DoubleBraced_ShieldCell()),
    special_shieldcell_efficient(new FlowControl_ShieldCell()),
    special_shieldcell_gradual(new RecyclingCell()),
    special_shieldcell_lightweight(new StrippedDown_ShieldCell()),

    special_powerdistributor_capacity(new ClusterCapacitors()),
    special_powerdistributor_toughened(new DoubleBraced_PowerDistributor()),
    special_powerdistributor_efficient(new FlowControl_PowerDistributor()),
    special_powerdistributor_lightweight(new StrippedDown_PowerDistributor()),
    special_powerdistributor_fast(new SuperConduits()),

    special_shield_toughened(new DoubleBraced_Shield()),
    special_shield_regenerative(new FastCharge()),
    special_shield_kinetic(new ForceBlock_Shield()),
    special_shield_health(new HiCap()),
    special_shield_efficient(new LoDraw()),
    special_shield_resistive(new MultiWeave()),
    special_shield_lightweight(new StrippedDown_Shield()),
    special_shield_thermic(new ThermoBlock_Shield()),

    special_engine_toughened(new DoubleBraced_Engine()),
    special_engine_overloaded(new DragDrives()),
    special_engine_haulage(new DriveDistributors()),
    special_engine_lightweight(new StrippedDown_Engine()),
    special_engine_cooled(new ThermalSpread_Engine()),

    special_fsd_fuelcapacity(new DeepCharge()),
    special_fsd_toughened(new DoubleBraced_FSD()),
    special_fsd_interrupt(new FSDInterrupt()),
    special_fsd_heavy(new MassManager()),
    special_fsd_lightweight(new StrippedDown_FSD()),
    special_fsd_cooled(new ThermalSpread_FSD()),

    special_powerplant_toughened(new DoubleBraced_Powerplant()),
    special_powerplant_highcharge(new Monstered()),
    special_powerplant_lightweight(new StrippedDown_PowerPlant()),
    special_powerplant_cooled(new ThermalSpread_Powerplant()),

    special_weapon_toughened(new DoubleBraced_Weapon()),
    special_weapon_efficient(new FlowControl_Weapon()),
    special_weapon_rateoffire(new MultiServos()),
    special_weapon_damage(new Oversized()),
    special_weapon_lightweight(new StrippedDown_Weapon()),

    special_auto_loader(new AutoLoader()),
    special_concordant_sequence(new ConcordantSequence()),
    special_corrosive_shell(new CorrosiveShell()),
    special_blinding_shell(new DazzleShell()),
    special_dispersal_field(new DispersalField()),
    special_drag_munitions(new DragMunitions()),
    special_emissive_munitions(new EmissiveMunitions()),
    special_feedback_cascade(new FeedbackCascade_Legacy()),
    special_feedback_cascade_cooled(new FeedbackCascade()),
    special_force_shell(new ForceShell()),
    special_high_yield_shell(new HighYieldShell()),
    special_incendiary_rounds(new IncendiaryRounds()),
    special_inertial_impact(new InertialImpact()),
    special_ion_disruptor(new IonDisruptor()),
    special_mass_lock_munition(new MassLockMunition()),
    special_overload_munitions(new OverloadMunitions()),
    special_penetrator_munitions(new PenetratorMunitions()),
    special_penetrator_payload(new PenetratorPayload()),
    special_phasing_sequence(new PhasingSequence()),
    special_plasma_slug(new PlasmaSlug()),
    special_radiant_canister(new RadiantCanister()),
    special_regeneration_sequence(new RegenerationSequence()),
    special_reverberating_cascade(new ReverberatingCascade()),
    special_scramble_spectrum(new ScrambleSpectrum()),
    special_screening_shell(new ScreeningShell()),
    special_shiftlock_canister(new ShiftLockCanister()),
    special_smart_rounds(new SmartRounds()),
    special_super_penetrator(new SuperPenetrator_Legacy()),
    special_super_penetrator_cooled(new SuperPenetrator()),
    special_lock_breaker(new TargetLockBreaker()),
    special_thermal_cascade(new ThermalCascade()),
    special_thermal_conduit(new ThermalConduit()),
    special_thermal_shock(new ThermalShock()),
    special_thermal_vent(new ThermalVent()),
    Unknown(new Unknown()),

    ;

    private final ProcurementRecipe delegate;

    ExperimentalRecipe(ProcurementRecipe delegate)
    {
        this.delegate = delegate;
        delegate.costStream().forEach(c->c.getCost().associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        return delegate.costStream();
    }

    public ItemEffects effects()
    {
        return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(String blueprintName)
    {
        // no-op for experimental effects, text is set in this constructor
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }

    @Override
    public String getShortLabel()
    {
        return delegate.getShortLabel();
    }

    @Override
    public String getDisplayLabel()
    {
        return delegate.getDisplayLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public Icon getIcon()
    {
        return delegate.getIcon();
    }
}
