package com.controllerface.cmdr_j.classes.recipes.thrusters.dirty;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Dirty_4 extends AbstractModificationRecipe
{
    public Engine_Dirty_4()
    {
        super(Engine_Dirty_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -12d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -10d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 33d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 10d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, 50d)
                        ),
                new CostData(Material.CONFIGURABLECOMPONENTS, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1),
                new CostData(Material.SELENIUM, 1));
    }
}
