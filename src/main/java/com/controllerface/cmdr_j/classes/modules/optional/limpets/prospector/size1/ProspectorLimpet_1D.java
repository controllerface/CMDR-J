package com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.AbstractProspectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ProspectorLimpet_1D extends AbstractProspectorLimpet
{
    public ProspectorLimpet_1D()
    {
        super("1D Prospector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 0.5d),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }

    @Override
    public long price()
    {
        return 1_200;
    }
}
