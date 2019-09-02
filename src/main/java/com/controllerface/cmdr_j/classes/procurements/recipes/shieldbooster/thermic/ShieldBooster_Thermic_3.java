package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Thermic_3 extends AbstractModificationRecipe
{
    public ShieldBooster_Thermic_3()
    {
        super(ShieldBooster_Thermic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -3d),
                                new ItemEffectData(ItemEffect.KineticResistance, -3d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 17d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.HEATCONDUCTIONWIRING, 1),
                new CostData(Material.HEATDISPERSIONPLATE, 1));
    }
}
