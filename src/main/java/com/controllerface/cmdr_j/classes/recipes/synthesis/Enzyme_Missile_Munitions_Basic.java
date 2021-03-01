package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Enzyme_Missile_Munitions_Basic extends AbstractSynthesisRecipe_Basic
{
    public Enzyme_Missile_Munitions_Basic()
    {
        super("Enzyme Missile Munitions [Basic]",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, "synthesized")
            ),
            new CostData(Material.IRON, 3),
            new CostData(Material.SULPHUR, 3),
            new CostData(Material.TG_BIOMECHANICALCONDUITS, 4),
            new CostData(Material.TG_PROPULSIONELEMENT, 3),
            new CostData(Material.TG_WEAPONPARTS, 3),
            new CostData(Material.LEAD, 2));
    }
}