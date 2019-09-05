package com.controllerface.cmdr_j.classes.recipes.misc.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Misc_Shielded_1 extends AbstractModificationRecipe
{
    public Misc_Shielded_1()
    {
        super(Misc_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
