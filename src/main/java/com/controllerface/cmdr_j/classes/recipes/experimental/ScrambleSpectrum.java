package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ScrambleSpectrum extends AbstractExperimentalRecipe
{
    public ScrambleSpectrum()
    {
        super("Scramble Spectrum", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Target_Module_Malfunction, "Installed"),
                  new ItemEffectData(ItemEffect.RateOfFire_Percent, -10)
            ),
            new CostData(Material.CRYSTALSHARDS, 5),
            new CostData(Material.SHIELDDENSITYREPORTS, 3),
            new CostData(Material.SCRAMBLEDEMISSIONDATA, 5));
    }
}