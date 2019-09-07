package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Plasma_Charger_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Guardian_Plasma_Charger_Munitions_Standard()
    {
        super("Guardian Plasma Charger Munitions Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.CHROMIUM, 4),
            new CostData(Material.HEATEXCHANGERS, 2),
            new CostData(Material.PHASEALLOYS, 2),
            new CostData(Material.GUARDIAN_POWERCELL, 2),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 2));
    }
}