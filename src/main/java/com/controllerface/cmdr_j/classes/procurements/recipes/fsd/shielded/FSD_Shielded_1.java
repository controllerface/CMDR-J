package com.controllerface.cmdr_j.classes.procurements.recipes.fsd.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_Shielded_1 extends AbstractModifcationRecipe
{
    public FSD_Shielded_1()
    {
        super(FSD_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 25d),
                                new ItemEffectData(ItemEffect.Mass, 4d),
                                new ItemEffectData(ItemEffect.FSDOptimalMass, 3d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -10d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
