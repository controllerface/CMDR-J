package com.controllerface.cmdr_j.classes.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_Shielded_1 extends AbstractModificationRecipe
{
    public FSD_Shielded_1()
    {
        super(FSD_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 25d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 4d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 3d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -10d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
