package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
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
public enum HardpointModule implements OwnableModule
{
    // Beam Lasers

    hpt_beamlaser_fixed_huge                        (128049431L, new FixedBeamLaser_Huge()),
    hpt_beamlaser_fixed_large                       (128049430L, new FixedBeamLaser_Large()),
    hpt_beamlaser_fixed_medium                      (128049429L, new FixedBeamLaser_Medium()),
    hpt_beamlaser_fixed_small                       (128049428L, new FixedBeamLaser_Small()),
    hpt_beamlaser_fixed_small_heat                  (128671346L, new FixedRetributorBeamLaser_Small()),

    hpt_beamlaser_gimbal_huge                       (128681994L, new GimballedBeamLaser_Huge()),
    hpt_beamlaser_gimbal_large                      (128049434L, new GimballedBeamLaser_Large()),
    hpt_beamlaser_gimbal_medium                     (128049433L, new GimballedBeamLaser_Medium()),
    hpt_beamlaser_gimbal_small                      (128049432L, new GimballedBeamLaser_Small()),

    hpt_beamlaser_turret_large                      (128049437L, new TurretedBeamLaser_Large()),
    hpt_beamlaser_turret_medium                     (128049436L, new TurretedBeamLaser_Medium()),
    hpt_beamlaser_turret_small                      (128049435L, new TurretedBeamLaser_Small()),


    // Burst Lasers

    hpt_pulselaserburst_fixed_huge                  (128049403L, new FixedBurstLaser_Huge()),
    hpt_pulselaserburst_fixed_large                 (128049402L, new FixedBurstLaser_Large()),
    hpt_pulselaserburst_fixed_medium                (128049401L, new FixedBurstLaser_Medium()),
    hpt_pulselaserburst_fixed_small                 (128049400L, new FixedBurstLaser_Small()),
    hpt_pulselaserburst_fixed_small_scatter         (128671449L, new FixedCytoscramblerBurstLaser_Small()),

    hpt_pulselaserburst_gimbal_huge                 (128727920L, new GimballedBurstLaser_Huge()),
    hpt_pulselaserburst_gimbal_large                (128049406L, new GimballedBurstLaser_Large()),
    hpt_pulselaserburst_gimbal_medium               (128049405L, new GimballedBurstLaser_Medium()),
    hpt_pulselaserburst_gimbal_small                (128049404L, new GimballedBurstLaser_Small()),

    hpt_pulselaserburst_turret_large                (128049409L, new TurretedBurstLaser_Large()),
    hpt_pulselaserburst_turret_medium               (128049408L, new TurretedBurstLaser_Medium()),
    hpt_pulselaserburst_turret_small                (128049407L, new TurretedBurstLaser_Small()),


    // Pulse Lasers

    hpt_pulselaser_fixed_huge                       (128049384L, new FixedPulseLaser_Huge()),
    hpt_pulselaser_fixed_large                      (128049383L, new FixedPulseLaser_Large()),
    hpt_pulselaser_fixed_medium                     (128049382L, new FixedPulseLaser_Medium()),
    hpt_pulselaser_fixed_medium_disruptor           (128671342L, new FixedDisruptorPulseLaser_Medium()),
    hpt_pulselaser_fixed_small                      (128049381L, new FixedPulseLaser_Small()),

    hpt_pulselaser_gimbal_huge                      (128681995L, new GimballedPulseLaser_Huge()),
    hpt_pulselaser_gimbal_large                     (128049387L, new GimballedPulseLaser_Large()),
    hpt_pulselaser_gimbal_medium                    (128049386L, new GimballedPulseLaser_Medium()),
    hpt_pulselaser_gimbal_small                     (128049385L, new GimballedPulseLaser_Small()),

    hpt_pulselaser_turret_large                     (128049390L, new TurretedPulseLaser_Large()),
    hpt_pulselaser_turret_medium                    (128049389L, new TurretedPulseLaser_Medium()),
    hpt_pulselaser_turret_small                     (128049388L, new TurretedPulseLaser_Small()),


    // Multi-Cannons

    hpt_multicannon_fixed_huge                      (128049458L, new FixedMultiCannon_Huge()),
    hpt_multicannon_fixed_large                     (128049457L, new FixedMultiCannon_Large()),
    hpt_multicannon_fixed_medium                    (128049456L, new FixedMultiCannon_Medium()),
    hpt_multicannon_fixed_medium_advanced           (128935980L, new FixedAdvancedMultiCannon_Medium()),
    hpt_multicannon_fixed_small                     (128049455L, new FixedMultiCannon_Small()),
    hpt_multicannon_fixed_small_advanced            (128935981L, new FixedAdvancedMultiCannon_Small()),
    hpt_multicannon_fixed_small_strong              (128671345L, new FixedEnforcerMultiCannon_Small()),

    hpt_multicannon_gimbal_huge                     (128681996L, new GimballedMultiCannon_Huge()),
    hpt_multicannon_gimbal_large                    (128049461L, new GimballedMultiCannon_Large()),
    hpt_multicannon_gimbal_medium                   (128049460L, new GimballedMultiCannon_Medium()),
    hpt_multicannon_gimbal_small                    (128049459L, new GimballedMultiCannon_Small()),

