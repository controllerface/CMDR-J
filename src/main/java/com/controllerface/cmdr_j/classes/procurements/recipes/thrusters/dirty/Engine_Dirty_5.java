package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Dirty_5 extends AbstractModifcationRecipe
{
    public Engine_Dirty_5()
    {
        super(Engine_Dirty_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -15d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -13d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 40d),
                                new ItemEffectData(ItemEffect.PowerDraw, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad, 60d)
                        ),
                new CostData(Material.CADMIUM, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.PHARMACEUTICALISOLATORS, 1));
    }
}
