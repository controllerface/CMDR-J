package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.kinetic;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Kinetic_2 extends AbstractModificationRecipe
{
    public HullReinforcement_Kinetic_2()
    {
        super(HullReinforcement_Kinetic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 6d),
                                new ItemEffectData(ItemEffect.KineticResistance, 18.5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -4d)
                        ),
                new CostData(Material.NICKEL, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
