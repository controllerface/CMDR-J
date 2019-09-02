package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_HeavyDuty_1 extends AbstractModifcationRecipe
{
    public HullReinforcement_HeavyDuty_1()
    {
        super(HullReinforcement_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 2.9d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 24d),
                                new ItemEffectData(ItemEffect.KineticResistance, 2.9d),
                                new ItemEffectData(ItemEffect.Mass, 8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 2.9d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
