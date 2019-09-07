package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
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
                                new ItemEffectData(ItemEffect.BootTime, 10d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration, -6d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement, 5d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp, -10d)
                        ),
                new CostData(Material.SULPHUR, 1));
    }
}
