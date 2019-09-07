package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.rapid;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Rapid_3 extends AbstractModificationRecipe
{
    public ShieldCellBank_Rapid_3()
    {
        super(ShieldCellBank_Rapid_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, 20d),
                                new ItemEffectData(ItemEffect.ShieldBankDuration, -18d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement, 15d),
                                new ItemEffectData(ItemEffect.ShieldBankSpinUp, -30d)
                        ),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.PRECIPITATEDALLOYS, 1),
                new CostData(Material.MECHANICALSCRAP, 1));
    }
}
