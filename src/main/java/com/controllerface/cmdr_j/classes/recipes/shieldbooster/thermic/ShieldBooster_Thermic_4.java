package com.controllerface.cmdr_j.classes.recipes.shieldbooster.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Thermic_4 extends AbstractModificationRecipe
{
    public ShieldBooster_Thermic_4()
    {
        super(ShieldBooster_Thermic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, -4d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 22d)
                        ),
                new CostData(Material.HEATDISPERSIONPLATE, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
