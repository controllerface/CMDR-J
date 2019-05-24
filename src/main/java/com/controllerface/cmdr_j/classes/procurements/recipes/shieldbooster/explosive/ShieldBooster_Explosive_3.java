package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Explosive_3 extends AbstractModifcationRecipe
{
    public ShieldBooster_Explosive_3()
    {
        super(ShieldBooster_Explosive_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 17d),
                                new ItemEffectData(ItemEffect.KineticResistance, -3d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -3d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.IRON, 1));
    }
}
