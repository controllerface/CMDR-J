package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class BossCells extends AbstractExperimentalRecipe
{
    public BossCells()
    {
        super("Boss Cells", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.ShieldBankSpinUp_Percent, 20.0),
                  new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, 5.0)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.POLYMERCAPACITORS, 1));
    }
}