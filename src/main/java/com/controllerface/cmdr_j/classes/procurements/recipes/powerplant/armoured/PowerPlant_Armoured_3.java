package com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Armoured_3 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_3()
    {
        super(PowerPlant_Armoured_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -8d),
                                new ItemEffectData(ItemEffect.Integrity, 80d),
                                new ItemEffectData(ItemEffect.PowerCapacity, 8d),
                                new ItemEffectData(ItemEffect.Mass, 12d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
