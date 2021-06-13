package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.*;
import com.controllerface.cmdr_j.enums.craftable.upgrades.UpgradeBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PersonalWeapon implements OwnableModule
{
    // Todo: remaining weapons and data

    wpn_s_pistol_laser_sauto (1700227813017625L,
        new TK_Zenith_Pistol(),
        UpgradeBlueprint.TK_Zenith),

    wpn_m_assaultrifle_laser_fauto(0L,
        new TK_Aphelion_Rifle(),
        UpgradeBlueprint.TK_Aphelion),


    wpn_m_sniper_plasma_charged(1700306882307992L,
        new Manticore_Executioner_Rifle(),
        UpgradeBlueprint.Manticore_Executioner),


    wpn_m_assaultrifle_kinetic_fauto(1700216304969517L,
        new Karma_AR_50_Rifle(),
        UpgradeBlueprint.Karma_AR_50),

    wpn_s_pistol_kinetic_sauto(0L,
        new Karma_P_15_Pistol(),
        UpgradeBlueprint.Karma_P_15),
    ;

    public final long id;
    private final OwnableModule delegate;
    public final UpgradeBlueprint upgradeBlueprint;

    PersonalWeapon(long id, OwnableModule delegate, UpgradeBlueprint upgradeBlueprint)
    {
        this.id = id;
        this.delegate = delegate;
        this.upgradeBlueprint = upgradeBlueprint;
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

        return Arrays.stream(PersonalWeapon.values())
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
