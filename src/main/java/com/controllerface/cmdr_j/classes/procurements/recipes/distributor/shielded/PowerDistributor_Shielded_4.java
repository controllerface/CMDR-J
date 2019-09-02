package com.controllerface.cmdr_j.classes.procurements.recipes.distributor.shielded;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class PowerDistributor_Shielded_4 extends AbstractModifcationRecipe
{
    public PowerDistributor_Shielded_4()
    {
        super(PowerDistributor_Shielded_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 160d),
                                new ItemEffectData(ItemEffect.Mass, 12d),
                                new ItemEffectData(ItemEffect.PowerDraw, -25d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
