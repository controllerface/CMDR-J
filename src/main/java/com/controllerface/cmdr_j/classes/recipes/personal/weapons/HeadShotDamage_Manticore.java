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

public class HeadShotDamage_Manticore extends AbstractModificationRecipe
{
    public HeadShotDamage_Manticore()
    {
        super(HeadShotDamage_Manticore.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Headshot_Damage, "enabled")
                ),
            new CostData(Material.CHEMICALEXPERIMENTDATA, 10),
            new CostData(Material.BLOODTESTRESULTS, 5),
            new CostData(Material.IONBATTERY, 10),
            new CostData(Material.ELECTROMAGNET, 10),
            new CostData(Material.MICROSUPERCAPACITOR, 10),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
