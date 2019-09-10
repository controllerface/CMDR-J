package com.controllerface.cmdr_j.classes.recipes.experimental;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractExperimentalRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DeepPlating_Armour extends AbstractExperimentalRecipe
{
    public DeepPlating_Armour()
    {
        super("Deep Plating", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 8.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -3.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -3.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -3.0)
            ),
            new CostData(Material.COMPACTCOMPOSITES, 5),
            new CostData(Material.MECHANICALEQUIPMENT, 3),
            new CostData(Material.MOLYBDENUM, 2));
    }
}