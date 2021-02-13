package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Rapid_1 extends AbstractModificationRecipe
{
    public ShieldCellBank_Rapid_1()
    {
        super(ShieldCellBank_Rapid_1.class.getSimpleName(), ItemGrade.GRADE_1,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, 10d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration_Percent, -6d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, 5d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp_Percent, -10d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
