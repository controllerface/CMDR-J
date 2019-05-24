package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Resistive_4 extends AbstractModifcationRecipe
{
    public ShieldBooster_Resistive_4()
    {
        super(ShieldBooster_Resistive_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 14d),
                                new ItemEffectData(ItemEffect.Integrity, -10d),
                                new ItemEffectData(ItemEffect.KineticResistance, 14d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 14d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
