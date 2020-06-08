package com.controllerface.cmdr_j.classes.modules.core.fsd.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_3C extends AbstractFSD
{
    public FrameShiftDrive_3C()
    {
        super("3C Standard Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Mass, 5.0),
                        new ItemEffectData(ItemEffect.Integrity, 64.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.3),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 100.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 14.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 1.2)
                ));
    }

    @Override
    public long price()
    {
        return 56_440;
    }
}