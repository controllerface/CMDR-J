package com.controllerface.cmdr_j.classes.recipes.powerplant.armoured;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerPlant_Armoured_4 extends AbstractModificationRecipe
{
    public PowerPlant_Armoured_4()
    {
        super(PowerPlant_Armoured_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -10d),
                                new ItemEffectData(ItemEffect.Integrity, 100d),
                                new ItemEffectData(ItemEffect.PowerCapacity, 10d),
                                new ItemEffectData(ItemEffect.Mass, 16d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
