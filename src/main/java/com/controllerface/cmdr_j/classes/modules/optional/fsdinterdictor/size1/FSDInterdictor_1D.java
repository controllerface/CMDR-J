package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_1D extends AbstractFSDInterdictor
{
    public FSDInterdictor_1D()
    {
        super("1D Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 0.5d),
                        new ItemEffectData(ItemEffect.Integrity, 24d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.18d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 4d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 36_000;
    }
}
