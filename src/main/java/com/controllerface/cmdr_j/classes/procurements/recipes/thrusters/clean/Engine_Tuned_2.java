package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Tuned_2 extends AbstractModifcationRecipe
{
    public Engine_Tuned_2()
    {
        super(Engine_Tuned_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -4d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -4d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 13d),
                                new ItemEffectData(ItemEffect.PowerDraw, 4d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -30d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
