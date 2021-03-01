package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_HeavyDuty_1 extends AbstractModificationRecipe
{
    public HullReinforcement_HeavyDuty_1()
    {
        super(HullReinforcement_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 3d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 24d),
                                new ItemEffectData(ItemEffect.KineticResistance, 3d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 3d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
