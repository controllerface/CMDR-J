package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Plasma_Charger_Turreted_Medium extends AbstractTechnologyRecipe
{
    public Guardian_Plasma_Charger_Turreted_Medium()
    {
        super("Guardian Plasma Charger Turreted Medium", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 21),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 20),
            new CostData(Material.CHROMIUM, 16),
            new CostData(Commodity.ARTICULATIONMOTORS, 8));
    }
}