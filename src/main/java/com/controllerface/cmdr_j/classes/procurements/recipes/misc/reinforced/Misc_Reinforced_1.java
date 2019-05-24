package com.controllerface.cmdr_j.classes.procurements.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Misc_Reinforced_1 extends AbstractModifcationRecipe
{
    public Misc_Reinforced_1()
    {
        super(Misc_Reinforced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 60d),
                                new ItemEffectData(ItemEffect.Mass, 30d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
