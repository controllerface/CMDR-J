package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Resistive_2 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_2()
    {
        super(ShieldBooster_Resistive_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 8d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -6d),
                                new ItemEffectData(ItemEffect.KineticResistance, 8d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 8d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHOSPHORUS, 1));
    }
}
