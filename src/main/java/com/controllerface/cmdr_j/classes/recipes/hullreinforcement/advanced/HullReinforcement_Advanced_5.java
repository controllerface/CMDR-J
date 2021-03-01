package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.advanced;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Advanced_5 extends AbstractModificationRecipe
{
    public HullReinforcement_Advanced_5()
    {
        super(HullReinforcement_Advanced_5.class.getSimpleName(), ItemGrade.GRADE_5,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, -20d),
                    new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 24d),
                    new ItemEffectData(ItemEffect.Mass_Percent, -24d)
                ),
            new CostData(Material.CONDUCTIVECERAMICS, 1),
            new CostData(Material.MILITARYGRADEALLOYS, 1),
            new CostData(Material.TIN, 1));
    }
}
