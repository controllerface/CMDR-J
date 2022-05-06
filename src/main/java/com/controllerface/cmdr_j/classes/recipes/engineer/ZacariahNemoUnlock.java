package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ZacariahNemoUnlock extends AbstractEngineerProgressRecipe
{
    public ZacariahNemoUnlock()
    {
        super("Zacariah Nemo :: Unlock",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_access, "Zacariah Nemo")),
            new CostData(Commodity.XIHECOMPANIONS, 25));
    }
}
