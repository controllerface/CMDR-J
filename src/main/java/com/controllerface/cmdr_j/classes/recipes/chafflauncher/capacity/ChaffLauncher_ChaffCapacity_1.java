package com.controllerface.cmdr_j.classes.recipes.chafflauncher.capacity;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ChaffLauncher_ChaffCapacity_1 extends AbstractModificationRecipe
{
    public ChaffLauncher_ChaffCapacity_1()
    {
        super(ChaffLauncher_ChaffCapacity_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.AmmoMaximum_Percent, 50d),
                                new ItemEffectData(ItemEffect.Mass_Percent, 100d),
                                new ItemEffectData(ItemEffect.ReloadTime_Percent, 10d)
                        ),
                new CostData(Material.MECHANICALSCRAP, 1),
                new CostData(Material.NIOBIUM, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
