package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.explosive;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Explosive_1 extends AbstractModificationRecipe
{
    public HullReinforcement_Explosive_1()
    {
        super(HullReinforcement_Explosive_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 12d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 3d),
                                new ItemEffectData(ItemEffect.KineticResistance, -2d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -2d)
                        ),
                new CostData(Material.NICKEL, 1));
    }
}
