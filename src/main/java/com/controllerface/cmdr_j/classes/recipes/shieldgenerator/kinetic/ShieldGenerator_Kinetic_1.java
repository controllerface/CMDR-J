package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Kinetic_1 extends AbstractModificationRecipe
{
    public ShieldGenerator_Kinetic_1()
    {
        super(ShieldGenerator_Kinetic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, 20d),
                                new ItemEffectData(ItemEffect.KineticResistance, 10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -3d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1));
    }
}
