package com.controllerface.cmdr_j.classes.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_Shielded_2 extends AbstractModificationRecipe
{
    public FSD_Shielded_2()
    {
        super(FSD_Shielded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 50d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 8d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 6d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -15d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
