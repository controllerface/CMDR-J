package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.modules.utility.abrasionblaster.FixedAbrasionBlaster_Small;
import com.controllerface.cmdr_j.classes.modules.utility.abrasionblaster.TurretedAbrasionBlaster_Small;
import com.controllerface.cmdr_j.classes.modules.utility.chafflauncher.Launcher_Chaff;
import com.controllerface.cmdr_j.classes.modules.utility.ecm.CounterMeasures_Electronic;
import com.controllerface.cmdr_j.classes.modules.utility.heatsinklauncher.Launcher_HeatSink;
import com.controllerface.cmdr_j.classes.modules.utility.killwarrant.*;
import com.controllerface.cmdr_j.classes.modules.utility.manifestscanner.*;
import com.controllerface.cmdr_j.classes.modules.utility.mininglaser.*;
import com.controllerface.cmdr_j.classes.modules.utility.pointdefense.DefenseTurret_Point;
import com.controllerface.cmdr_j.classes.modules.utility.pulsewave.*;
import com.controllerface.cmdr_j.classes.modules.utility.seismiccharge.FixedSeismicChargeLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.seismiccharge.TurretedSeismicChargeLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.shieldbooster.*;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.FixedSubSurfaceDisplacementMissile_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.FixedSubSurfaceDisplacementMissile_Small;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.TurretedSubSurfaceDisplacementMissile_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.TurretedSubSurfaceDisplacementMissile_Small;
import com.controllerface.cmdr_j.classes.modules.utility.wakescanner.*;
import com.controllerface.cmdr_j.classes.modules.weapons.beam.*;
import com.controllerface.cmdr_j.classes.modules.weapons.burst.*;
import com.controllerface.cmdr_j.classes.modules.weapons.cannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.flaklauncher.FixedRemoteReleaseFlakLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.flaklauncher.TurretedRemoteReleaseFlakLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.flechecttelauncher.FixedRemoteReleaseFlechetteLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.flechecttelauncher.TurretedRemoteReleaseFlechetteLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.fragcannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.gausscannon.FixedGuardianGaussCannon_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.gausscannon.FixedGuardianGaussCannon_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.minelauncher.FixedMineLauncher_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.minelauncher.FixedMineLauncher_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.minelauncher.FixedShockMineLauncher_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.missilerack.*;
import com.controllerface.cmdr_j.classes.modules.weapons.multicannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator.FixedPlasmaAcceleratorAdvanced_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator.FixedPlasmaAccelerator_Huge;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator.FixedPlasmaAccelerator_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator.FixedPlasmaAccelerator_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger.*;
import com.controllerface.cmdr_j.classes.modules.weapons.pulse.*;
import com.controllerface.cmdr_j.classes.modules.weapons.railgun.FixedImperialHammerRailGun_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.railgun.FixedRailgun_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.railgun.FixedRailgun_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.FixedPackHound_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.FixedSeekerMissileRack_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.FixedSeekerMissileRack_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.FixedSeekerMissileRack_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.shardcannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.shockcannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Small;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Controllerface on 4/24/2018.
 */
public enum HardpointModule implements ShipModule
{
    hpt_beamlaser_fixed_small(new FixedBeamLaser_Small()),
    hpt_beamlaser_gimbal_small(new GimballedBeamLaser_Small()),
    hpt_beamlaser_turret_small(new TurretedBeamLaser_Small()),
    hpt_beamlaser_fixed_small_heat(new FixedRetributorBeamLaser_Small()),
    hpt_beamlaser_fixed_medium(new FixedBeamLaser_Medium()),
    hpt_beamlaser_gimbal_medium(new GimballedBeamLaser_Medium()),
    hpt_beamlaser_turret_medium(new TurretedBeamLaser_Medium()),
    hpt_beamlaser_fixed_large(new FixedBeamLaser_Large()),
    hpt_beamlaser_gimbal_large(new GimballedBeamLaser_Large()),
    hpt_beamlaser_turret_large(new TurretedBeamLaser_Large()),
    hpt_beamlaser_fixed_huge(new FixedBeamLaser_Huge()),
    hpt_beamlaser_gimbal_huge(new GimballedBeamLaser_Huge()),

