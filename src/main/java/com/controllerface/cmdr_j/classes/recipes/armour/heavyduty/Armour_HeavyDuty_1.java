package com.controllerface.cmdr_j.classes.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_HeavyDuty_1 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_1()
    {
        super(Armour_HeavyDuty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 1.4d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, 1.2d),
                                new ItemEffectData(ItemEffect.Mass, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 1d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
