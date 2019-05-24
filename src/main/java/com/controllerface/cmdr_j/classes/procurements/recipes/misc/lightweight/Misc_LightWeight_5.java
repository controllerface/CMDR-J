package com.controllerface.cmdr_j.classes.procurements.recipes.misc.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Misc_LightWeight_5 extends AbstractModifcationRecipe
{
    public Misc_LightWeight_5()
    {
        super(Misc_LightWeight_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -50d),
                                new ItemEffectData(ItemEffect.Mass, -85d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.PROTOLIGHTALLOYS, 1),
                new CostData(Material.PROTORADIOLICALLOYS, 1));
    }
}
