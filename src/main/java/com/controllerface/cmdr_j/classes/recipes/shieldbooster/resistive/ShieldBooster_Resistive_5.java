package com.controllerface.cmdr_j.classes.recipes.shieldbooster.resistive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Resistive_5 extends AbstractModificationRecipe
{
    public ShieldBooster_Resistive_5()
    {
        super(ShieldBooster_Resistive_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 17d),
                                new ItemEffectData(ItemEffect.Integrity, -12d),
                                new ItemEffectData(ItemEffect.KineticResistance, 17d),
                                new ItemEffectData(ItemEffect.PowerDraw, 25d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 17d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.IMPERIALSHIELDING, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1));
    }
}
