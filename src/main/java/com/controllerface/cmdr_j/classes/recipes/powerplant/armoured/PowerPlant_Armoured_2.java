package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Armoured_2 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_2()
    {
        super(PowerPlant_Armoured_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -6d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, 60d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 6d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 8d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
