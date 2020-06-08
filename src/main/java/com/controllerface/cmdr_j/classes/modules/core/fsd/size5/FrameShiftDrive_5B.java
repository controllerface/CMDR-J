package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_5B extends AbstractFSD
{
    public FrameShiftDrive_5B()
    {
        super("5B Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 32.0),
                        new ItemEffectData(ItemEffect.Integrity, 144.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 875.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 4.1)
                ));
    }

    @Override
    public long price()
    {
        return 1_701_320;
    }
}