package com.controllerface.cmdr_j.classes.recipes.weapons.efficient;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Efficient_2 extends AbstractModificationRecipe
{
    public Weapon_Efficient_2()
    {
        super(Weapon_Efficient_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DamagePerSecond, 12d),
                                new ItemEffectData(ItemEffect.DistributorDraw, -15d),
                                new ItemEffectData(ItemEffect.PowerDraw, -12d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -43d)
                        ),
                new CostData(Material.HEATDISPERSIONPLATE, 1),
                new CostData(Material.SULPHUR, 1));
    }
}
