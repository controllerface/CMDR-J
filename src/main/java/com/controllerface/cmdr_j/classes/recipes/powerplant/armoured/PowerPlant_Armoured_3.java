package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Armoured_3 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_3()
    {
        super(PowerPlant_Armoured_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -8d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, 80d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 8d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 12d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
