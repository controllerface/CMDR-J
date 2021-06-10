package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ExtraAmmoCapacity extends AbstractModificationRecipe
{
    public ExtraAmmoCapacity()
    {
        super(ExtraAmmoCapacity.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Ammo_Capacity, 50d)
                ),
            new CostData(Material.RECYCLINGLOGS, 15),
            new CostData(Material.WEAPONTESTDATA, 10),
            new CostData(Material.PRODUCTIONREPORTS, 10),
            new CostData(Material.WEAPONCOMPONENT, 5),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
