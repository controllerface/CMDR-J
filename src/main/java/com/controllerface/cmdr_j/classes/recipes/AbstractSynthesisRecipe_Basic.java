package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractSynthesisRecipe_Basic extends AbstractRecipe
{
    private static Icon synthesisIcon = new Icon(UIFunctions.Icons.synthesisBasic, 30, 30);

    public AbstractSynthesisRecipe_Basic(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.SYNTHESIS_BASIC, effects, cost);
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
