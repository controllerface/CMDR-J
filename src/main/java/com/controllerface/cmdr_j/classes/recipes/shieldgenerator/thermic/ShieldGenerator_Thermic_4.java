package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Thermic_4 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_4()
    {
        super(ShieldGenerator_Thermic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 35d),
                                new ItemEffectData(ItemEffect.KineticResistance, -16d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 40d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.MERCURY, 1));
    }
}
