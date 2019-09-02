package com.controllerface.cmdr_j.classes.procurements.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSDinterdictor_LongRange_4 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_4()
    {
        super(FSDinterdictor_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -25d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.PowerDraw, 40d),
                                new ItemEffectData(ItemEffect.Range, 50d)
                        ),
                new CostData(Material.SCANARCHIVES, 1),
                new CostData(Material.WAKESOLUTIONS, 1),
                new CostData(Material.ENCRYPTIONARCHIVES, 1));
    }
}
