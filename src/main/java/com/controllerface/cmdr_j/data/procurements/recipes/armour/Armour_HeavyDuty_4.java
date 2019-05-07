package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_HeavyDuty_4 extends AbstractModifcationRecipe
{
    public Armour_HeavyDuty_4()
    {
        super(Armour_HeavyDuty_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5.6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 27d),
                                new ItemEffectData(ItemEffect.KineticResistance, 4.8d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 4d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
