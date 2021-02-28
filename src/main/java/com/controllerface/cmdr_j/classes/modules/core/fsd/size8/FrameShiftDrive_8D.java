package com.controllerface.cmdr_j.classes.modules.core.fsd.size8;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_8D extends AbstractFSD
{
    public FrameShiftDrive_8D()
    {
        super("7D Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "D")
                ));
    }

    @Override
    public long price()
    {
        return 1_899_600;
    }
}