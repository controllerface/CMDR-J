package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.advanced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Advanced_1 extends AbstractModificationRecipe
{
    public HullReinforcement_Advanced_1()
    {
        super(HullReinforcement_Advanced_1.class.getSimpleName(), ItemGrade.GRADE_1,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, -4d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 8d),
                    new ItemEffectData(ItemEffect.Mass_Percent, -8d)
                ),
            new CostData(Material.IRON, 1));
    }
}
