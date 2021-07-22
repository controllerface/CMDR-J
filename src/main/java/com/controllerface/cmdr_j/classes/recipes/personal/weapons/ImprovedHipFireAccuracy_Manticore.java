package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ImprovedHipFireAccuracy_Manticore extends AbstractModificationRecipe
{
    public ImprovedHipFireAccuracy_Manticore()
    {
        super(ImprovedHipFireAccuracy_Manticore.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Hip_Fire_Accuracy, 10d)
                ),
            new CostData(Material.CHEMICALPATENTS, 5),
            new CostData(Material.COMBATANTPERFORMANCE, 10),
            new CostData(Material.CHEMICALCATALYST, 10),
            new CostData(Material.ELECTROMAGNET, 10),
            new CostData(Material.METALCOIL, 10),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
