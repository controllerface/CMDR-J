package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Module_Reinforcement extends AbstractTechnologyRecipe
{
    public Guardian_Module_Reinforcement()
    {
        super("Guardian Module Reinforcement", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS, 18),
            new CostData(Material.ANCIENTTECHNOLOGICALDATA, 15),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 20),
            new CostData(Commodity.REINFORCEDMOUNTINGPLATE, 9));
    }
}