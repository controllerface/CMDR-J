package com.controllerface.cmdr_j.classes.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Stealth_2 extends AbstractModificationRecipe
{
    public PowerPlant_Stealth_2()
    {
        super(PowerPlant_Stealth_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -35d),
                                new ItemEffectData(ItemEffect.Mass, 8d),
                                new ItemEffectData(ItemEffect.PowerCapacity, -6d)
                        ),
                new CostData(Material.IRON, 1),
                new CostData(Material.ARCHIVEDEMISSIONDATA, 1));
    }
}
