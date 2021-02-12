package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class RecyclingCell extends AbstractExperimentalRecipe
{
    public RecyclingCell()
    {
        super("Recycling Cell", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.ShieldBankDuration_Percent, 10.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, -5.0)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.CONFIGURABLECOMPONENTS, 1));
    }
}