package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Gauss_Cannon_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public Guardian_Gauss_Cannon_Munitions_Premium()
    {
        super("Guardian Gauss Cannon Munitions [Premium]",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.guardian, 1.0),
                        new ItemEffectData(ItemEffect.Rearm, "synthesized"),
                        new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
                ),
                new CostData(Material.MANGANESE, 8),
                new CostData(Material.HEATRESISTANTCERAMICS, 4),
                new CostData(Material.FILAMENTCOMPOSITES, 6),
                new CostData(Material.FOCUSCRYSTALS, 10));
    }
}