package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DoubleBraced_ShieldCell extends AbstractExperimentalRecipe
{
    public DoubleBraced_ShieldCell()
    {
        super("Double Braced", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Integrity_Percent, 15.0)
            ),
            new CostData(Material.CHEMICALSTORAGEUNITS, 5),
            new CostData(Material.CHROMIUM, 3),
            new CostData(Material.YTTRIUM, 1));
    }
}