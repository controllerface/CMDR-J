package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Armoured_1 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_1()
    {
        super(PowerPlant_Armoured_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -4d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, 40d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 4d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 4d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