    hpt_multicannon_turret_large                    (128049464L, new TurretedMultiCannon_Large()),
    hpt_multicannon_turret_medium                   (128049463L, new TurretedMultiCannon_Medium()),
    hpt_multicannon_turret_small                    (128049462L, new TurretedMultiCannon_Small()),


    // Cannons

    hpt_cannon_fixed_huge                           (128049441L, new FixedCannon_Huge()),
    hpt_cannon_fixed_large                          (128049440L, new FixedCannon_Large()),
    hpt_cannon_fixed_medium                         (128049439L, new FixedCannon_Medium()),
    hpt_cannon_fixed_small                          (128049438L, new FixedCannon_Small()),
    hpt_cannon_gimbal_huge                          (128049444L, new GimballedCannon_Huge()),
    hpt_cannon_gimbal_large                         (128671120L, new GimballedCannon_Large()),
    hpt_cannon_gimbal_medium                        (128049443L, new GimballedCannon_Medium()),
    hpt_cannon_gimbal_small                         (128049442L, new GimballedCannon_Small()),
    hpt_cannon_turret_large                         (128049447L, new TurretedCannon_Large()),
    hpt_cannon_turret_medium                        (128049446L, new TurretedCannon_Medium()),
    hpt_cannon_turret_small                         (128049445L, new TurretedCannon_Small()),


    // Frag Cannons

    hpt_slugshot_fixed_large                        (128049450L, new FixedFragmentCannon_Large()),
    hpt_slugshot_fixed_large_range                  (128671343L, new FixedPacifierFragmentCannon_Large()),
    hpt_slugshot_fixed_medium                       (128049449L, new FixedFragmentCannon_Medium()),
    hpt_slugshot_fixed_small                        (128049448L, new FixedFragmentCannon_Small()),
    hpt_slugshot_gimbal_large                       (128671321L, new GimballedFragmentCannon_Large()),
    hpt_slugshot_gimbal_medium                      (128049452L, new GimballedFragmentCannon_Medium()),
    hpt_slugshot_gimbal_small                       (128049451L, new GimballedFragmentCannon_Small()),
    hpt_slugshot_turret_large                       (128671322L, new TurretedFragmentCannon_Large()),
    hpt_slugshot_turret_medium                      (128049454L, new TurretedFragmentCannon_Medium()),
    hpt_slugshot_turret_small                       (128049453L, new TurretedFragmentCannon_Small()),


    // Plasma Accelerators

    hpt_plasmaaccelerator_fixed_huge                (128049467L, new FixedPlasmaAccelerator_Huge()),
    hpt_plasmaaccelerator_fixed_large               (128049466L, new FixedPlasmaAccelerator_Large()),
    hpt_plasmaaccelerator_fixed_large_advanced      (128671339L, new FixedPlasmaAcceleratorAdvanced_Large()),
    hpt_plasmaaccelerator_fixed_medium              (128049465L, new FixedPlasmaAccelerator_Medium()),


    // Railguns

    hpt_railgun_fixed_medium                        (128049489L, new FixedRailgun_Medium()),
    hpt_railgun_fixed_medium_burst                  (128671341L, new FixedImperialHammerRailGun_Medium()),
    hpt_railgun_fixed_small                         (128049488L, new FixedRailgun_Small()),


    // Missile Racks

