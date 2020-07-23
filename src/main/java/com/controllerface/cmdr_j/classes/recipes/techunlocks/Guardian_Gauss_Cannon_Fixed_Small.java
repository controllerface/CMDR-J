package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Gauss_Cannon_Fixed_Small extends AbstractTechnologyRecipe
{
    public Guardian_Gauss_Cannon_Fixed_Small()
    {
        super("Guardian Gauss Cannon Fixed Small",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 12),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 12),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 15));
    }
}