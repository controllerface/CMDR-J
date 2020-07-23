package com.controllerface.cmdr_j.classes.recipes.weapons.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
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
                                new ItemEffectData(ItemEffect.DistributorDraw, -20d),
                                new ItemEffectData(ItemEffect.Integrity, -30d),
                                new ItemEffectData(ItemEffect.Mass, -45d),
                                new ItemEffectData(ItemEffect.PowerDraw, -10d)
                        ),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));
    }
}
