package com.controllerface.cmdr_j.classes.recipes.thrusters.clean;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Tuned_4 extends AbstractModificationRecipe
{
    public Engine_Tuned_4()
    {
        super(Engine_Tuned_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity_Percent, -12d),
                                new ItemEffectData(ItemEffect.EngineOptimalMass_Percent, -8d),
                                new ItemEffectData(ItemEffect.EngineOptPerformance, 23d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 12d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -50d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.DECODEDEMISSIONDATA, 1),
                new CostData(Material.CONSUMERFIRMWARE, 1));
    }
}
