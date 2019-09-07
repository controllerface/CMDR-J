package com.controllerface.cmdr_j.classes.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Dirty_1 extends AbstractModificationRecipe
{
    public Engine_Dirty_1()
    {
        super(Engine_Dirty_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -3d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -3d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 12d),
                                new ItemEffectData(ItemEffect.PowerDraw, 4d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 20d)
                        ),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
