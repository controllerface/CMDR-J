package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Advanced_4 extends AbstractModificationRecipe
{
    public HullReinforcement_Advanced_4()
    {
        super(HullReinforcement_Advanced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, -16d),
                                new ItemEffectData(ItemEffect.Mass, -20d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
