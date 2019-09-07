package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class High_Velocity_Munitions_Premium extends AbstractSynthesisRecipe_Premium
{
    public High_Velocity_Munitions_Premium()
    {
        super("High Velocity Munitions Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 30.0)
            ),
            new CostData(Material.VANADIUM, 4),
            new CostData(Material.TUNGSTEN, 4),
            new CostData(Material.ZIRCONIUM, 2),
            new CostData(Material.YTTRIUM, 2));
    }
}