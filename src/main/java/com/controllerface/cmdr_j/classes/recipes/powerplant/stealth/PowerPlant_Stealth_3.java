package com.controllerface.cmdr_j.classes.recipes.powerplant.stealth;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Stealth_3 extends AbstractModificationRecipe
{
    public PowerPlant_Stealth_3()
    {
        super(PowerPlant_Stealth_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency, -45d),
                                new ItemEffectData(ItemEffect.Mass, 12d),
                                new ItemEffectData(ItemEffect.PowerCapacity, -9d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.IRON, 1),
                new CostData(Material.ARCHIVEDEMISSIONDATA, 1));
    }
}
