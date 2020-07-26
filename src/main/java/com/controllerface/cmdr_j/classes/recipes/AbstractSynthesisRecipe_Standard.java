package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractSynthesisRecipe_Standard extends AbstractRecipe
{
    private static Icon synthesisIcon = new Icon(UIFunctions.Icons.synthesisStandard, 25, 30);

    public AbstractSynthesisRecipe_Standard(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.SYNTHESIS_STANDARD, effects, cost);
    }

    @Override
    public Icon getIcon()
    {
        return synthesisIcon;
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
