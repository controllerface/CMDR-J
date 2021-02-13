package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Resistive_1 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_1()
    {
        super(ShieldBooster_Resistive_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, 5d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
