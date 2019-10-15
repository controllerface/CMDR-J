package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_5D extends AbstractFSD
{
    public FrameShiftDrive_5D()
    {
        super("5D Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 8.0),
                  new ItemEffectData(ItemEffect.Integrity, 77.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.36),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 630.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 3.3)
            ));
    }

    @Override
    public long price()
    {
        return 189_040;
    }
}