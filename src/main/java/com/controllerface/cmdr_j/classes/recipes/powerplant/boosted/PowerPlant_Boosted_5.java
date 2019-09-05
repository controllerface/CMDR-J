package com.controllerface.cmdr_j.classes.recipes.powerplant.boosted;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Boosted_5 extends AbstractModificationRecipe
{
    public PowerPlant_Boosted_5()
    {
        super(PowerPlant_Boosted_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, 25d),
                                new ItemEffectData(ItemEffect.Integrity, -25d),
                                new ItemEffectData(ItemEffect.PowerCapacity, 40d)
                        ),
                new CostData(Material.CHEMICALMANIPULATORS, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.TELLURIUM, 1));
    }
}
