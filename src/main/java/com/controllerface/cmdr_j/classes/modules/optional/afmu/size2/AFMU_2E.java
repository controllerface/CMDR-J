package com.controllerface.cmdr_j.classes.modules.optional.afmu.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_2E extends AbstractAFMU
{
    public AFMU_2E()
    {
        super("2E Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 41d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.68d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 2300d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.012d)
                ));
    }
}
