package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class MarcoQwentUnlock extends AbstractEngineerProgressRecipe
{
    public MarcoQwentUnlock()
    {
        super("Marco Qwent :: Unlock",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_access, "Marco Qwent")),
            new CostData(Commodity.MODULARTERMINALS, 25));
    }
}
