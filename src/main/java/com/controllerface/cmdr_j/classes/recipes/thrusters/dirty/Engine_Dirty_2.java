package com.controllerface.cmdr_j.classes.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Dirty_2 extends AbstractModificationRecipe
{
    public Engine_Dirty_2()
    {
        super(Engine_Dirty_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -6d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -5d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 19d),
                                new ItemEffectData(ItemEffect.PowerDraw, 6d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 30d)
                        ),
                new CostData(Material.MECHANICALEQUIPMENT, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
