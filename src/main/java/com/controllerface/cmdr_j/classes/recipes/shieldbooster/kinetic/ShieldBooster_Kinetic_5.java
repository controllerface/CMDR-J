package com.controllerface.cmdr_j.classes.recipes.shieldbooster.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Kinetic_5 extends AbstractModificationRecipe
{
    public ShieldBooster_Kinetic_5()
    {
        super(ShieldBooster_Kinetic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 27d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -5d)
                        ),
                new CostData(Material.SHIELDPATTERNANALYSIS, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
                new CostData(Material.PHASEALLOYS, 1));
    }
}
