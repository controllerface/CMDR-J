package com.controllerface.cmdr_j.classes.modules.afmu.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_2B extends AbstractAFMU
{
    public AFMU_2B()
    {
        super("2B Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 71d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.29d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 2800d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.023d)
                ));
    }
}
