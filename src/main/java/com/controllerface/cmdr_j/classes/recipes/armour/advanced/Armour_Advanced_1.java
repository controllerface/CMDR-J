package com.controllerface.cmdr_j.classes.recipes.armour.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Advanced_1 extends AbstractModificationRecipe
{
    public Armour_Advanced_1()
    {
        super(Armour_Advanced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 4.2d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -1d),
                                new ItemEffectData(ItemEffect.KineticResistance, 3.6d),
                                new ItemEffectData(ItemEffect.Mass, -15d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 3d)
                        ),
                new CostData(Material.IRON, 1));
    }
}
