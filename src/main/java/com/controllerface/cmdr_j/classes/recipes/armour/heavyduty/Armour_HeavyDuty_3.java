package com.controllerface.cmdr_j.classes.recipes.armour.heavyduty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_HeavyDuty_3 extends AbstractModificationRecipe
{
    public Armour_HeavyDuty_3()
    {
        super(Armour_HeavyDuty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 4.2d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 22d),
                                new ItemEffectData(ItemEffect.KineticResistance, 3.6d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 3d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
