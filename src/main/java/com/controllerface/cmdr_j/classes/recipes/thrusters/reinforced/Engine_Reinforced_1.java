package com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Engine_Reinforced_1 extends AbstractModificationRecipe
{
    public Engine_Reinforced_1()
    {
        super(Engine_Reinforced_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 30d),
                                new ItemEffectData(ItemEffect.Mass, 5d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -10d)
                        ),
                new CostData(Material.CARBON, 1));
    }
}
