package com.controllerface.cmdr_j.classes.recipes.weapons.efficient;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Efficient_3 extends AbstractModificationRecipe
{
    public Weapon_Efficient_3()
    {
        super(Weapon_Efficient_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamagePerSecond, 16d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -24d),
                                new ItemEffectData(ItemEffect.PowerDraw, -24d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -48d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.SCRAMBLEDEMISSIONDATA, 1),
                new CostData(Material.HEATEXCHANGERS, 1));
    }
}
