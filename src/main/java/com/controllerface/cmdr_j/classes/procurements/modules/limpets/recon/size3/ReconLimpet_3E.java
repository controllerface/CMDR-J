package com.controllerface.cmdr_j.classes.procurements.modules.limpets.recon.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ReconLimpet_3E extends AbstractReconLimpet
{
    public ReconLimpet_3E()
    {
        super("3E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Mass, 51d),
                        new ItemEffectData(ItemEffect.Mass, 0.2d),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.Mass, 1400d),
                        new ItemEffectData(ItemEffect.Mass, 100d),
                        new ItemEffectData(ItemEffect.Mass, 17d)
                ));
    }
}
