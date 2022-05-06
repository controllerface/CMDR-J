package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class BaltanosReferral extends AbstractEngineerProgressRecipe
{
    public BaltanosReferral()
    {
        super("Baltanos :: Referral",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_referral, "Yi Shen")),
            new CostData(Material.FACTIONASSOCIATES, 10));
    }
}
