package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Kinetic_4 extends AbstractModificationRecipe
{
    public HullReinforcement_Kinetic_4()
    {
        super(HullReinforcement_Kinetic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -8d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, 32.2d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -8d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
