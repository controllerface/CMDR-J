package com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSDinterdictor_Expanded_2 extends AbstractModifcationRecipe
{
    public FSDinterdictor_Expanded_2()
    {
        super(FSDinterdictor_Expanded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.Range, -15d)
                        ),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.ENCRYPTEDFILES, 1));
    }
}
