package com.controllerface.cmdr_j.classes.recipes.shieldbooster.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Explosive_5 extends AbstractModificationRecipe
{
    public ShieldBooster_Explosive_5()
    {
        super(ShieldBooster_Explosive_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 27d),
                                new ItemEffectData(ItemEffect.KineticResistance, -5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -5d)
                        ),
                new CostData(Material.SHIELDPATTERNANALYSIS, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
