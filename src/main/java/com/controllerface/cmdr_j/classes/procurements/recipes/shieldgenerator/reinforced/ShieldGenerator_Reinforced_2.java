package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Reinforced_2 extends AbstractModifcationRecipe
{
    public ShieldGenerator_Reinforced_2()
    {
        super(ShieldGenerator_Reinforced_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 6d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 37.5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 4.5d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 20d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 9d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
