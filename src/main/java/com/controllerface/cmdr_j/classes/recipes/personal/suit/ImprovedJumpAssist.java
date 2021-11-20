package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ImprovedJumpAssist extends AbstractModificationRecipe
{
    public ImprovedJumpAssist()
    {
        super(ImprovedJumpAssist.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Jump_Assist, "installed")
                ),
            new CostData(Material.GMEDS, 10),
            new CostData(Material.TOPOGRAPHICALSURVEYS, 10),
            new CostData(Material.MICROTHRUSTERS, 5),
            new CostData(Material.MOTOR, 10),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
