package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Thermic_3 extends AbstractModifcationRecipe
{
    public Armour_Thermic_3()
    {
        super(Armour_Thermic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -11d),
                                new ItemEffectData(ItemEffect.KineticResistance, -10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 26d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
