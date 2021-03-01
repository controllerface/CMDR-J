package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TargetLockBreaker extends AbstractExperimentalRecipe
{
    public TargetLockBreaker()
    {
        super("Target Lock Breaker", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Loses_Target_Lock, "Installed")
            ),
            new CostData(Material.SELENIUM, 5),
            new CostData(Material.SECURITYFIRMWARE, 3),
            new CostData(Material.ADAPTIVEENCRYPTORS, 1));
    }
}