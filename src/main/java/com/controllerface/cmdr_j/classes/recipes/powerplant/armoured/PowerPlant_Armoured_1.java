package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Armoured_1 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_1()
    {
        super(PowerPlant_Armoured_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -4d),
                                new ItemEffectData(ItemEffect.Integrity, 40d),
                                new ItemEffectData(ItemEffect.PowerCapacity, 4d),
                                new ItemEffectData(ItemEffect.Mass, 4d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
