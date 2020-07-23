package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Plasma_Charger_Turreted_Large extends AbstractTechnologyRecipe
{
    public Guardian_Plasma_Charger_Turreted_Large()
    {
        super("Guardian Plasma Charger Turreted Large", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 2),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 26),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 24),
            new CostData(Material.CHROMIUM, 26),
            new CostData(Commodity.ARTICULATIONMOTORS, 10));
    }
}