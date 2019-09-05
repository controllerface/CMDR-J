package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldCellBank_Rapid_2 extends AbstractModificationRecipe
{
    public ShieldCellBank_Rapid_2()
    {
        super(ShieldCellBank_Rapid_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, 15d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration, -12d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement, 10d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp, -20d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
