package com.controllerface.cmdr_j.classes.procurements.modules.afmu.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.afmu.AbstractAFMU;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AFMU_4A extends AbstractAFMU
{
    public AFMU_4A()
    {
        super("4A Automated Field Maintenance Unit",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 92d),
                        new ItemEffectData(ItemEffect.PowerDraw, 2.31d),
                        new ItemEffectData(ItemEffect.BootTime, 9d),
                        new ItemEffectData(ItemEffect.AFMRepairCapacity, 5400d),
                        new ItemEffectData(ItemEffect.AFMRepairConsumption, 10d),
                        new ItemEffectData(ItemEffect.AFMRepairPerAmmo, 0.028d)
                ));
    }
}
