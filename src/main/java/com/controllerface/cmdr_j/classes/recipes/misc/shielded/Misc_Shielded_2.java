package com.controllerface.cmdr_j.classes.recipes.misc.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Shielded_2 extends AbstractModificationRecipe
{
    public Misc_Shielded_2()
    {
        super(Misc_Shielded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 120d),
                                new ItemEffectData(ItemEffect.PowerDraw, 40d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
