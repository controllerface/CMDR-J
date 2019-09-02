package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Reinforced_4 extends AbstractModifcationRecipe
{
    public ShieldGenerator_Reinforced_4()
    {
        super(ShieldGenerator_Reinforced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 10d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 67.5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 8.1d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 32d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 16.2d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.MANGANESE, 1));
    }
}
