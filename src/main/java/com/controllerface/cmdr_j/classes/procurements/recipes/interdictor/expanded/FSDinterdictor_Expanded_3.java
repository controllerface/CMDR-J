package com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSDinterdictor_Expanded_3 extends AbstractModifcationRecipe
{
    public FSDinterdictor_Expanded_3()
    {
        super(FSDinterdictor_Expanded_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 80d),
                                new ItemEffectData(ItemEffect.PowerDraw, 30d),
                                new ItemEffectData(ItemEffect.Range, -20d)
                        ),
                new CostData(Material.GRIDRESISTORS, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.ENCRYPTIONCODES, 1));
    }
}
