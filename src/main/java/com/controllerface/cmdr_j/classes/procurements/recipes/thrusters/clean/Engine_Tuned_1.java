package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Tuned_1 extends AbstractModificationRecipe
{
    public Engine_Tuned_1()
    {
        super(Engine_Tuned_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -2d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -20d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
