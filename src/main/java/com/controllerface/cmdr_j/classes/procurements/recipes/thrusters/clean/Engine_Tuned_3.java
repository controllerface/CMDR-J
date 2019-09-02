package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Tuned_3 extends AbstractModificationRecipe
{
    public Engine_Tuned_3()
    {
        super(Engine_Tuned_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, -8d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass, -6d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 18d),
                                new ItemEffectData(ItemEffect.PowerDraw, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -40d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
