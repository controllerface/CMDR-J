package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Remote_Release_Flechette_Launcher_Turreted_Medium extends AbstractTechnologyRecipe
{
    public Remote_Release_Flechette_Launcher_Turreted_Medium()
    {
        super("Remote Release Flechette Launcher Turreted Medium", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.RHENIUM, 20),
            new CostData(Material.IRON, 28),
            new CostData(Material.MOLYBDENUM, 28),
            new CostData(Material.GERMANIUM, 24),
            new CostData(Commodity.ARTICULATIONMOTORS, 10));
    }
}