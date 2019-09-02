package com.controllerface.cmdr_j.classes.procurements.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_HeavyDuty_5 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_5()
    {
        super(Armour_HeavyDuty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 7d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 32d),
                                new ItemEffectData(ItemEffect.KineticResistance, 6d),
                                new ItemEffectData(ItemEffect.Mass, 30d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
