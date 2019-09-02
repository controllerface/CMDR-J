package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Thermic_3 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_3()
    {
        super(ShieldGenerator_Thermic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 30d),
                                new ItemEffectData(ItemEffect.KineticResistance, -7d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 36d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
