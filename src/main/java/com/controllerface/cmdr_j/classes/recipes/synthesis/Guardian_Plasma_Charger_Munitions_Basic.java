package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Plasma_Charger_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Guardian_Plasma_Charger_Munitions_Basic()
    {
        super("Guardian Plasma Charger Munitions Basic",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Rearm, 0.0)
                ),
                new CostData(Material.CHROMIUM, 3),
                new CostData(Material.HEATDISPERSIONPLATE, 2),
                new CostData(Material.GUARDIAN_POWERCONDUIT, 3),
                new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 4));
    }
}