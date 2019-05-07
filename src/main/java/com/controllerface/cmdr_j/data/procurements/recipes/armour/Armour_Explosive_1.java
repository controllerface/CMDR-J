package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Explosive_1 extends AbstractModifcationRecipe
{
    public Armour_Explosive_1()
    {
        super(Armour_Explosive_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 16.8d),
                                new ItemEffectData(ItemEffect.KineticResistance, -5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -4d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
