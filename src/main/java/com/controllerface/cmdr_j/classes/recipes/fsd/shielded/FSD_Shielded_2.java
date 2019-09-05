package com.controllerface.cmdr_j.classes.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_Shielded_2 extends AbstractModificationRecipe
{
    public FSD_Shielded_2()
    {
        super(FSD_Shielded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 50d),
                                new ItemEffectData(ItemEffect.Mass, 8d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 6d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -15d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
