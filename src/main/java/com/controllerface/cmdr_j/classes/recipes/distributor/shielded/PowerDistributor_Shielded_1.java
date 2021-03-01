package com.controllerface.cmdr_j.classes.recipes.distributor.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_Shielded_1 extends AbstractModificationRecipe
{
    public PowerDistributor_Shielded_1()
    {
        super(PowerDistributor_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 40d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 3d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -10d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
