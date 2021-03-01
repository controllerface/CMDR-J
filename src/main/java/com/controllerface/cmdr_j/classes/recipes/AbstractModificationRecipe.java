package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public abstract class AbstractModificationRecipe extends AbstractRecipe
{
    public AbstractModificationRecipe(String name, ItemGrade grade, ItemEffects effects, CostData ... cost)
    {
        super(name, grade, effects, cost);
    }
}
