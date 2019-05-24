package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Kinetic_2 extends AbstractModifcationRecipe
{
    public ShieldBooster_Kinetic_2()
    {
        super(ShieldBooster_Kinetic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                                new ItemEffectData(ItemEffect.KineticResistance, 12d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -2d)
                        ),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
