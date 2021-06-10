package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Stability extends AbstractModificationRecipe
{
    public Stability()
    {
        super(Stability.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Weapon_Stability, 30d)
                ),
            new CostData(Material.MININGANALYTICS, 10),
            new CostData(Material.RISKASSESSMENTS, 15),
            new CostData(Material.VISCOELASTICPOLYMER, 10),
            new CostData(Material.MICROHYDRAULICS, 10),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
