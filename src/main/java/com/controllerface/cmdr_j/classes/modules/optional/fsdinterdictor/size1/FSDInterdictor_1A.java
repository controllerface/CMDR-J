package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_1A extends AbstractFSDInterdictor
{
    public FSDInterdictor_1A()
    {
        super("1A Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.32d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 7d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 972_000;
    }
}
