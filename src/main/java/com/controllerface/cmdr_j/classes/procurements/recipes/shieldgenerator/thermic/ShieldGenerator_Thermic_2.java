package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Thermic_2 extends AbstractModifcationRecipe
{
    public ShieldGenerator_Thermic_2()
    {
        super(ShieldGenerator_Thermic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 25d),
                                new ItemEffectData(ItemEffect.KineticResistance, -5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 24d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1));
    }
}
