package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Chaff_Basic extends AbstractSynthesisRecipe_Basic
{
    public Chaff_Basic()
    {
        super("Chaff Basic", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Refill, 0.0)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 1),
            new CostData(Material.FILAMENTCOMPOSITES, 1));
    }
}