package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Reinforced_2 extends AbstractModificationRecipe
{
    public ShieldGenerator_Reinforced_2()
    {
        super(ShieldGenerator_Reinforced_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate_Percent, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, 6d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 8d),
                                new ItemEffectData(ItemEffect.KineticResistance, 8d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 20d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 8d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
