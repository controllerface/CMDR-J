package com.controllerface.cmdr_j.classes.recipes.distributor.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_Shielded_4 extends AbstractModificationRecipe
{
    public PowerDistributor_Shielded_4()
    {
        super(PowerDistributor_Shielded_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 160d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 12d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -25d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
