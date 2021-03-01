package com.controllerface.cmdr_j.classes.modules.optional.afmu.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_6C extends AbstractAFMU
{
    public AFMU_6C()
    {
        super("6C Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Integrity, 113d),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.33d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 7400d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.02d)
                ));
    }

    @Override
    public long price()
    {
        return 1_700_610;
    }
}
