package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class GreaterRange_Manticore extends AbstractModificationRecipe
{
    public GreaterRange_Manticore()
    {
        super(GreaterRange_Manticore.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Weapon_Range, "enabled")
                ),
            new CostData(Material.CHEMICALFORMULAE, 10),
            new CostData(Material.MINERALSURVEY, 15),
            new CostData(Material.MOTOR, 5),
            new CostData(Material.ELECTROMAGNET, 10),
            new CostData(Material.ELECTRICALFUSE, 5),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
