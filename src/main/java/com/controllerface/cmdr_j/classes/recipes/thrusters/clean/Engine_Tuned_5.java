package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
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
                                new ItemEffectData(ItemEffect.Integrity, -16d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -10d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 28d),
                                new ItemEffectData(ItemEffect.PowerDraw, 16d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -60d)
                        ),
                new CostData(Material.COMPACTEMISSIONSDATA, 1),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.TIN, 1));
    }
}
