package com.controllerface.cmdr_j.classes.recipes.fsd.longrange;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_LongRange_5 extends AbstractModificationRecipe
{
    public FSD_LongRange_5()
    {
        super(FSD_LongRange_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -15d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 30d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 55d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 15d)
                        ),
                new CostData(Material.ARSENIC, 1),
                new CostData(Material.CHEMICALMANIPULATORS, 1),
                new CostData(Material.DATAMINEDWAKE, 1));
    }
}
