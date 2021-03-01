package com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.prospector.AbstractProspectorLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ProspectorLimpet_7E extends AbstractProspectorLimpet
{
    public ProspectorLimpet_7E()
    {
        super("7E Prospector Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 80d),
                        new ItemEffectData(ItemEffect.Integrity, 79d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.55d),
                        new ItemEffectData(ItemEffect.BootTime, 4d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 8d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 600d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }

    @Override
    public long price()
    {
        return 437_400;
    }
}
