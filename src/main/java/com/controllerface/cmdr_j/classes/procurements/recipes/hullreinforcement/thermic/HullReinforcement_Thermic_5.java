package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Thermic_5 extends AbstractModifcationRecipe
{
    public HullReinforcement_Thermic_5()
    {
        super(HullReinforcement_Thermic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -10d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 15d),
                                new ItemEffectData(ItemEffect.KineticResistance, -10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 39d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.PHASEALLOYS, 1),
                new CostData(Material.PROTOHEATRADIATORS, 1));
    }
}
