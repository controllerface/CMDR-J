package com.controllerface.cmdr_j.classes.procurements.recipes.misc.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Misc_Reinforced_4 extends AbstractModificationRecipe
{
    public Misc_Reinforced_4()
    {
        super(Misc_Reinforced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 240d),
                                new ItemEffectData(ItemEffect.Mass, 120d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.TUNGSTEN, 1),
                new CostData(Material.ZINC, 1));
    }
}
