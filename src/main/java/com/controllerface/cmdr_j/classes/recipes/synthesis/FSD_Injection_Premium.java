package com.controllerface.cmdr_j.classes.recipes.synthesis;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class FSD_Injection_Premium extends AbstractSynthesisRecipe_Premium
{
    public FSD_Injection_Premium()
    {
        super("FSD Injection Premium", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.FSDJumpRangeBoost, 100.0)
            ),
            new CostData(Material.CARBON, 1),
            new CostData(Material.GERMANIUM, 1),
            new CostData(Material.ARSENIC, 1),
            new CostData(Material.NIOBIUM, 1),
            new CostData(Material.YTTRIUM, 1),
            new CostData(Material.POLONIUM, 1));
    }
}