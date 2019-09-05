package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Resistive_1 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_1()
    {
        super(ShieldBooster_Resistive_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5d),
                                new ItemEffectData(ItemEffect.Integrity, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, 5d),
                                new ItemEffectData(ItemEffect.PowerDraw, 5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5d)
                        ),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
