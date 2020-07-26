package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_5A extends AbstractFSD
{
    public FrameShiftDrive_5A()
    {
        super("5A Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 120.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1050.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 5.0)
                ));
    }

    @Override
    public long price()
    {
        return 5_103_950;
    }
}