package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HighYieldShell extends AbstractExperimentalRecipe
{
    public HighYieldShell()
    {
        super("High Yield Shell", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Damage_Partially_Explosive, 50.0),
                  new ItemEffectData(ItemEffect.ArmourPenetration_Percent, 25),
                  new ItemEffectData(ItemEffect.Damage_Percent, -35),
                  new ItemEffectData(ItemEffect.RateOfFire_Percent, -10)
            ),
            new CostData(Material.MECHANICALSCRAP, 5),
            new CostData(Material.PROTOLIGHTALLOYS, 3),
            new CostData(Material.CHEMICALMANIPULATORS, 3),
            new CostData(Material.NICKEL, 5));
    }
}