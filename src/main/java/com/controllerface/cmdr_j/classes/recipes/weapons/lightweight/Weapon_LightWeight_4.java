package com.controllerface.cmdr_j.classes.recipes.weapons.lightweight;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_LightWeight_4 extends AbstractModificationRecipe
{
    public Weapon_LightWeight_4()
    {
        super(Weapon_LightWeight_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.DistributorDraw, -30d),
                                new ItemEffectData(ItemEffect.Integrity, -50d),
                                new ItemEffectData(ItemEffect.Mass, -75d),
                                new ItemEffectData(ItemEffect.PowerDraw, -30d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.PHASEALLOYS, 1),
                new CostData(Material.PROTOLIGHTALLOYS, 1));
    }
}
