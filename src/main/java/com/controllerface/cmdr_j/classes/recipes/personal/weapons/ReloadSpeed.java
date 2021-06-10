package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ReloadSpeed extends AbstractModificationRecipe
{
    public ReloadSpeed()
    {
        super(ReloadSpeed.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Weapon_Reload, "enabled")
                ),
            new CostData(Material.OPERATIONALMANUAL, 10),
            new CostData(Material.PRODUCTIONREPORTS, 10),
            new CostData(Material.COMBATTRAININGMATERIAL, 10),
            new CostData(Material.MICROHYDRAULICS, 10),
            new CostData(Material.ELECTROMAGNET, 10),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
