package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Advanced_3 extends AbstractModifcationRecipe
{
    public Armour_Advanced_3()
    {
        super(Armour_Advanced_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 12.6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -3d),
                                new ItemEffectData(ItemEffect.KineticResistance, 10.8d),
                                new ItemEffectData(ItemEffect.Mass, -35d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 9d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.IRON, 1));
    }
}
