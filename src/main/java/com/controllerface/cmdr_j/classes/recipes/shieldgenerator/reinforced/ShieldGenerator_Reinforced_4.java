package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.reinforced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Reinforced_4 extends AbstractModificationRecipe
{
    public ShieldGenerator_Reinforced_4()
    {
        super(ShieldGenerator_Reinforced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BrokenRegenRate_Percent, -10d),
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 14d),
                                new ItemEffectData(ItemEffect.KineticResistance, 14d),
                                new ItemEffectData(ItemEffect.ShieldGenStrength_Percent, 32d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 14d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.MANGANESE, 1));
    }
}
