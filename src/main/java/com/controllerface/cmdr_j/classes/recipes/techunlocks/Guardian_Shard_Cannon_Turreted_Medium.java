package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Shard_Cannon_Turreted_Medium extends AbstractTechnologyRecipe
{
    public Guardian_Shard_Cannon_Turreted_Medium()
    {
        super("Medium Guardian Shard Cannon [Turreted]",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 16),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.CARBON, 15),
            new CostData(Commodity.MICROCONTROLLERS, 12));
    }
}