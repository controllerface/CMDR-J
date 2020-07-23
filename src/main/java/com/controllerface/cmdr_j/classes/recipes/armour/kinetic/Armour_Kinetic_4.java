package com.controllerface.cmdr_j.classes.recipes.armour.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Kinetic_4 extends AbstractModificationRecipe
{
    public Armour_Kinetic_4()
    {
        super(Armour_Kinetic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -14d),
                                new ItemEffectData(ItemEffect.KineticResistance, 39.6d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -10d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
