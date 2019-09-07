package com.controllerface.cmdr_j.classes.modules.optional.afmu.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_1D extends AbstractAFMU
{
    public AFMU_1D()
    {
        super("1D Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.72d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 900d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.016d)
                ));
    }
}
