package com.controllerface.cmdr_j.classes.modules.core.fsd.size8;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_8A extends AbstractFSD
{
    public FrameShiftDrive_8A()
    {
        super("7A Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 8.0),
                        new ItemEffectData(ItemEffect.Class, "A")
                ));
    }

    @Override
    public long price()
    {
        return 51_289_110;
    }
}