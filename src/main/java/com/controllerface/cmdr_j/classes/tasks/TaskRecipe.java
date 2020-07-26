package com.controllerface.cmdr_j.classes.tasks;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.stream.Stream;

/**
 * A recipe in the context of this application, is essentially a single "task", typically a "crafting" of some item
 * or modification TO some item. In some cases, a recipe is also used to describe an "unlock" of some technology.
 * This interface defines the functionality required for such a task.
 *
 * Created by Controllerface on 4/10/2018.
 */
public interface TaskRecipe
{
    Stream<CostData> costStream();
    String getShortLabel();
    String getDisplayLabel();
    ItemEffects effects();
    String getName();
    ItemGrade getGrade();
    Icon getIcon();
    void setParentBlueprintName(String blueprintName);
    String getParentBlueprintName();
}
