package com.controllerface.cmdr_j.classes.modules.optional.afmu.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AFMU_8B extends AbstractAFMU
{
    public AFMU_8B()
    {
        super("8B Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 210d),
                        new ItemEffectData(ItemEffect.PowerDraw, 3.45d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 12000d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.023d)
                ));
    }
}
