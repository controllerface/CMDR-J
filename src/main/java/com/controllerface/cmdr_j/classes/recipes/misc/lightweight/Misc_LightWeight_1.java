package com.controllerface.cmdr_j.classes.recipes.misc.lightweight;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_LightWeight_1 extends AbstractModificationRecipe
{
    public Misc_LightWeight_1()
    {
        super(Misc_LightWeight_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -10d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -45d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
