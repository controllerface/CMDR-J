package com.controllerface.cmdr_j.classes.modules.optional.afmu.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_1A extends AbstractAFMU
{
    public AFMU_1A()
    {
        super("1A Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 46d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.26d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 1100d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.028d)
                ));
    }
}
