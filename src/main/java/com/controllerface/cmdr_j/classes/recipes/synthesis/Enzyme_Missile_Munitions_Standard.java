package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Enzyme_Missile_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Enzyme_Missile_Munitions_Standard()
    {
        super("Enzyme Missile Munitions Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.SULPHUR, 6),
            new CostData(Material.TUNGSTEN, 4),
            new CostData(Material.TG_BIOMECHANICALCONDUITS, 5),
            new CostData(Material.TG_PROPULSIONELEMENT, 6),
            new CostData(Material.TG_WEAPONPARTS, 4),
            new CostData(Material.LEAD, 4));
    }
}