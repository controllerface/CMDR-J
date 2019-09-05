package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Reinforced_3 extends AbstractModificationRecipe
{
    public ShieldGenerator_Reinforced_3()
    {
        super(ShieldGenerator_Reinforced_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 8d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 52.5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 6.3d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 26d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 12.6d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
