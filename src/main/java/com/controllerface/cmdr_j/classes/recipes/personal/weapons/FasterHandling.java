package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class FasterHandling extends AbstractModificationRecipe
{
    public FasterHandling()
    {
        super(FasterHandling.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Weapon_Handling, "enabled")
                ),
            new CostData(Material.OPERATIONALMANUAL, 1),
            new CostData(Material.COMBATANTPERFORMANCE, 1),
            new CostData(Material.COMBATTRAININGMATERIAL, 1),
            new CostData(Material.VISCOELASTICPOLYMER, 1),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
