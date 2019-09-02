package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_HeavyDuty_3 extends AbstractModifcationRecipe
{
    public HullReinforcement_HeavyDuty_3()
    {
        super(HullReinforcement_HeavyDuty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 8.8d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 48d),
                                new ItemEffectData(ItemEffect.KineticResistance, 8.8d),
                                new ItemEffectData(ItemEffect.Mass, 24d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 8.8d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
