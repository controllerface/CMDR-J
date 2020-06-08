package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_6A extends AbstractFSD
{
    public FrameShiftDrive_6A()
    {
        super("6A Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 141.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.75),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1800.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 8.0)
                ));
    }

    @Override
    public long price()
    {
        return 16_179_530;
    }
}