    hpt_dumbfiremissilerack_fixed_large             (128891602L, new FixedMissileRack_Large()),
    hpt_dumbfiremissilerack_fixed_medium            (128666725L, new FixedMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_medium_advanced   (128935983L, new FixedAdvancedMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_medium_lasso      (128732552L, new FixedContainmentMissileMissileRack_Medium()),
    hpt_dumbfiremissilerack_fixed_small             (128666724L, new FixedMissileRack_Small()),
    hpt_dumbfiremissilerack_fixed_small_advanced    (128935982L, new FixedAdvancedMissileRack_Small()),


    // Seeker Missile racks

    hpt_basicmissilerack_fixed_large                (128049494L, new SeekerMissileRack_Large()),
    hpt_basicmissilerack_fixed_medium               (128049493L, new SeekerMissileRack_Medium()),
    hpt_basicmissilerack_fixed_small                (128049492L, new SeekerMissileRack_Small()),
    hpt_drunkmissilerack_fixed_medium               (128671344L, new PackHound_Medium()),


    // Mine Launchers

    hpt_minelauncher_fixed_medium                   (128049501L, new FixedMineLauncher_Medium()),
    hpt_minelauncher_fixed_small                    (128049500L, new FixedMineLauncher_Small()),
    hpt_minelauncher_fixed_small_impulse            (128671448L, new FixedShockMineLauncher_Small()),


    // Torpedo Pylons

    hpt_advancedtorppylon_fixed_large               (128049511L, new FixedTorpedoPylon_Large()),
    hpt_advancedtorppylon_fixed_medium              (128049510L, new FixedTorpedoPylon_Medium()),
    hpt_advancedtorppylon_fixed_small               (128049509L, new FixedTorpedoPylon_Small()),


    // Anti-Thargoid Multi_Cannons

    hpt_atmulticannon_fixed_large                   (128788702L, new FixedAntiThargoidMultiCannon_Large()),
    hpt_atmulticannon_fixed_medium                  (128788701L, new FixedAntiThargoidMultiCannon_Medium()),
    hpt_atmulticannon_turret_large                  (128793060L, new TurretedAntiThargoidMultiCannon_Large()),
    hpt_atmulticannon_turret_medium                 (128793059L, new TurretedAntiThargoidMultiCannon_Medium()),


    // Anti-Thargoid Missile Racks

    hpt_atdumbfiremissile_fixed_large               (128788700L, new FixedAntiThargoidMissileRack_Large()),
    hpt_atdumbfiremissile_fixed_medium              (128788699L, new FixedAntiThargoidMissileRack_Medium()),
    hpt_atdumbfiremissile_turret_large              (128788705L, new TurretedAntiThargoidMissileRack_Large()),
    hpt_atdumbfiremissile_turret_medium             (128788704L, new TurretedAntiThargoidMissileRack_Medium()),


    // Remote-Release Flak Launchers

    hpt_flakmortar_fixed_medium                     (128785626L, new FixedRemoteReleaseFlakLauncher_Medium()),
    hpt_flakmortar_turret_medium                    (128793058L, new TurretedRemoteReleaseFlakLauncher_Medium()),


    // Guardian Shard Cannons

    hpt_guardian_shardcannon_fixed_large            (128834778L, new FixedGuardianShardCannon_Large()),
    hpt_guardian_shardcannon_fixed_medium           (128834000L, new FixedGuardianShardCannon_Medium()),
    hpt_guardian_shardcannon_fixed_small            (128891609L, new FixedGuardianShardCannon_Small()),
    hpt_guardian_shardcannon_turret_large           (128834779L, new TurretedGuardianShardCannon_Large()),
    hpt_guardian_shardcannon_turret_medium          (128834001L, new TurretedGuardianShardCannon_Medium()),
    hpt_guardian_shardcannon_turret_small           (128891608L, new TurretedGuardianShardCannon_Small()),


    // Guardian Gauss Cannons

    hpt_guardian_gausscannon_fixed_medium           (128833687L, new FixedGuardianGaussCannon_Medium()),
    hpt_guardian_gausscannon_fixed_small            (128891610L, new FixedGuardianGaussCannon_Small()),


    // Guardian Plasma Launchers

    hpt_guardian_plasmalauncher_fixed_large         (128834783L, new FixedGuardianPlasmaCharger_Large()),
    hpt_guardian_plasmalauncher_fixed_medium        (128833998L, new FixedGuardianPlasmaCharger_Medium()),
    hpt_guardian_plasmalauncher_fixed_small         (128891607L, new FixedGuardianPlasmaCharger_Small()),
    hpt_guardian_plasmalauncher_turret_large        (128834784L, new TurretedGuardianPlasmaCharger_Large()),
    hpt_guardian_plasmalauncher_turret_medium       (128833999L, new TurretedGuardianPlasmaCharger_Medium()),
    hpt_guardian_plasmalauncher_turret_small        (128891606L, new TurretedGuardianPlasmaCharger_Small()),


    // Caustic Missile Rack

    hpt_causticmissile_fixed_medium                 (128833995L, new FixedEnzymeMissileRack_Medium()),


    // Remote Release Flechette Launcher

    hpt_flechettelauncher_fixed_medium              (128833996L, new FixedRemoteReleaseFlechetteLauncher_Medium()),
    hpt_flechettelauncher_turret_medium             (128833997L, new TurretedRemoteReleaseFlechetteLauncher_Medium()),


    // Shock Cannons

    hpt_plasmashockcannon_fixed_large               (128834780L, new FixedShockCannon_Large()),
    hpt_plasmashockcannon_fixed_medium              (128834002L, new FixedShockCannon_Medium()),
    hpt_plasmashockcannon_fixed_small               (128891605L, new FixedShockCannon_Small()),
    hpt_plasmashockcannon_gimbal_large              (128834781L, new GimballedShockCannon_Large()),
    hpt_plasmashockcannon_gimbal_medium             (128834003L, new GimballedShockCannon_Medium()),
    hpt_plasmashockcannon_gimbal_small              (128891604L, new GimballedShockCannon_Small()),
    hpt_plasmashockcannon_turret_large              (128834782L, new TurretedShockCannon_Large()),
    hpt_plasmashockcannon_turret_medium             (128834004L, new TurretedShockCannon_Medium()),
    hpt_plasmashockcannon_turret_small              (128891603L, new TurretedShockCannon_Small()),

    ;

    public final long id;
    private final OwnableModule delegate;

    HardpointModule(long id, OwnableModule delegate)
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

        return Arrays.stream(HardpointModule.values())
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
