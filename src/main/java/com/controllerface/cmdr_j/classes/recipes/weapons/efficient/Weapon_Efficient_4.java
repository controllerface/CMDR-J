package com.controllerface.cmdr_j.classes.recipes.weapons.efficient;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Efficient_4 extends AbstractModificationRecipe
{
    public Weapon_Efficient_4()
    {
        super(Weapon_Efficient_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamagePerSecond, 20d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -35d),
                                new ItemEffectData(ItemEffect.PowerDraw, -36d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -52d)
                        ),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.ARCHIVEDEMISSIONDATA, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
