package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ReconLimpet_5E extends AbstractReconLimpet
{
    public ReconLimpet_5E()
    {
        super("5E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Mass, 96d),
                        new ItemEffectData(ItemEffect.Mass, 0.5d),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.Mass, 1700d),
                        new ItemEffectData(ItemEffect.Mass, 100d),
                        new ItemEffectData(ItemEffect.Mass, 13d)
                ));
    }
}
