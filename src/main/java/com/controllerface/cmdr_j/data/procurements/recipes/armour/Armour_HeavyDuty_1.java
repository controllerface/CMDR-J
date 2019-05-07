package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_HeavyDuty_1 extends AbstractModifcationRecipe
{
    public Armour_HeavyDuty_1()
    {
        super(Armour_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 1.4d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, 1.2d),
                                new ItemEffectData(ItemEffect.Mass, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 1d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