    hpt_pulselaserburst_fixed_small(new FixedBurstLaser_Small()),
    hpt_pulselaserburst_gimbal_small(new GimballedBurstLaser_Small()),
    hpt_pulselaserburst_turret_small(new TurretedBurstLaser_Small()),
    hpt_pulselaserburst_fixed_small_scatter(new FixedCytoscramblerBurstLaser_Small()),
    hpt_pulselaserburst_fixed_medium(new FixedBurstLaser_Medium()),
    hpt_pulselaserburst_gimbal_medium(new GimballedBurstLaser_Medium()),
    hpt_pulselaserburst_turret_medium(new TurretedBurstLaser_Medium()),
    hpt_pulselaserburst_fixed_large(new FixedBurstLaser_large()),
    hpt_pulselaserburst_gimbal_large(new GimballedBurstLaser_Large()),
    hpt_pulselaserburst_turret_large(new TurretedBurstLaser_Large()),
    hpt_pulselaserburst_fixed_huge(new FixedBurstLaser_Huge()),
    hpt_pulselaserburst_gimbal_huge(new GimballedBurstLaser_Huge()),

    hpt_pulselaser_fixed_small(new FixedPulseLaser_Small()),
    hpt_pulselaser_gimbal_small(new GimballedPulseLaser_Small()),
    hpt_pulselaser_turret_small(new TurretedPulseLaser_Small()),
    hpt_pulselaser_fixed_medium(new FixedPulseLaser_Medium()),
    hpt_pulselaser_gimbal_medium(new GimballedPulseLaser_Medium()),
    hpt_pulselaser_turret_medium(new TurretedPulseLaser_Medium()),
    hpt_pulselaser_fixed_medium_disruptor(new FixedDisruptorPulseLaser_Medium()),
    hpt_pulselaser_fixed_large(new FixedPulseLaser_Large()),
    hpt_pulselaser_gimbal_large(new GimballedPulseLaser_Large()),
    hpt_pulselaser_turret_large(new TurretedPulseLaser_Large()),
    hpt_pulselaser_fixed_huge(new FixedPulseLaser_Huge()),
    hpt_pulselaser_gimbal_huge(new GimballedPulseLaser_Huge()),

    hpt_multicannon_fixed_small(new FixedMultiCannon_Small()),
    hpt_multicannon_gimbal_small(new GimballedMultiCannon_Small()),
    hpt_multicannon_turret_small(new TurretedMultiCannon_Small()),
    hpt_multicannon_fixed_small_strong(new FixedEnforcerMultiCannon_Small()),
    hpt_multicannon_fixed_small_advanced(new FixedAdvancedMultiCannon_Small()),
    hpt_multicannon_fixed_medium(new FixedMultiCannon_Medium()),
    hpt_multicannon_gimbal_medium(new GimballedMultiCannon_Medium()),
    hpt_multicannon_turret_medium(new TurretedMultiCannon_Medium()),
    hpt_multicannon_fixed_medium_advanced(new FixedAdvancedMultiCannon_Medium()),
    hpt_multicannon_fixed_large(new FixedMultiCannon_Large()),
    hpt_multicannon_gimbal_large(new GimballedMultiCannon_Large()),
    hpt_multicannon_turret_large(new TurretedMultiCannon_Large()),
    hpt_multicannon_fixed_huge(new FixedMultiCannon_Huge()),
    hpt_multicannon_gimbal_huge(new GimballedMultiCannon_Huge()),

