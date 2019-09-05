package com.controllerface.cmdr_j.classes.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSDinterdictor_LongRange_2 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_2()
    {
        super(FSDinterdictor_LongRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -15d),
                                new ItemEffectData(ItemEffect.Mass, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.Range, 30d)
                        ),
                new CostData(Material.DISRUPTEDWAKEECHOES, 1),
                new CostData(Material.ENCRYPTIONCODES, 1));
    }
}
