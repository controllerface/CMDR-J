package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ElviraMartuukUnlock extends AbstractEngineerProgressRecipe
{
    public ElviraMartuukUnlock()
    {
        super("Elvira Martuuk :: Unlock",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_access, "Elvira Martuuk")),
            new CostData(Commodity.SOONTILLRELICS, 3));
    }
}
