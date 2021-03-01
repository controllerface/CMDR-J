package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.kinetic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Kinetic_5 extends AbstractModificationRecipe
{
    public HullReinforcement_Kinetic_5()
    {
        super(HullReinforcement_Kinetic_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -10d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 15d),
                                new ItemEffectData(ItemEffect.KineticResistance, 40d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -10d)
                        ),
                new CostData(Material.FEDCORECOMPOSITES, 1),
                new CostData(Material.MOLYBDENUM, 1),
                new CostData(Material.PHASEALLOYS, 1));
    }
}
