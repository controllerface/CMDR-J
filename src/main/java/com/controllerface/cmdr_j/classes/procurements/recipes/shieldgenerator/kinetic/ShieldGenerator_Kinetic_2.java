package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Kinetic_2 extends AbstractModificationRecipe
{
    public ShieldGenerator_Kinetic_2()
    {
        super(ShieldGenerator_Kinetic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 25d),
                                new ItemEffectData(ItemEffect.KineticResistance, 12d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -7d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
