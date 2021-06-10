package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class EnhancedTracking extends AbstractModificationRecipe
{
    public EnhancedTracking()
    {
        super(EnhancedTracking.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Increased_Tracking_Range, 100d),
                    new ItemEffectData(ItemEffect.Increased_Tracking_Time, 10d)
                ),
            new CostData(Material.TOPOGRAPHICALSURVEYS, 10),
            new CostData(Material.STELLARACTIVITYLOGS, 10),
            new CostData(Material.SPECTRALANALYSISDATA, 10),
            new CostData(Material.TRANSMITTER, 5),
            new CostData(Material.CIRCUITBOARD, 5),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
