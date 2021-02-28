package com.controllerface.cmdr_j.classes.modules.core.fsd.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_8B extends AbstractFSD
{
    public FrameShiftDrive_8B()
    {
        super("7B Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "B")
                ));
    }

    @Override
    public long price()
    {
        return 17_096_370;
    }
}