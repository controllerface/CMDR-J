package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class SRV_Refuel_Basic extends AbstractSynthesisRecipe_Basic
{
    public SRV_Refuel_Basic()
    {
        super("SRV Refuel Basic", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refuel, 0.0)
            ),
            new CostData(Material.SULPHUR, 1),
            new CostData(Material.PHOSPHORUS, 1));
    }
}