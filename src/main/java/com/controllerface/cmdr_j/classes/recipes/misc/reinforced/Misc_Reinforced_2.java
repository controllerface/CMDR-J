package com.controllerface.cmdr_j.classes.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Reinforced_2 extends AbstractModificationRecipe
{
    public Misc_Reinforced_2()
    {
        super(Misc_Reinforced_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 120d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 60d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
