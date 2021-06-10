package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class IncreasedSprintDuration extends AbstractModificationRecipe
{
    public IncreasedSprintDuration()
    {
        super(IncreasedSprintDuration.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Sprint_Assist, "enabled")
                ),
            new CostData(Material.TROOPDEPLOYMENTRECORDS, 5),
            new CostData(Material.GENESEQUENCINGDATA, 5),
            new CostData(Material.CLINICALTRAILRECORDS, 5),
            new CostData(Material.OXYGENICBACTERIA, 10),
            new CostData(Material.CHEMICALCATALYST, 10),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
