package com.controllerface.cmdr_j.classes.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_Expanded_5 extends AbstractModificationRecipe
{
    public FSDinterdictor_Expanded_5()
    {
        super(FSDinterdictor_Expanded_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit_Percent, 120d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 50d),
                                new ItemEffectData(ItemEffect.Range_Percent, -30d)
                        ),
                new CostData(Material.HYPERSPACETRAJECTORIES, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.CLASSIFIEDSCANDATA, 1));
    }
}
