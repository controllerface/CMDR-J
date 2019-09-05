package com.controllerface.cmdr_j.classes.procurements.modules.afmu.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_6E extends AbstractAFMU
{
    public AFMU_6E()
    {
        super("6E Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 90d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.4d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 7400d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.012d)
                ));
    }
}