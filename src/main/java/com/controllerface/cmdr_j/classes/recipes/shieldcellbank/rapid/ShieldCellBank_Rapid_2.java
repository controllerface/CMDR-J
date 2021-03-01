package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Rapid_2 extends AbstractModificationRecipe
{
    public ShieldCellBank_Rapid_2()
    {
        super(ShieldCellBank_Rapid_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, 15d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration_Percent, -12d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, 10d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp_Percent, -20d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.GRIDRESISTORS, 1));
    }
}
