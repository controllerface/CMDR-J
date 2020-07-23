package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ScrambleSpectrum extends AbstractExperimentalRecipe
{
    public ScrambleSpectrum()
    {
        super("Scramble Spectrum", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Module_Malfunction, 0.0),
                  new ItemEffectData(ItemEffect.RateOfFire, -11.11)
            ),
            new CostData(Material.CRYSTALSHARDS, 5),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 5));
    }
}