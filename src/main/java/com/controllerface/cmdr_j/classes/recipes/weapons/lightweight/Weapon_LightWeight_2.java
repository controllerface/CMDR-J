package com.controllerface.cmdr_j.classes.recipes.weapons.lightweight;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LightWeight_2 extends AbstractModificationRecipe
{
    public Weapon_LightWeight_2()
    {
        super(Weapon_LightWeight_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DistributorDraw_Percent, -20d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -30d),
                                new ItemEffectData(ItemEffect.Mass_Percent, -45d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, -10d)
                        ),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));
    }
}
