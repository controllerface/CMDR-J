package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Advanced_2 extends AbstractModifcationRecipe
{
    public HullReinforcement_Advanced_2()
    {
        super(HullReinforcement_Advanced_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -8d),
                                new ItemEffectData(ItemEffect.Mass, -12d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.IRON, 1));
    }
}
