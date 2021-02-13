package com.controllerface.cmdr_j.classes.recipes.powerplant.boosted;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerPlant_Boosted_1 extends AbstractModificationRecipe
{
    public PowerPlant_Boosted_1()
    {
        super(PowerPlant_Boosted_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.HeatEfficiency_Percent, 5d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -5d),
                                new ItemEffectData(ItemEffect.PowerCapacity_Percent, 12d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
