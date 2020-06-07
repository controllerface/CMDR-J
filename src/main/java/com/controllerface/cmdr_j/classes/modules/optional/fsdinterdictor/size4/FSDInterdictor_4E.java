package com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FSDInterdictor_4E extends AbstractFSDInterdictor
{
    public FSDInterdictor_4E()
    {
        super("4E Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 10d),
                        new ItemEffectData(ItemEffect.Integrity, 64d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 12d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }

    @Override
    public long price()
    {
        return 263_420;
    }
}
