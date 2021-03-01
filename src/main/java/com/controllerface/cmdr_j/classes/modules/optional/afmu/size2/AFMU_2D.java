package com.controllerface.cmdr_j.classes.modules.optional.afmu.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_2D extends AbstractAFMU
{
    public AFMU_2D()
    {
        super("2D Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Integrity, 31d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.9d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 2100d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.016d)
                ));
    }

    @Override
    public long price()
    {
        return 54_000;
    }
}
