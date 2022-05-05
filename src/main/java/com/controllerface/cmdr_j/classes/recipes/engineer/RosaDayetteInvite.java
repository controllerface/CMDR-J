package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class RosaDayetteInvite extends AbstractEngineerProgressRecipe
{
    public RosaDayetteInvite()
    {
        super("Rosa Dayette :: Invite",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_unlock, "Invite from Rosa Dayette")),
            new CostData(Material.CULINARYRECIPES, 5),
            new CostData(Material.COCKTAILRECIPES, 5));
    }
}
