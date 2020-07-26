package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReconLimpet_1E extends AbstractReconLimpet
{
    public ReconLimpet_1E()
    {
        super("1E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1200d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 22d)
                ));
    }

    @Override
    public long price()
    {
        return 2_600;
    }
}
