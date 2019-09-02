package com.controllerface.cmdr_j.classes.procurements.recipes.shieldgenerator.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldGenerator_Kinetic_4 extends AbstractModifcationRecipe
{
    public ShieldGenerator_Kinetic_4()
    {
        super(ShieldGenerator_Kinetic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 35d),
                                new ItemEffectData(ItemEffect.KineticResistance, 24d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -14d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.SHIELDSOAKANALYSIS, 1),
                new CostData(Material.MERCURY, 1));
    }
}