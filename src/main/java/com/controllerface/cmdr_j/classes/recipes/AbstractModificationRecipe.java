package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractModificationRecipe extends AbstractRecipe
{
    private static Icon modificationIcon = new Icon(UIFunctions.Icons.engineering, 25, 30);

    public AbstractModificationRecipe(String name, ItemGrade grade, ItemEffects effects, CostData ... cost)
    {
        super(name, grade, effects, cost);
    }

    @Override
    public Icon getIcon()
    {
        return modificationIcon;
    }
}
