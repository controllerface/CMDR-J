package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Thermic_4 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_4()
    {
        super(ShieldGenerator_Thermic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 35d),
                                new ItemEffectData(ItemEffect.KineticResistance, -10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 48d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.MERCURY, 1));
    }
}
