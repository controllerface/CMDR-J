package com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.limpets.recon.AbstractReconLimpet;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReconLimpet_5E extends AbstractReconLimpet
{
    public ReconLimpet_5E()
    {
        super("5E Recon Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Integrity, 96d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 1700d),
                        new ItemEffectData(ItemEffect.DroneHackingTime, 13d)
                ));
    }

    @Override
    public long price()
    {
        return 75_800;
    }
}
