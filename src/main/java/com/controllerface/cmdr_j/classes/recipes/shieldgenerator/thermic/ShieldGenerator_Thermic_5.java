package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Thermic_5 extends AbstractModificationRecipe
{
    public ShieldGenerator_Thermic_5()
    {
        super(ShieldGenerator_Thermic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 40d),
                                new ItemEffectData(ItemEffect.KineticResistance, -12d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 60d)
                        ),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
                new CostData(Material.RUTHENIUM, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
