package com.controllerface.edeps;

import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.structures.equipment.ItemGrade;

import java.util.stream.Stream;

/**
 * A recipe in the context of this application, is essentially a single "task", typically a "crafting" of some item
 * or modification TO some item. In some cases, a recipe is also used to describe an "unlock" of some technology.
 * This interface defines the functionality required for such a task.
 *
 * Created by Controllerface on 4/10/2018.
 */
public interface ProcurementRecipe
{
    Stream<CostData> costStream();
    String getShortLabel();
    String getDisplayLabel();
    ItemEffects effects();
    String getName();
    ItemGrade getGrade();
    void setParentBlueprintName(String blueprintName);
}
