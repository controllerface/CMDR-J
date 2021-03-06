package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Resistive_4 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_4()
    {
        super(ShieldBooster_Resistive_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 15d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -10d),
                                new ItemEffectData(ItemEffect.KineticResistance, 15d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 20d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 15d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
