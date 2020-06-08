package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_6E extends AbstractFSD
{
    public FrameShiftDrive_6E()
    {
        super("6E Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Mass, 40.0),
                        new ItemEffectData(ItemEffect.Integrity, 102.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 960.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 5.3)
                ));
    }

    @Override
    public long price()
    {
        return 199_750;
    }
}