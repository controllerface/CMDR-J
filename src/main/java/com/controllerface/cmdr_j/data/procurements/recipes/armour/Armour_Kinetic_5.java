package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Kinetic_5 extends AbstractModifcationRecipe
{
    public Armour_Kinetic_5()
    {
        super(Armour_Kinetic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -17d),
                                new ItemEffectData(ItemEffect.KineticResistance, 48d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -12d)
                        ),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.PHASEALLOYS, 1));
    }
}
