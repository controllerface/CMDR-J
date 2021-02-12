package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_HeavyDuty_2 extends AbstractModificationRecipe
{
    public HullReinforcement_HeavyDuty_2()
    {
        super(HullReinforcement_HeavyDuty_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 36d),
                                new ItemEffectData(ItemEffect.KineticResistance, 6d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 16d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 6d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
