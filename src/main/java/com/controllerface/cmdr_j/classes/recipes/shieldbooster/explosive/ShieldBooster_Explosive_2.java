package com.controllerface.cmdr_j.classes.recipes.shieldbooster.explosive;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Explosive_2 extends AbstractModificationRecipe
{
    public ShieldBooster_Explosive_2()
    {
        super(ShieldBooster_Explosive_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, -1d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -1d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.IRON, 1));
    }
}
