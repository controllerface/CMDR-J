package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractTechnologyRecipe extends AbstractRecipe
{
    private static Icon technologyIcon = new Icon(UIFunctions.Icons.techBroker, 28, 30);

    public AbstractTechnologyRecipe(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.TechnologyBroker, effects, cost);
    }

    @Override
    public Icon getIcon()
    {
        return technologyIcon;
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
