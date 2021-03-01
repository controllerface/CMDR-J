package com.controllerface.cmdr_j.classes.recipes.shieldcellbank.specialized;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class ShieldCellBank_Specialized_2 extends AbstractModificationRecipe
{
    public ShieldCellBank_Specialized_2()
    {
        super(ShieldCellBank_Specialized_2.class.getSimpleName(), ItemGrade.GRADE_2,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime_Percent, -16d),
                                new ItemEffectData(ItemEffect.Integrity_Percent, -10d),
                                new ItemEffectData(ItemEffect.PowerDraw_Percent, 15d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement_Percent, 6d),
                                new ItemEffectData(ItemEffect.ThermalLoad_Percent, -12d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.LEGACYFIRMWARE, 1));
    }
}
