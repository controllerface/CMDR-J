package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class CombatMovementSpeed extends AbstractModificationRecipe
{
    public CombatMovementSpeed()
    {
        super(CombatMovementSpeed.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Negate_Movement_Penalty, "enhanced")
                ),
            new CostData(Material.EVACUATIONPROTOCOLS, 10),
            new CostData(Material.GENETICRESEARCH, 5),
            new CostData(Material.EPINEPHRINE, 10),
            new CostData(Material.PHNEUTRALISER, 15),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
