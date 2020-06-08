package com.controllerface.cmdr_j.classes.modules.core.fsd.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_7E extends AbstractFSD
{
    public FrameShiftDrive_7E()
    {
        super("7E Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 118.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.48),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1440.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 43.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 8.5)
                ));
    }

    @Override
    public long price()
    {
        return 633_200;
    }
}