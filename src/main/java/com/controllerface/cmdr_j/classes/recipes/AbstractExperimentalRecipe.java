package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public abstract class AbstractExperimentalRecipe extends AbstractRecipe
{
    public AbstractExperimentalRecipe(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.Experimental, effects, cost);
    }

    @Override
    public String getShortLabel()
    {
        return getName();
    }

    @Override
    public String getDisplayLabel()
    {
        return getShortLabel();
    }
}
