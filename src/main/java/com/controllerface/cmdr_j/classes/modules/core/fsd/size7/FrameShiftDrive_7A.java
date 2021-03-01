package com.controllerface.cmdr_j.classes.modules.core.fsd.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_7A extends AbstractFSD
{
    public FrameShiftDrive_7A()
    {
        super("7A Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 164.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.9),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 2700.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 43.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 12.8)
                ));
    }

    @Override
    public long price()
    {
        return 51_289_110;
    }
}