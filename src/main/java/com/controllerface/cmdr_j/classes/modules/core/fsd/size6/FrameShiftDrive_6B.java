package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_6B extends AbstractFSD
{
    public FrameShiftDrive_6B()
    {
        super("6B Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "B"),
                        new ItemEffectData(ItemEffect.Mass, 64.0),
                        new ItemEffectData(ItemEffect.Integrity, 170.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.63),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1500.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 6.6)
                ));
    }

    @Override
    public long price()
    {
        return 5_393_180;
    }
}