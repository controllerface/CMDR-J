package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Dirty_3 extends AbstractModifcationRecipe
{
    public Engine_Dirty_3()
    {
        super(Engine_Dirty_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -9d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -8d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 26d),
                                new ItemEffectData(ItemEffect.PowerDraw, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 40d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.MECHANICALCOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
