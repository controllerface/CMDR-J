package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Double_Engineered_5A_FSD extends AbstractTechnologyRecipe
{
    public Double_Engineered_5A_FSD()
    {
        super("Engineered FSD V1",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.DATAMINEDWAKE, 18),
            new CostData(Material.TELLURIUM, 26),
            new CostData(Material.ELECTROCHEMICALARRAYS, 26),
            new CostData(Material.CHEMICALPROCESSORS, 28));
    }
}