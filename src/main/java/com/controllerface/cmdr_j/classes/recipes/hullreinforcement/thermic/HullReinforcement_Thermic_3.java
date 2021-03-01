package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.thermic;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Thermic_3 extends AbstractModificationRecipe
{
    public HullReinforcement_Thermic_3()
    {
        super(HullReinforcement_Thermic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 9d),
                                new ItemEffectData(ItemEffect.KineticResistance, -6d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 26d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
