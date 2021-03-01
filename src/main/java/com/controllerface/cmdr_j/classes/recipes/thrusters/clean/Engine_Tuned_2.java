package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Tuned_2 extends AbstractModificationRecipe
{
    public Engine_Tuned_2()
    {
        super(Engine_Tuned_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -4d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -4d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 13d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 4d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -30d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
