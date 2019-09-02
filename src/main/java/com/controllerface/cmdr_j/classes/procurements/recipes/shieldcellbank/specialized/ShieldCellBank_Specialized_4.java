package com.controllerface.cmdr_j.classes.procurements.recipes.shieldcellbank.specialized;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldCellBank_Specialized_4 extends AbstractModificationRecipe
{
    public ShieldCellBank_Specialized_4()
    {
        super(ShieldCellBank_Specialized_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.BootTime, -32d),
                                new ItemEffectData(ItemEffect.Integrity, -20d),
                                new ItemEffectData(ItemEffect.PowerDraw, 25d),
                                new ItemEffectData(ItemEffect.ShieldBankReinforcement, 10d),
                                new ItemEffectData(ItemEffect.ThermalLoad, -24d)
                        ),
                new CostData(Material.CONDUCTIVECOMPONENTS, 1),
                new CostData(Material.INDUSTRIALFIRMWARE, 1),
                new CostData(Material.YTTRIUM, 1));
    }
}
