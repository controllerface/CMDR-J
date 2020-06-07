package com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.AbstractProspectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ProspectorLimpet_1C extends AbstractProspectorLimpet
{
    public ProspectorLimpet_1C()
    {
        super("1C Prospector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 40d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.23d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }

    @Override
    public long price()
    {
        return 2_400;
    }
}
