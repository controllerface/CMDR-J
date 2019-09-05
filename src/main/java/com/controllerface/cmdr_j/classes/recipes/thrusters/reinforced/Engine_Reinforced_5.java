package com.controllerface.cmdr_j.classes.recipes.thrusters.reinforced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Engine_Reinforced_5 extends AbstractModificationRecipe
{
    public Engine_Reinforced_5()
    {
        super(Engine_Reinforced_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 110d),
                                new ItemEffectData(ItemEffect.Mass, 25d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -50d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.IMPERIALSHIELDING, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
