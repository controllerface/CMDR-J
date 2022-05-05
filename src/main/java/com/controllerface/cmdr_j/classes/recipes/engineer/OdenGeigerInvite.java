package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class OdenGeigerInvite extends AbstractEngineerProgressRecipe
{
    public OdenGeigerInvite()
    {
        super("Oden Geiger :: Invite",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_unlock, "Invite from Oden Geiger")),
            new CostData(Material.GENETICSAMPLE, 7),
            new CostData(Material.EMPLOYEEGENETICDATA, 7),
            new CostData(Material.GENETICRESEARCH, 6));
    }
}
