package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Resistive_2 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_2()
    {
        super(ShieldBooster_Resistive_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 8d),
                                new ItemEffectData(ItemEffect.Integrity, -6d),
                                new ItemEffectData(ItemEffect.KineticResistance, 8d),
                                new ItemEffectData(ItemEffect.PowerDraw, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 8d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