    hpt_cannon_fixed_small(new FixedCannon_Small()),
    hpt_cannon_gimbal_small(new GimballedCannon_Small()),
    hpt_cannon_turret_small(new TurretedCannon_Small()),
    hpt_cannon_fixed_medium(new FixedCannon_Medium()),
    hpt_cannon_gimbal_medium(new GimballedCannon_Medium()),
    hpt_cannon_turret_medium(new TurretedCannon_Medium()),
    hpt_cannon_fixed_large(new FixedCannon_Large()),
    hpt_cannon_gimbal_large(new GimballedCannon_Large()),
    hpt_cannon_turret_large(new TurretedCannon_Large()),
    hpt_cannon_fixed_huge(new FixedCannon_Huge()),
    hpt_cannon_gimbal_huge(new GimballedCannon_Huge()),

    hpt_slugshot_fixed_small(new FixedFragmentCannon_Small()),
    hpt_slugshot_gimbal_small(new GimballedFragmentCannon_Small()),
    hpt_slugshot_turret_small(new TurretedFragmentCannon_Small()),
    hpt_slugshot_fixed_medium(new FixedFragmentCannon_Medium()),
    hpt_slugshot_gimbal_medium(new GimballedFragmentCannon_Medium()),
    hpt_slugshot_turret_medium(new TurretedFragmentCannon_Medium()),
    hpt_slugshot_fixed_large(new FixedFragmentCannon_Large()),
    hpt_slugshot_gimbal_large(new GimballedFragmentCannon_Large()),
    hpt_slugshot_turret_large(new TurretedFragmentCannon_Large()),
    hpt_slugshot_fixed_large_range(new FixedPacifierFragmentCannon_Large()),

    hpt_plasmaaccelerator_fixed_medium(new FixedPlasmaAccelerator_Medium()),
    hpt_plasmaaccelerator_fixed_large_advanced(new FixedPlasmaAcceleratorAdvanced_Large()),
    hpt_plasmaaccelerator_fixed_large(new FixedPlasmaAccelerator_Large()),
    hpt_plasmaaccelerator_fixed_huge(new FixedPlasmaAccelerator_Huge()),

    hpt_railgun_fixed_small(new FixedRailgun_Small()),
    hpt_railgun_fixed_medium_burst(new FixedImperialHammerRailGun_Medium()),
    hpt_railgun_fixed_medium(new FixedRailgun_Medium()),

