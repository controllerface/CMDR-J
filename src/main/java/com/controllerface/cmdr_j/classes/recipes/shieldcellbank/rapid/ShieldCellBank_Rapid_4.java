package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Rapid_4 extends AbstractModificationRecipe
{
    public ShieldCellBank_Rapid_4()
    {
        super(ShieldCellBank_Rapid_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, 25d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration, -24d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement, 20d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp, -40d)
                        ),
                new CostData(Material.CHROMIUM, 1),
                new CostData(Material.ELECTROCHEMICALARRAYS, 1),
                new CostData(Material.THERMICALLOYS, 1));
    }
}
