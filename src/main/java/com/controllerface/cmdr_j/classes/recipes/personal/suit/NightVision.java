package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class NightVision extends AbstractModificationRecipe
{
    public NightVision()
    {
        super(NightVision.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Night_Vision, "enabled")
                ),
            new CostData(Material.SURVEILLANCEEQUIPMENT, 10),
            new CostData(Material.SURVEILLEANCELOGS, 5),
            new CostData(Material.RADIOACTIVITYDATA, 5),
            new CostData(Material.NOCDATA, 5),
            new CostData(Material.CIRCUITSWITCH, 10),
            new CostData(CreditCost.CREDIT_COST, 1_000_000));
    }
}
