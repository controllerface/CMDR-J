package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class StowedReloading extends AbstractModificationRecipe
{
    public StowedReloading()
    {
        super(StowedReloading.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Stowed_Reloading, "enabled")
                ),
            new CostData(Material.DIGITALDESIGNS, 10),
            new CostData(Material.OPERATIONALMANUAL, 10),
            new CostData(Material.PRODUCTIONSCHEDULE, 10),
            new CostData(Material.CIRCUITBOARD, 5),
            new CostData(Material.ENCRYPTEDMEMORYCHIP, 15),
            new CostData(CreditCost.CREDIT_COST, 1_000_000));
    }
}
