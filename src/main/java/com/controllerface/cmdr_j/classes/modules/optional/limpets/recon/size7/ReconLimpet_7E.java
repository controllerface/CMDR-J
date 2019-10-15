package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReconLimpet_7E extends AbstractReconLimpet
{
    public ReconLimpet_7E()
    {
        super("7E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 128d),
                        new ItemEffectData(ItemEffect.Mass, 157d),
                        new ItemEffectData(ItemEffect.Mass, 0.97d),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2000d),
                        new ItemEffectData(ItemEffect.Mass, 100d),
                        new ItemEffectData(ItemEffect.Mass, 10d)
                ));
    }

    @Override
    public long price()
    {
        return 612_200;
    }
}
