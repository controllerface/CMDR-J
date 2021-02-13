package com.controllerface.cmdr_j.classes.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Dirty_5 extends AbstractModificationRecipe
{
    public Engine_Dirty_5()
    {
        super(Engine_Dirty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -15d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -13d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 40d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 60d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.PHARMACEUTICALISOLATORS, 1));
    }
}
