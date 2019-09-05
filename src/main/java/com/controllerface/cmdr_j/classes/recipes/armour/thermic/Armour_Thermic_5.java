package com.controllerface.cmdr_j.classes.recipes.armour.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_Thermic_5 extends AbstractModificationRecipe
{
    public Armour_Thermic_5()
    {
        super(Armour_Thermic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -17d),
                                new ItemEffectData(ItemEffect.KineticResistance, -14d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 40d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.PHASEALLOYS, 1),
                new CostData(Material.PROTOHEATRADIATORS, 1));
    }
}
