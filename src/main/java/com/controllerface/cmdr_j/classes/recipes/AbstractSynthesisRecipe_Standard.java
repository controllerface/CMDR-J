package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public abstract class AbstractSynthesisRecipe_Standard extends AbstractRecipe
{
    public AbstractSynthesisRecipe_Standard(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.SYNTHESIS_STANDARD, effects, cost);
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
