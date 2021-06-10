package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class NoiseSuppressor extends AbstractModificationRecipe
{
    public NoiseSuppressor()
    {
        super(NoiseSuppressor.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Noise_Suppressor, "enabled")
                ),
            new CostData(Material.ATMOSPHERICDATA, 10),
            new CostData(Material.MININGANALYTICS, 10),
            new CostData(Material.VISCOELASTICPOLYMER, 15),
            new CostData(Material.WEAPONCOMPONENT, 5),
            new CostData(CreditCost.CREDIT_COST, 1_000_000));
    }
}
