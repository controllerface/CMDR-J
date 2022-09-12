package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ImprovedHipFireAccuracy_Kinematic extends AbstractModificationRecipe
{
    public ImprovedHipFireAccuracy_Kinematic()
    {
        super(ImprovedHipFireAccuracy_Kinematic.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Hip_Fire_Accuracy, 45d)
                ),
            new CostData(Material.EXTRACTIONYIELDDATA, 10),
            new CostData(Material.BIOMETRICDATA, 5),
            new CostData(Material.COMBATANTPERFORMANCE, 10),
            new CostData(Material.VISCOELASTICPOLYMER, 10),
            new CostData(Material.RDX, 10),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
