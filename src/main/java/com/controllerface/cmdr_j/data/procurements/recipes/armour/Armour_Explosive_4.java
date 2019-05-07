package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Explosive_4 extends AbstractModifcationRecipe
{
    public Armour_Explosive_4()
    {
        super(Armour_Explosive_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 46.2d),
                                new ItemEffectData(ItemEffect.KineticResistance, -12d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -10d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.MERCURY, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
