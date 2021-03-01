package com.controllerface.cmdr_j.classes.recipes.distributor.shielded;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class PowerDistributor_Shielded_5 extends AbstractModificationRecipe
{
    public PowerDistributor_Shielded_5()
    {
        super(PowerDistributor_Shielded_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 200d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -30d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
