package com.controllerface.cmdr_j.classes.recipes.shieldbooster.kinetic;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Kinetic_1 extends AbstractModificationRecipe
{
    public ShieldBooster_Kinetic_1()
    {
        super(ShieldBooster_Kinetic_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -1d),
                                new ItemEffectData(ItemEffect.KineticResistance, 7d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -1d)
                        ),
                new CostData(Material.IRON, 1));
    }
}
