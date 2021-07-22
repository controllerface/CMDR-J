package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HeadShotDamage_Takada extends AbstractModificationRecipe
{
    public HeadShotDamage_Takada()
    {
        super(HeadShotDamage_Takada.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Headshot_Damage, "enabled")
                ),
            new CostData(Material.SPECTRALANALYSISDATA, 10),
            new CostData(Material.BIOMETRICDATA, 5),
            new CostData(Material.IONBATTERY, 10),
            new CostData(Material.OPTICALLENS, 5),
            new CostData(Material.SCRAMBLER, 10),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
