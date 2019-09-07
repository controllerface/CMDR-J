package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SRV_Ammo_Restock_Standard extends AbstractSynthesisRecipe_Standard
{
    public SRV_Ammo_Restock_Standard()
    {
        super("SRV Ammo Restock Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.PHOSPHORUS, 1),
            new CostData(Material.MANGANESE, 1),
            new CostData(Material.SELENIUM, 1),
            new CostData(Material.MOLYBDENUM, 1));
    }
}