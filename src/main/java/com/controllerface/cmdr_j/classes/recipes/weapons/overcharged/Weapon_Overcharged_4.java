package com.controllerface.cmdr_j.classes.recipes.weapons.overcharged;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Weapon_Overcharged_4 extends AbstractModificationRecipe
{
    public Weapon_Overcharged_4()
    {
        super(Weapon_Overcharged_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoClipSize, -12d),
                                new ItemEffectData(ItemEffect.Damage, 60d),
                                new ItemEffectData(ItemEffect.DistributorDraw, 30d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 12d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.POLYMERCAPACITORS, 1),
                new CostData(Material.ZINC, 1));
    }
}
