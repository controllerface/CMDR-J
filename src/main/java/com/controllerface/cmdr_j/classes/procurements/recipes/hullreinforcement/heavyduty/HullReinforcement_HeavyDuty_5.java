package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_HeavyDuty_5 extends AbstractModifcationRecipe
{
    public HullReinforcement_HeavyDuty_5()
    {
        super(HullReinforcement_HeavyDuty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 14.6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 72d),
                                new ItemEffectData(ItemEffect.KineticResistance, 14.6d),
                                new ItemEffectData(ItemEffect.Mass, 40d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 14.6d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
