package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ExtraBackpackCapacity extends AbstractModificationRecipe
{
    public ExtraBackpackCapacity()
    {
        super(ExtraBackpackCapacity.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Backpack_Capacity, 100d)
                ),
            new CostData(Material.WEAPONINVENTORY, 10),
            new CostData(Material.CHEMICALINVENTORY, 10),
            new CostData(Material.DIGITALDESIGNS, 10),
            new CostData(Material.EPOXYADHESIVE, 10),
            new CostData(Material.MEMORYCHIP, 5),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
