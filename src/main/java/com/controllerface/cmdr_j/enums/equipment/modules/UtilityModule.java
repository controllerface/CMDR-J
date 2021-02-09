package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
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
import com.controllerface.cmdr_j.classes.modules.utility.shutdownneutralizer.AntiShutdownField_0F;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.FixedSubSurfaceDisplacementMissile_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.FixedSubSurfaceDisplacementMissile_Small;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.TurretedSubSurfaceDisplacementMissile_Medium;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.TurretedSubSurfaceDisplacementMissile_Small;
import com.controllerface.cmdr_j.classes.modules.utility.wakescanner.*;
import com.controllerface.cmdr_j.classes.modules.utility.xenoscanner.XenoScanner_0E;
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
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.PackHound_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.SeekerMissileRack_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.SeekerMissileRack_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.SeekerMissileRack_Small;
import com.controllerface.cmdr_j.classes.modules.weapons.shardcannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.shockcannon.*;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Large;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Medium;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.FixedTorpedoPylon_Small;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.classes.tasks.TaskType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/24/2018.
 */
public enum UtilityModule implements ShipModule
{
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

    /**
     * Experimental (AEGIS, Anti-Thargoid) Modules
     */

    hpt_antiunknownshutdown_tiny(new AntiShutdownField_0F()),

    hpt_xenoscanner_basic_tiny(new XenoScanner_0E()),

    ;

    private ShipModule delegate;

    UtilityModule(ShipModule delegate)
    {
        this.delegate = delegate;
    }

    @Override
    public TaskType modificationType()
    {
        return delegate.modificationType();
    }

    @Override
    public TaskType experimentalType()
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

    public static List<ShipModule> findModulesBySize(int size)
    {
        return Stream.of(values())
                .filter(module ->
                {
                    int moduleSize = module.itemEffects().effectByName(ItemEffect.Size)
                            .map(ItemEffectData::getDoubleValue)
                            .map(Double::intValue)
                            .orElse(-1);

                    if (moduleSize == -1) return false;

                    return size == moduleSize || (moduleSize < size && moduleSize > 0);
                })
                .sorted(Comparator.comparingDouble(a -> a.itemEffects().effectByName(ItemEffect.Size)
                        .map(ItemEffectData::getDoubleValue)
                        .orElse(-1.0)))
                .collect(Collectors.toList());
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

        return Arrays.stream(UtilityModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(() -> exception);
    }

    @Override
    public List<TaskRecipe> getAssociated()
    {
        return null;
    }

    @Override
    public void associate(TaskRecipe recipe)
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
