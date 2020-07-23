package com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Reinforced_2 extends AbstractModificationRecipe
{
    public Engine_Reinforced_2()
    {
        super(Engine_Reinforced_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 50d),
                                new ItemEffectData(ItemEffect.Mass, 10d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -20d)
                        ),
                new CostData(Material.HEATCONDUCTIONWIRING, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
