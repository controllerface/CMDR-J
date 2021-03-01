package com.controllerface.cmdr_j.classes.modules.optional.afmu.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_2A extends AbstractAFMU
{
    public AFMU_2A()
    {
        super("2A Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Integrity, 59d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.58d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 2500d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.028d)
                ));
    }

    @Override
    public long price()
    {
        return 1_458_000;
    }
}
