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

public class HeadShotDamage extends AbstractModificationRecipe
{
    public HeadShotDamage()
    {
        super(HeadShotDamage.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Headshot_Damage, "enabled")
                ),
            new CostData(Consumable.AMM_GRENADE_FRAG, 25),
            new CostData(Material.WEAPONTESTDATA, 10),
            new CostData(Material.MEDICALRECORDS, 5),
            new CostData(Material.CHEMICALCATALYST, 10),
            new CostData(Material.RDX, 15),
            new CostData(Material.WEAPONCOMPONENT, 5),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
