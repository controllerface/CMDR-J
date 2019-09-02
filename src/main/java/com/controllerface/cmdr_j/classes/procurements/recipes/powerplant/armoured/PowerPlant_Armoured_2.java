package com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Armoured_2 extends AbstractModifcationRecipe
{
    public PowerPlant_Armoured_2()
    {
        super(PowerPlant_Armoured_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -6d),
                                new ItemEffectData(ItemEffect.Integrity, 60d),
                                new ItemEffectData(ItemEffect.PowerCapacity, 6d),
                                new ItemEffectData(ItemEffect.Mass, 8d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
