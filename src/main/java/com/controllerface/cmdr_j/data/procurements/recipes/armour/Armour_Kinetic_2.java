package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Kinetic_2 extends AbstractModifcationRecipe
{
    public Armour_Kinetic_2()
    {
        super(Armour_Kinetic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                                new ItemEffectData(ItemEffect.KineticResistance, 22.8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -6d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
