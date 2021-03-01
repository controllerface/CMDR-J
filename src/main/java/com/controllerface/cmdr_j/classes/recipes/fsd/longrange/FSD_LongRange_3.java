package com.controllerface.cmdr_j.classes.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_LongRange_3 extends AbstractModificationRecipe
{
    public FSD_LongRange_3()
    {
        super(FSD_LongRange_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -9d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 35d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 9d)
                        ),
                new CostData(Material.CHEMICALPROCESSORS, 1),
                new CostData(Material.PHOSPHORUS, 1),
                new CostData(Material.WAKESOLUTIONS, 1));
    }
}
