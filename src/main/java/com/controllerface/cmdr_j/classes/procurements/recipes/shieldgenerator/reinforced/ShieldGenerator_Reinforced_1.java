package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Reinforced_1 extends AbstractModifcationRecipe
{
    public ShieldGenerator_Reinforced_1()
    {
        super(ShieldGenerator_Reinforced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 4d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 22.5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 2.7d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 14d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5.4d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}