package com.controllerface.cmdr_j.classes.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_HeavyDuty_4 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_4()
    {
        super(Armour_HeavyDuty_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5.6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 27d),
                                new ItemEffectData(ItemEffect.KineticResistance, 4.8d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 4d)
                        ),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.SHIELDINGSENSORS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
