package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ForceShell extends AbstractExperimentalRecipe
{
    public ForceShell()
    {
        super("Force Shell", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Pushed_Off_Course, "Installed"),
                  new ItemEffectData(ItemEffect.ShotSpeed_Percent, -17)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.ZINC, 5),
            new CostData(Material.PHASEALLOYS, 3),
            new CostData(Material.HEATCONDUCTIONWIRING, 3));
    }
}