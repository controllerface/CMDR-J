package com.controllerface.cmdr_j.classes.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Reinforced_4 extends AbstractModificationRecipe
{
    public Misc_Reinforced_4()
    {
        super(Misc_Reinforced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 240d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 120d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.TUNGSTEN, 1),
                new CostData(Material.ZINC, 1));
    }
}
