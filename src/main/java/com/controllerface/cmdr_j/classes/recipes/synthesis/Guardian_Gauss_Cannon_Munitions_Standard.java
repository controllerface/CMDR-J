package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Guardian_Gauss_Cannon_Munitions_Standard extends AbstractSynthesisRecipe_Standard
{
    public Guardian_Gauss_Cannon_Munitions_Standard()
    {
        super("Guardian Gauss Cannon Munitions Standard", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Rearm, 0.0),
                  new ItemEffectData(ItemEffect.Damage_Boost, 15.0)
            ),
            new CostData(Material.MANGANESE, 5),
            new CostData(Material.HEATRESISTANTCERAMICS, 3),
            new CostData(Material.FOCUSCRYSTALS, 5),
            new CostData(Material.GUARDIAN_POWERCONDUIT, 4),
            new CostData(Material.GUARDIAN_SENTINEL_WEAPONPARTS, 3));
    }
}