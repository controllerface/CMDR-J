package com.controllerface.cmdr_j.classes.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Dirty_3 extends AbstractModificationRecipe
{
    public Engine_Dirty_3()
    {
        super(Engine_Dirty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -9d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -8d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 26d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 40d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
