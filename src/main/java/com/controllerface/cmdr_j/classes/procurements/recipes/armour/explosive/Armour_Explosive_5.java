package com.controllerface.cmdr_j.classes.procurements.recipes.armour.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_Explosive_5 extends AbstractModifcationRecipe
{
    public Armour_Explosive_5()
    {
        super(Armour_Explosive_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 56d),
                                new ItemEffectData(ItemEffect.KineticResistance, -14d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -12d)
                        ),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.PHASEALLOYS, 1),
                new CostData(Material.RUTHENIUM, 1));
    }
}
