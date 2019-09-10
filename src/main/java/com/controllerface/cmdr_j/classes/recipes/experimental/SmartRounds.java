package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class SmartRounds extends AbstractExperimentalRecipe
{
    public SmartRounds()
    {
        super("Smart Rounds", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.No_Damage_to_Untargeted_Ships, 0.0)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.DECODEDEMISSIONDATA, 3),
            new CostData(Material.SCANDATABANKS, 3));
    }
}