package com.controllerface.cmdr_j.classes.recipes.misc.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Shielded_1 extends AbstractModificationRecipe
{
    public Misc_Shielded_1()
    {
        super(Misc_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 20d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
