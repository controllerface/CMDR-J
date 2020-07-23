package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Shield_Booster extends AbstractTechnologyRecipe
{
    public Guardian_Shield_Booster()
    {
        super("Guardian Shield Booster", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 17),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.ANCIENTLANGUAGEDATA, 24),
            new CostData(Commodity.DIAGNOSTICSENSOR, 8));
    }
}