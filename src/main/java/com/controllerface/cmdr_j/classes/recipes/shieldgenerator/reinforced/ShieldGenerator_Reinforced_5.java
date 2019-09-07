package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Reinforced_5 extends AbstractModificationRecipe
{
    public ShieldGenerator_Reinforced_5()
    {
        super(ShieldGenerator_Reinforced_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 12d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 82.5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 9.9d),
                                new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 38d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 19.8d)
                        ),
                new CostData(Material.ARSENIC, 1),
                new CostData(Material.CONDUCTIVEPOLYMERS, 1),
                new CostData(Material.IMPROVISEDCOMPONENTS, 1));
    }
}
