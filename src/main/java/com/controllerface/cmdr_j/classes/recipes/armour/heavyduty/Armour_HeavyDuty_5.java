package com.controllerface.cmdr_j.classes.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_HeavyDuty_5 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_5()
    {
        super(Armour_HeavyDuty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 5d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 32d),
                                new ItemEffectData(ItemEffect.KineticResistance, 5d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 30d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 5d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
