package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Shard_Cannon_Fixed_Medium extends AbstractTechnologyRecipe
{
    public Guardian_Shard_Cannon_Fixed_Medium()
    {
        super("Guardian Shard Cannon Fixed Medium", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 20),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 18),
            new CostData(Material.CARBON, 14),
            new CostData(Commodity.POWERTRANSFERCONDUITS, 12));
    }
}