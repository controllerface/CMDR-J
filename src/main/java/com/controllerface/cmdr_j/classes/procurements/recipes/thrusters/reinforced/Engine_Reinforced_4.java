package com.controllerface.cmdr_j.classes.procurements.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Reinforced_4 extends AbstractModificationRecipe
{
    public Engine_Reinforced_4()
    {
        super(Engine_Reinforced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 90d),
                                new ItemEffectData(ItemEffect.Mass, 20d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -40d)
                        ),
                new CostData(Material.COMPOUNDSHIELDING, 1),
                new CostData(Material.HEATDISPERSIONPLATE, 1),
                new CostData(Material.HIGHDENSITYCOMPOSITES, 1));
    }
}
