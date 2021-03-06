package com.controllerface.cmdr_j.classes.recipes.shieldbooster.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldBooster_Thermic_2 extends AbstractModificationRecipe
{
    public ShieldBooster_Thermic_2()
    {
        super(ShieldBooster_Thermic_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -1d),
                                new ItemEffectData(ItemEffect.KineticResistance, -1d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 12d)
                        ),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.HEATCONDUCTIONWIRING, 1));
    }
}
