package com.controllerface.cmdr_j.classes.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_LongRange_5 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_5()
    {
        super(FSDinterdictor_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit_Percent, -30d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 30d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 50d),
                                new ItemEffectData(ItemEffect.Range_Percent, 60d)
                        ),
                new CostData(Material.SCANDATABANKS, 1),
                new CostData(Material.HYPERSPACETRAJECTORIES, 1),
                new CostData(Material.ADAPTIVEENCRYPTORS, 1));
    }
}
