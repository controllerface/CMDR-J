package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Advanced_1 extends AbstractModificationRecipe
{
    public HullReinforcement_Advanced_1()
    {
        super(HullReinforcement_Advanced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -4d),
                                new ItemEffectData(ItemEffect.Mass, -8d)
                        ),
                new CostData(Material.IRON, 1));
    }
}
