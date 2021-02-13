package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Tuned_5 extends AbstractModificationRecipe
{
    public Engine_Tuned_5()
    {
        super(Engine_Tuned_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -16d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -10d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 28d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 16d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -60d)
                        ),
                new CostData(Material.COMPACTEMISSIONSDATA, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.TIN, 1));
    }
}
