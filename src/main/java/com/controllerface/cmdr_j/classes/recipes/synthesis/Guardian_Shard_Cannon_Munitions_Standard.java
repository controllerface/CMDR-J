package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Shard_Cannon_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Guardian_Shard_Cannon_Munitions_Standard()
    {
        super("Guardian Shard Cannon Munitions Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.CRYSTALSHARDS, 4),
            new CostData(Material.GUARDIAN_POWERCELL, 2),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 2));
    }
}