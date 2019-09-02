package com.controllerface.cmdr_j.classes.procurements.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Stealth_5 extends AbstractModifcationRecipe
{
    public PowerPlant_Stealth_5()
    {
        super(PowerPlant_Stealth_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -65d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.PowerCapacity, -15d)
                        ),
                new CostData(Material.PROTOHEATRADIATORS, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.DECODEDEMISSIONDATA, 1));
    }
}
