package com.controllerface.cmdr_j.classes.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Misc_Reinforced_5 extends AbstractModificationRecipe
{
    public Misc_Reinforced_5()
    {
        super(Misc_Reinforced_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 300d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 150d)
                        ),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.TECHNETIUM, 1));
    }
}
