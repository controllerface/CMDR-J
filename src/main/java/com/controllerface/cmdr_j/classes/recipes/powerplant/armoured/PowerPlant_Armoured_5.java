package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Armoured_5 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_5()
    {
        super(PowerPlant_Armoured_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, -12d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, 120d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 12d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 20d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
