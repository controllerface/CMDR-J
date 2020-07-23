package com.controllerface.cmdr_j.classes.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_Expanded_3 extends AbstractModificationRecipe
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
