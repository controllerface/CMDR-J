package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class WellingtonBeckInvite extends AbstractEngineerProgressRecipe
{
    public WellingtonBeckInvite()
    {
        super("Wellington Beck :: Invite",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_unlock, "Invite from Wellington Beck")),
            new CostData(Material.CLASSICENTERTAINMENT, 7),
            new CostData(Material.MULTIMEDIAENTERTAINMENT, 7),
            new CostData(Material.CATMEDIA, 6));
    }
}
