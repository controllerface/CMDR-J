package com.controllerface.cmdr_j.classes.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Kinetic_5 extends AbstractModificationRecipe
{
    public ShieldGenerator_Kinetic_5()
    {
        super(ShieldGenerator_Kinetic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 40d),
                                new ItemEffectData(ItemEffect.KineticResistance, 30d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -18d)
                        ),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
                new CostData(Material.RUTHENIUM, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
