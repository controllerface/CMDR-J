package com.controllerface.cmdr_j.classes.procurements.modules.afmu.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_5D extends AbstractAFMU
{
    public AFMU_5D()
    {
        super("5D Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 58d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.56d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 5500d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.016d)
                ));
    }
}
