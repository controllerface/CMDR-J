package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Reinforced_1 extends AbstractModificationRecipe
{
    public ShieldGenerator_Reinforced_1()
    {
        super(ShieldGenerator_Reinforced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate_Percent, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, 4d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 5d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 14d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
