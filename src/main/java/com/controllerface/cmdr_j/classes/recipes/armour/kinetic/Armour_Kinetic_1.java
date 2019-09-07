package com.controllerface.cmdr_j.classes.recipes.armour.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Kinetic_1 extends AbstractModificationRecipe
{
    public Armour_Kinetic_1()
    {
        super(Armour_Kinetic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                                new ItemEffectData(ItemEffect.KineticResistance, 14.4d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -4d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
