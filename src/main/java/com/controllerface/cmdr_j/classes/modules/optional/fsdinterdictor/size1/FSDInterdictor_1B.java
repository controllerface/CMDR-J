package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_1B extends AbstractFSDInterdictor
{
    public FSDInterdictor_1B()
    {
        super("1B Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 56d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.28d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 6d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 324_000;
    }
}
