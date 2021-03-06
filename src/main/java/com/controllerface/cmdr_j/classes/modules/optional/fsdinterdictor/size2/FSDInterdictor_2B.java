package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_2B extends AbstractFSDInterdictor
{
    public FSDInterdictor_2B()
    {
        super("2B Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.Integrity, 71d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.34d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 9d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 907_200;
    }
}
