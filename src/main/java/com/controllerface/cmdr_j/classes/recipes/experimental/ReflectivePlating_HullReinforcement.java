package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReflectivePlating_HullReinforcement extends AbstractExperimentalRecipe
{
    public ReflectivePlating_HullReinforcement()
    {
        super("Reflective Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, -5.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 2.0)
            ),
            new CostData(Material.HEATCONDUCTIONWIRING, 5),
            new CostData(Material.HEATDISPERSIONPLATE, 3),
            new CostData(Material.PROTOLIGHTALLOYS, 1),
            new CostData(Material.ZINC, 4));
    }
}