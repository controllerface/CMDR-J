package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public abstract class AbstractTechnologyRecipe extends AbstractRecipe
{
    public AbstractTechnologyRecipe(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.TechnologyBroker, effects, cost);
    }

    @Override
    public String getShortLabel()
    {
        return getName();
    }

    @Override
    public String getDisplayLabel()
    {
        return toString();
    }

}
