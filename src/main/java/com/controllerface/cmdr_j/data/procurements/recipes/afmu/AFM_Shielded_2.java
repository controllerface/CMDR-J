package com.controllerface.cmdr_j.data.procurements.recipes.afmu;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class AFM_Shielded_2 extends AbstractModifcationRecipe
{
    public AFM_Shielded_2()
    {
        super(AFM_Shielded_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 120d),
                                new ItemEffectData(ItemEffect.PowerDraw, 40d)
                        ),
                new CostData(Material.CARBON, 1),
                new CostData(Material.SHIELDEMITTERS, 1));
    }
}
