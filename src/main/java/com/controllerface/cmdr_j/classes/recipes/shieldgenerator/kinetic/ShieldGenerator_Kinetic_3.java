package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldGenerator_Kinetic_3 extends AbstractModificationRecipe
{
    public ShieldGenerator_Kinetic_3()
    {
        super(ShieldGenerator_Kinetic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 30d),
                                new ItemEffectData(ItemEffect.KineticResistance, 18d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -11d)
                        ),
                new CostData(Material.SHIELDCYCLERECORDINGS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
