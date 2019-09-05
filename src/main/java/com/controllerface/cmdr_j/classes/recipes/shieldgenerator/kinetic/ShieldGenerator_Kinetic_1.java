package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Kinetic_1 extends AbstractModificationRecipe
{
    public ShieldGenerator_Kinetic_1()
    {
        super(ShieldGenerator_Kinetic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 20d),
                                new ItemEffectData(ItemEffect.KineticResistance, 6d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -4d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1));
    }
}
