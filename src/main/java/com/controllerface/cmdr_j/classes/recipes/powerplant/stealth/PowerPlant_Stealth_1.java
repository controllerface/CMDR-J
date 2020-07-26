package com.controllerface.cmdr_j.classes.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Stealth_1 extends AbstractModificationRecipe
{
    public PowerPlant_Stealth_1()
    {
        super(PowerPlant_Stealth_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -25d),
                                new ItemEffectData(ItemEffect.Mass, 4d),
                                new ItemEffectData(ItemEffect.PowerCapacity, -3d)
                        ),
                new CostData(Material.IRON, 1));
    }
}
