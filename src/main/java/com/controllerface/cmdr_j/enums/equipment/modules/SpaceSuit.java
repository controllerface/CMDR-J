package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.gear.suits.*;
import com.controllerface.cmdr_j.enums.craftable.upgrades.UpgradeBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum SpaceSuit implements OwnableModule
{
    explorationsuit_class1(0L, 1,
        new Artemis_Suit_Class_1(),
        UpgradeBlueprint.Artemis_Suit),
    explorationsuit_class2(0L, 2,
        new Artemis_Suit_Class_2(),
        UpgradeBlueprint.Artemis_Suit),
    explorationsuit_class3(0L, 3,
        new Artemis_Suit_Class_3(),
        UpgradeBlueprint.Artemis_Suit),
    explorationsuit_class4(0L, 4,
        new Artemis_Suit_Class_4(),
        UpgradeBlueprint.Artemis_Suit),
    explorationsuit_class5(0L, 5,
        new Artemis_Suit_Class_5(),
        UpgradeBlueprint.Artemis_Suit),

    tacticalsuit_class1(0L, 1,
        new Dominator_Suit_Class_1(),
        UpgradeBlueprint.Dominator_Suit),
    tacticalsuit_class2(0L, 2,
        new Dominator_Suit_Class_2(),
        UpgradeBlueprint.Dominator_Suit),
    tacticalsuit_class3(0L, 3,
        new Dominator_Suit_Class_3(),
        UpgradeBlueprint.Dominator_Suit),
    tacticalsuit_class4(0L, 4,
        new Dominator_Suit_Class_4(),
        UpgradeBlueprint.Dominator_Suit),
    tacticalsuit_class5(0L, 5,
        new Dominator_Suit_Class_5(),
        UpgradeBlueprint.Dominator_Suit),

    utilitysuit_class1(0L, 1,
        new Maverick_Suit_Class_1(),
        UpgradeBlueprint.Maverick_Suit),
    utilitysuit_class2(0L, 2,
        new Maverick_Suit_Class_2(),
        UpgradeBlueprint.Maverick_Suit),
    utilitysuit_class3(0L, 3,
        new Maverick_Suit_Class_3(),
        UpgradeBlueprint.Maverick_Suit),
    utilitysuit_class4(0L, 4,
        new Maverick_Suit_Class_4(),
        UpgradeBlueprint.Maverick_Suit),
    utilitysuit_class5(0L, 5,
        new Maverick_Suit_Class_5(),
        UpgradeBlueprint.Maverick_Suit),
    ;

    public final long id;
    public final int gearClass;
    private final OwnableModule delegate;
    public final UpgradeBlueprint upgradeBlueprint;

    SpaceSuit(long id, int gearClass, OwnableModule delegate, UpgradeBlueprint upgradeBlueprint)
    {
        this.id = id;
        this.gearClass = gearClass;
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

    public String getName()
    {
        return name();
    }

    public static Optional<SpaceSuit> findModule(String moduleName)
    {
        try
        {
            return Optional.of(valueOf(moduleName.toLowerCase()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
            if (moduleName == null || moduleName.isEmpty()) return Optional.empty();
        }

        return Arrays.stream(SpaceSuit.values())
            .filter(spaceSuit -> spaceSuit.name().toLowerCase().equals(moduleName.toLowerCase()))
            .findFirst();
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
