package com.controllerface.cmdr_j.classes.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_Expanded_1 extends AbstractModificationRecipe
{
    public FSDinterdictor_Expanded_1()
    {
        super(FSDinterdictor_Expanded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit_Percent, 40d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.Range_Percent, 10d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
