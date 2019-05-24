package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Explosive_5 extends AbstractModifcationRecipe
{
    public ShieldBooster_Explosive_5()
    {
        super(ShieldBooster_Explosive_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 27d),
                                new ItemEffectData(ItemEffect.KineticResistance, -5d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -5d)
                        ),
                new CostData(Material.SHIELDPATTERNANALYSIS, 1),
                new CostData(Material.EXQUISITEFOCUSCRYSTALS, 1),
                new CostData(Material.NIOBIUM, 1));
    }
}
