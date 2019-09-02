package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_HeavyDuty_2 extends AbstractModificationRecipe
{
    public HullReinforcement_HeavyDuty_2()
    {
        super(HullReinforcement_HeavyDuty_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5.9d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 36d),
                                new ItemEffectData(ItemEffect.KineticResistance, 5.9d),
                                new ItemEffectData(ItemEffect.Mass, 16d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5.9d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
