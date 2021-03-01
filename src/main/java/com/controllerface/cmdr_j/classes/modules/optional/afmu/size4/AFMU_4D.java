package com.controllerface.cmdr_j.classes.modules.optional.afmu.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_4D extends AbstractAFMU
{
    public AFMU_4D()
    {
        super("4D Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.32d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 4400d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.016d)
                ));
    }

    @Override
    public long price()
    {
        return 174_960;
    }
}
