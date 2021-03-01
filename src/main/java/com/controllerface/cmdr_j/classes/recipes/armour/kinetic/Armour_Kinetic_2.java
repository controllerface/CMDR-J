package com.controllerface.cmdr_j.classes.recipes.armour.kinetic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Kinetic_2 extends AbstractModificationRecipe
{
    public Armour_Kinetic_2()
    {
        super(Armour_Kinetic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                                new ItemEffectData(ItemEffect.KineticResistance, 19d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -6d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
