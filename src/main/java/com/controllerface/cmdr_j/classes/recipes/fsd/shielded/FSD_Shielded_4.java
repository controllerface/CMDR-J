package com.controllerface.cmdr_j.classes.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FSD_Shielded_4 extends AbstractModificationRecipe
{
    public FSD_Shielded_4()
    {
        super(FSD_Shielded_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 100d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 16d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass_Percent, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -25d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
