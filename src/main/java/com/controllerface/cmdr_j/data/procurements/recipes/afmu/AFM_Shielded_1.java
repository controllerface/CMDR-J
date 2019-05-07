package com.controllerface.cmdr_j.data.procurements.recipes.afmu;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class AFM_Shielded_1 extends AbstractModifcationRecipe
{
    public AFM_Shielded_1()
    {
        super(AFM_Shielded_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.Integrity, 60d),
                                new ItemEffectData(ItemEffect.PowerDraw, 20d)
                        ),
                new CostData(Material.WORNSHIELDEMITTERS, 1));
    }
}
