package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReconLimpet_3E extends AbstractReconLimpet
{
    public ReconLimpet_3E()
    {
        super("3E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 51d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1400d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 17d)
                ));
    }

    @Override
    public long price()
    {
        return 8_200;
    }
}
