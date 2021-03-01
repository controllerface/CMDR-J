package com.controllerface.cmdr_j.classes.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_LongRange_2 extends AbstractModificationRecipe
{
    public FSD_LongRange_2()
    {
        super(FSD_LongRange_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -6d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 15d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 25d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 6d)
                        ),
                new CostData(Material.DISRUPTEDWAKEECHOES, 1),
                new CostData(Material.CHEMICALPROCESSORS, 1));
    }
}
