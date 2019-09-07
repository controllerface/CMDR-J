package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Thermic_1 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_1()
    {
        super(ShieldGenerator_Thermic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 20d),
                                new ItemEffectData(ItemEffect.KineticResistance, -2d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 12d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1));
    }
}
