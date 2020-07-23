package com.controllerface.cmdr_j.classes.recipes.weapons.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LightWeight_3 extends AbstractModificationRecipe
{
    public Weapon_LightWeight_3()
    {
        super(Weapon_LightWeight_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DistributorDraw, -25d),
                                new ItemEffectData(ItemEffect.Integrity, -40d),
                                new ItemEffectData(ItemEffect.Mass, -60d),
                                new ItemEffectData(ItemEffect.PowerDraw, -20d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.MANGANESE, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));

    }
}
