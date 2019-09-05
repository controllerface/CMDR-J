package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_HeavyDuty_4 extends AbstractModificationRecipe
{
    public HullReinforcement_HeavyDuty_4()
    {
        super(HullReinforcement_HeavyDuty_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 11.7d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 60d),
                                new ItemEffectData(ItemEffect.KineticResistance, 11.7d),
                                new ItemEffectData(ItemEffect.Mass, 32d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 11.7d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
