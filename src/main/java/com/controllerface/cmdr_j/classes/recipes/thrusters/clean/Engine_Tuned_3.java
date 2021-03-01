package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Tuned_3 extends AbstractModificationRecipe
{
    public Engine_Tuned_3()
    {
        super(Engine_Tuned_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -8d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -6d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 18d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 8d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -40d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1),
                new CostData(Material.EMISSIONDATA, 1));
    }
}
