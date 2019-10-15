package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReconLimpet_1E extends AbstractReconLimpet
{
    public ReconLimpet_1E()
    {
        super("1E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Mass, 24d),
                        new ItemEffectData(ItemEffect.Mass, 0.18d),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.Mass, 1200d),
                        new ItemEffectData(ItemEffect.Mass, 100d),
                        new ItemEffectData(ItemEffect.Mass, 22d)
                ));
    }

    @Override
    public long price()
    {
        return 2_600;
    }
}
