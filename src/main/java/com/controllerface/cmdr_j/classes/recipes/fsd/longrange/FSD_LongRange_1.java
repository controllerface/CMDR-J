package com.controllerface.cmdr_j.classes.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_LongRange_1 extends AbstractModificationRecipe
{
    public FSD_LongRange_1()
    {
        super(FSD_LongRange_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -3d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 10d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 3d)
                        ),
                new CostData(Material.DISRUPTEDWAKEECHOES, 1));
    }
}
