package com.controllerface.cmdr_j.classes.recipes.interdictor.expanded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_Expanded_4 extends AbstractModificationRecipe
{
    public FSDinterdictor_Expanded_4()
    {
        super(FSDinterdictor_Expanded_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 100d),
                                new ItemEffectData(ItemEffect.PowerDraw, 40d),
                                new ItemEffectData(ItemEffect.Range, -25d)
                        ),
                new CostData(Material.ENCODEDSCANDATA, 1),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.WAKESOLUTIONS, 1));
    }
}
