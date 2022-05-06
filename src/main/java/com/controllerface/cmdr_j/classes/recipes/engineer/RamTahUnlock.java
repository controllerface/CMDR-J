package com.controllerface.cmdr_j.classes.recipes.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractEngineerProgressRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class RamTahUnlock extends AbstractEngineerProgressRecipe
{
    public RamTahUnlock()
    {
        super("Ram Tah :: Unlock",
            ItemGrade.EngineerAccess,
            new ItemEffects(new ItemEffectData(ItemEffect.engineer_access, "Ram Tah")),
            new CostData(Material.SCANDATABANKS, 50));
    }
}
