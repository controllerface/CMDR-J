package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Thermic_1 extends AbstractModificationRecipe
{
    public HullReinforcement_Thermic_1()
    {
        super(HullReinforcement_Thermic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -2d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 3d),
                                new ItemEffectData(ItemEffect.KineticResistance, -2d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 11.7d)
                        ),
                new CostData(Material.HEATCONDUCTIONWIRING, 1));
    }
}
