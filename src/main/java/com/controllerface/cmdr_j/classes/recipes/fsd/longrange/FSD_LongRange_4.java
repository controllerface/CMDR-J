package com.controllerface.cmdr_j.classes.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_LongRange_4 extends AbstractModificationRecipe
{
    public FSD_LongRange_4()
    {
        super(FSD_LongRange_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -12d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 25d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 45d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 12d)
                        ),
                new CostData(Material.CHEMICALDISTILLERY, 1),
                new CostData(Material.HYPERSPACETRAJECTORIES, 1),
                new CostData(Material.MANGANESE, 1));
    }
}
