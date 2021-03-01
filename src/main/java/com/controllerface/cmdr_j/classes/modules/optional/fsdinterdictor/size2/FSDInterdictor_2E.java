package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_2E extends AbstractFSDInterdictor
{
    public FSDInterdictor_2E()
    {
        super("2E Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.5d),
                        new ItemEffectData(ItemEffect.Integrity, 41d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.17d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 6d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 33_600;
    }
}
