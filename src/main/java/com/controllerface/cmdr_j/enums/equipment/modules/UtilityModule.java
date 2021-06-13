package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
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
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/24/2018.
 */
public enum UtilityModule implements OwnableModule
{
    hpt_mininglaser_fixed_medium                (128049526L, new FixedMiningLaser_Medium()),
    hpt_mininglaser_fixed_small                 (128049525L, new FixedMiningLaser_Small()),
    hpt_mininglaser_fixed_small_advanced        (128671340L, new FixedMiningLance_Small()),
    hpt_mininglaser_turret_medium               (128740820L, new TurretedMiningLaser_Medium()),
    hpt_mininglaser_turret_small                (128740819L, new TurretedMiningLaser_Small()),

    hpt_mining_seismchrgwarhd_fixed_medium      (128915460L, new FixedSeismicChargeLauncher_Medium()),
    hpt_mining_seismchrgwarhd_turret_medium     (128915461L, new TurretedSeismicChargeLauncher_Medium()),

    hpt_mining_subsurfdispmisle_fixed_medium    (128915456L, new FixedSubSurfaceDisplacementMissile_Medium()),
    hpt_mining_subsurfdispmisle_fixed_small     (128915454L, new FixedSubSurfaceDisplacementMissile_Small()),
    hpt_mining_subsurfdispmisle_turret_medium   (128915457L, new TurretedSubSurfaceDisplacementMissile_Medium()),
    hpt_mining_subsurfdispmisle_turret_small    (128915455L, new TurretedSubSurfaceDisplacementMissile_Small()),

    hpt_mining_abrblstr_fixed_small             (128915458L, new FixedAbrasionBlaster_Small()),
    hpt_mining_abrblstr_turret_small            (128915459L, new TurretedAbrasionBlaster_Small()),

    hpt_mrascanner_size0_class1                 (128915718L, new PulseWaveAnalyzer_0E()),
    hpt_mrascanner_size0_class2                 (128915719L, new PulseWaveAnalyzer_0D()),
    hpt_mrascanner_size0_class3                 (128915720L, new PulseWaveAnalyzer_0C()),
    hpt_mrascanner_size0_class4                 (128915721L, new PulseWaveAnalyzer_0B()),
    hpt_mrascanner_size0_class5                 (128915722L, new PulseWaveAnalyzer_0A()),

    hpt_shieldbooster_size0_class1              (128668532L, new ShieldBooster_0E()),
    hpt_shieldbooster_size0_class2              (128668533L, new ShieldBooster_0D()),
    hpt_shieldbooster_size0_class3              (128668534L, new ShieldBooster_0C()),
    hpt_shieldbooster_size0_class4              (128668535L, new ShieldBooster_0B()),
    hpt_shieldbooster_size0_class5              (128668536L, new ShieldBooster_0A()),

    hpt_cloudscanner_size0_class1               (128662525L, new FSDWakeScanner_0E()),
    hpt_cloudscanner_size0_class2               (128662526L, new FSDWakeScanner_0D()),
    hpt_cloudscanner_size0_class3               (128662527L, new FSDWakeScanner_0C()),
    hpt_cloudscanner_size0_class4               (128662528L, new FSDWakeScanner_0B()),
    hpt_cloudscanner_size0_class5               (128662529L, new FSDWakeScanner_0A()),

    hpt_crimescanner_size0_class1               (128662530L, new Kill_warrantScanner_0E()),
    hpt_crimescanner_size0_class2               (128662531L, new Kill_warrantScanner_0D()),
    hpt_crimescanner_size0_class3               (128662532L, new Kill_warrantScanner_0C()),
    hpt_crimescanner_size0_class4               (128662533L, new Kill_warrantScanner_0B()),
    hpt_crimescanner_size0_class5               (128662534L, new Kill_warrantScanner_0A()),

    hpt_cargoscanner_size0_class1               (128662520L, new ManifestScanner_0E()),
    hpt_cargoscanner_size0_class2               (128662521L, new ManifestScanner_0D()),
    hpt_cargoscanner_size0_class3               (128662522L, new ManifestScanner_0C()),
    hpt_cargoscanner_size0_class4               (128662523L, new ManifestScanner_0B()),
    hpt_cargoscanner_size0_class5               (128662524L, new ManifestScanner_0A()),

    hpt_chafflauncher_tiny                      (128049513L, new Launcher_Chaff()),

    hpt_heatsinklauncher_turret_tiny            (128049519L,new Launcher_HeatSink()),

    hpt_plasmapointdefence_turret_tiny          (128049522L, new DefenseTurret_Point()),

    hpt_electroniccountermeasure_tiny           (128049516L, new CounterMeasures_Electronic()),

    /**
     * Experimental (AEGIS, Anti-Thargoid) Modules
     */

    hpt_antiunknownshutdown_tiny                (128771884L, new AntiShutdownField_0F()),

    hpt_xenoscanner_basic_tiny                  (128793115L, new XenoScanner_0E()),

    ;

    public final long id;
    private final OwnableModule delegate;

    UtilityModule(long id, OwnableModule delegate)
    {
        this.id = id;
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

    public static List<OwnableModule> findModulesBySize(int size)
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

    public static OwnableModule findModule(String moduleName) throws Exception
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
    public long price()
    {
        return delegate.price();
    }

    public static OwnableModule findById(long itemId)
    {
        return Stream.of(values())
            .filter(item -> item.id == itemId)
            .findFirst()
            .orElse(null);
    }
}
