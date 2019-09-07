package com.controllerface.cmdr_j.classes.recipes.interdictor.longrange;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSDinterdictor_LongRange_3 extends AbstractModificationRecipe
{
    public FSDinterdictor_LongRange_3()
    {
        super(FSDinterdictor_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, -20d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.PowerDraw, 30d),
                                new ItemEffectData(ItemEffect.Range, 40d)
                        ),
                new CostData(Material.BULKSCANDATA, 1),
                new CostData(Material.FSDTELEMETRY, 1),
                new CostData(Material.SYMMETRICKEYS, 1));
    }
}
