package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Explosives_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Explosives_Munitions_Standard()
    {
        super("Explosives Munitions [Standard]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.SULPHUR, 6),
            new CostData(Material.PHOSPHORUS, 6),
            new CostData(Material.ARSENIC, 4),
            new CostData(Material.MERCURY, 2));
    }
}