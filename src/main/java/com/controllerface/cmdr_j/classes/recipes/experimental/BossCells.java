package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class BossCells extends AbstractExperimentalRecipe
{
    public BossCells()
    {
        super("Boss Cells", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp, 20.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement, 5.0)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1));
    }
}