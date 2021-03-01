package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public abstract class AbstractSynthesisRecipe_Basic extends AbstractRecipe
{
    public AbstractSynthesisRecipe_Basic(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.SYNTHESIS_BASIC, effects, cost);
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
