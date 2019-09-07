package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Plasma_Charger_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Guardian_Plasma_Charger_Munitions_Premium()
    {
        super("Guardian Plasma Charger Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.CHROMIUM, 6),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.HEATEXCHANGERS, 4),
            new CostData(Material.PHASEALLOYS, 6),
            new CostData(Material.GUARDIAN_POWERCELL, 4),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 3));
    }
}