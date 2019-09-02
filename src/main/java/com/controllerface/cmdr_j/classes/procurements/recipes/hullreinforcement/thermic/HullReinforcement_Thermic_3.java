package com.controllerface.cmdr_j.classes.procurements.recipes.hullreinforcement.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class HullReinforcement_Thermic_3 extends AbstractModifcationRecipe
{
    public HullReinforcement_Thermic_3()
    {
        super(HullReinforcement_Thermic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -6d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                                new ItemEffectData(ItemEffect.KineticResistance, -6d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 25.4d)
                        ),
                new CostData(Material.HEATEXCHANGERS, 1),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
