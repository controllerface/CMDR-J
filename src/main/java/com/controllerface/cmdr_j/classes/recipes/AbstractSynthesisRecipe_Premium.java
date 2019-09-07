package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractSynthesisRecipe_Premium extends AbstractRecipe
{
    private static Icon synthesisIcon = new Icon(UIFunctions.Icons.synthesisGeneral, 25, 30);

    public AbstractSynthesisRecipe_Premium(String name, ItemEffects effects, CostData ... cost)
    {
        super(name, ItemGrade.SYNTHESIS_PREMIUM, effects, cost);
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
