package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Thermic_2 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_2()
    {
        super(ShieldGenerator_Thermic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 25d),
                                new ItemEffectData(ItemEffect.KineticResistance, -8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 20d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1));
    }
}