    hpt_dumbfiremissilerack_fixed_small(new FixedMissileRack_Small()),
    hpt_dumbfiremissilerack_fixed_small_advanced(new FixedAdvancedMissileRack_Small()),
    hpt_dumbfiremissilerack_fixed_medium_lasso(new FixedContainmentMissileMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_medium_advanced(new FixedAdvancedMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_medium(new FixedMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_large(new FixedMissileRack_Large()),

    hpt_basicmissilerack_fixed_small(new FixedSeekerMissileRack_Small()),
    hpt_drunkmissilerack_fixed_medium(new FixedPackHound_Medium()),
    hpt_basicmissilerack_fixed_medium(new FixedSeekerMissileRack_Medium()),
    hpt_basicmissilerack_fixed_large(new FixedSeekerMissileRack_Large()),

    hpt_minelauncher_fixed_small(new FixedMineLauncher_Small()),
    hpt_minelauncher_fixed_small_impulse(new FixedShockMineLauncher_Small()),
    hpt_minelauncher_fixed_medium(new FixedMineLauncher_Medium()),

    hpt_advancedtorppylon_fixed_small(new FixedTorpedoPylon_Small()),
    hpt_advancedtorppylon_fixed_medium(new FixedTorpedoPylon_Medium()),
    hpt_advancedtorppylon_fixed_large(new FixedTorpedoPylon_Large()),

    hpt_mininglaser_fixed_small(new FixedMiningLaser_Small()),
    hpt_mininglaser_turret_small(new TurretedMiningLaser_Small()),
    hpt_mininglaser_fixed_small_advanced(new FixedMiningLance_Small()),
    hpt_mininglaser_fixed_medium(new FixedMiningLaser_Medium()),
    hpt_mininglaser_turret_medium(new TurretedMiningLaser_Medium()),

    hpt_mining_seismchrgwarhd_fixed_medium(new FixedSeismicChargeLauncher_Medium()),
    hpt_mining_seismchrgwarhd_turret_medium(new TurretedSeismicChargeLauncher_Medium()),

    hpt_mining_subsurfdispmisle_fixed_small(new FixedSubSurfaceDisplacementMissile_Small()),
    hpt_mining_subsurfdispmisle_turret_small(new TurretedSubSurfaceDisplacementMissile_Small()),
    hpt_mining_subsurfdispmisle_fixed_medium(new FixedSubSurfaceDisplacementMissile_Medium()),
    hpt_mining_subsurfdispmisle_turret_medium(new TurretedSubSurfaceDisplacementMissile_Medium()),

    hpt_mining_abrblstr_fixed_small(new FixedAbrasionBlaster_Small()),
    hpt_mining_abrblstr_turret_small(new TurretedAbrasionBlaster_Small()),

    hpt_mrascanner_size0_class1(new PulseWaveAnalyzer_0E()),
    hpt_mrascanner_size0_class2(new PulseWaveAnalyzer_0D()),
    hpt_mrascanner_size0_class3(new PulseWaveAnalyzer_0C()),
    hpt_mrascanner_size0_class4(new PulseWaveAnalyzer_0B()),
    hpt_mrascanner_size0_class5(new PulseWaveAnalyzer_0A()),

    hpt_shieldbooster_size0_class1(new ShieldBooster_0E()),
    hpt_shieldbooster_size0_class2(new ShieldBooster_0D()),
    hpt_shieldbooster_size0_class3(new ShieldBooster_0C()),
    hpt_shieldbooster_size0_class4(new ShieldBooster_0B()),
    hpt_shieldbooster_size0_class5(new ShieldBooster_0A()),

    hpt_cloudscanner_size0_class1(new FSDWakeScanner_0E()),
    hpt_cloudscanner_size0_class2(new FSDWakeScanner_0D()),
    hpt_cloudscanner_size0_class3(new FSDWakeScanner_0C()),
    hpt_cloudscanner_size0_class4(new FSDWakeScanner_0B()),
    hpt_cloudscanner_size0_class5(new FSDWakeScanner_0A()),

    hpt_crimescanner_size0_class1(new Kill_warrantScanner_0E()),
    hpt_crimescanner_size0_class2(new Kill_warrantScanner_0D()),
    hpt_crimescanner_size0_class3(new Kill_warrantScanner_0C()),
    hpt_crimescanner_size0_class4(new Kill_warrantScanner_0B()),
    hpt_crimescanner_size0_class5(new Kill_warrantScanner_0A()),

    hpt_cargoscanner_size0_class1(new ManifestScanner_0E()),
    hpt_cargoscanner_size0_class2(new ManifestScanner_0D()),
    hpt_cargoscanner_size0_class3(new ManifestScanner_0C()),
    hpt_cargoscanner_size0_class4(new ManifestScanner_0B()),
    hpt_cargoscanner_size0_class5(new ManifestScanner_0A()),

    hpt_chafflauncher_tiny(new Launcher_Chaff()),

    hpt_heatsinklauncher_turret_tiny(new Launcher_HeatSink()),

    hpt_plasmapointdefence_turret_tiny(new DefenseTurret_Point()),

    hpt_electroniccountermeasure_tiny(new CounterMeasures_Electronic()),

    hpt_atmulticannon_fixed_medium(new FixedAntiThargoidMultiCannon_Medium()),
    hpt_atmulticannon_turret_medium(new TurretedAntiThargoidMultiCannon_Medium()),
    hpt_atmulticannon_fixed_large(new FixedAntiThargoidMultiCannon_Large()),
    hpt_atmulticannon_turret_large(new TurretedAntiThargoidMultiCannon_Large()),

    hpt_atdumbfiremissile_fixed_medium(new FixedAntiThargoidMissileRack_Medium()),
    hpt_atdumbfiremissile_turret_medium(new TurretedAntiThargoidMissileRack_Medium()),
    hpt_atdumbfiremissile_fixed_large(new FixedAntiThargoidMissileRack_Large()),
    hpt_atdumbfiremissile_turret_large(new TurretedAntiThargoidMissileRack_Large()),

    hpt_flakmortar_fixed_medium(new FixedRemoteReleaseFlakLauncher_Medium()),
    hpt_flakmortar_turret_medium(new TurretedRemoteReleaseFlakLauncher_Medium()),

    hpt_guardian_shardcannon_fixed_small(new FixedGuardianShardCannon_Small()),
    hpt_guardian_shardcannon_turret_small(new TurretedGuardianShardCannon_Small()),
    hpt_guardian_shardcannon_fixed_medium(new FixedGuardianShardCannon_Medium()),
    hpt_guardian_shardcannon_turret_medium(new TurretedGuardianShardCannon_Medium()),
    hpt_guardian_shardcannon_fixed_large(new FixedGuardianShardCannon_Large()),
    hpt_guardian_shardcannon_turret_large(new TurretedGuardianShardCannon_Large()),

    hpt_guardian_gausscannon_fixed_small(new FixedGuardianGaussCannon_Small()),
    hpt_guardian_gausscannon_fixed_medium(new FixedGuardianGaussCannon_Medium()),

    hpt_guardian_plasmalauncher_fixed_small(new FixedGuardianPlasmaCharger_Small()),
    hpt_guardian_plasmalauncher_turret_small(new TurretedGuardianPlasmaCharger_Small()),
    hpt_guardian_plasmalauncher_fixed_medium(new FixedGuardianPlasmaCharger_Medium()),
    hpt_guardian_plasmalauncher_turret_medium(new TurretedGuardianPlasmaCharger_Medium()),
    hpt_guardian_plasmalauncher_fixed_large(new FixedGuardianPlasmaCharger_Large()),
    hpt_guardian_plasmalauncher_turret_large(new TurretedGuardianPlasmaCharger_Large()),

    hpt_causticmissile_fixed_medium(new FixedEnzymeMissileRack_Medium()),

    hpt_flechettelauncher_fixed_medium(new FixedRemoteReleaseFlechetteLauncher_Medium()),
    hpt_flechettelauncher_turret_medium(new TurretedRemoteReleaseFlechetteLauncher_Medium()),

    hpt_plasmashockcannon_fixed_medium(new FixedShockCannon_Medium()),
    hpt_plasmashockcannon_gimbal_medium(new GimballedShockCannon_Medium()),
    hpt_plasmashockcannon_turret_medium(new TurretedShockCannon_Medium()),
    hpt_plasmashockcannon_fixed_small(new FixedShockCannon_Small()),
    hpt_plasmashockcannon_gimbal_small(new GimballedShockCannon_Small()),
    hpt_plasmashockcannon_turret_small(new TurretedShockCannon_Small()),
    hpt_plasmashockcannon_fixed_large(new FixedShockCannon_Large()),
    hpt_plasmashockcannon_gimbal_large(new GimballedShockCannon_Large()),
    hpt_plasmashockcannon_turret_large(new TurretedShockCannon_Large()),

    ;

    private ShipModule delegate;

    HardpointModule(ShipModule delegate)
    {
        this.delegate = delegate;
    }

    @Override
    public ProcurementType modificationType()
    {
        return delegate.modificationType();
    }

    @Override
    public ProcurementType experimentalType()
    {
        return delegate.experimentalType();
    }

    @Override
    public String displayText()
    {
        return delegate.displayText();
    }

    @Override
    public ItemEffects itemEffects()
    {
        return delegate.itemEffects();
    }

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

    @Override
    public List<ProcurementRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(ProcurementRecipe recipe)
    {

    }

    @Override
    public String getLocationInformation()
    {
        return null;
    }

    @Override
    public void setLocationInformation(String locationInformation)
    {

    }

    @Override
    public String getLocalizedName()
    {
        return displayText();
    }

    @Override
    public void setLocalizedName(String localizedName)
    {

    }

    @Override
    public ItemGrade getGrade()
    {
        return null;
    }

    @Override
    public List<Icon> icons()
    {
        return delegate.icons();
    }

    @Override
    public long price()
    {
        return delegate.price();
    }
}
