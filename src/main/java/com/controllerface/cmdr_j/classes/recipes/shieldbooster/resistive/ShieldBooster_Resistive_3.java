package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Resistive_3 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_3()
    {
        super(ShieldBooster_Resistive_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 11d),
                                new ItemEffectData(ItemEffect.Integrity, -8d),
                                new ItemEffectData(ItemEffect.KineticResistance, 11d),
                                new ItemEffectData(ItemEffect.PowerDraw, 15d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 11d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
