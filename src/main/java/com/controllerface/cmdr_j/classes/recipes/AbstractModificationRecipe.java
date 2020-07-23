package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

public abstract class AbstractModificationRecipe extends AbstractRecipe
{
    public AbstractModificationRecipe(String name, ItemGrade grade, ItemEffects effects, CostData ... cost)
    {
        super(name, grade, effects, cost);
    }

    @Override
    public Icon getIcon()
    {
        return UIFunctions.Icons.modificationIcon;
    }
}
