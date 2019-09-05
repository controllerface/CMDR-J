package com.controllerface.cmdr_j.classes.recipes.armour.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_Kinetic_2 extends AbstractModificationRecipe
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
