package com.controllerface.cmdr_j.classes.modules.core.fsd.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_7B extends AbstractFSD
{
    public FrameShiftDrive_7B()
    {
        super("7B Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 128.0),
                  new ItemEffectData(ItemEffect.Integrity, 197.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.75),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 2250.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 43.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 10.6)
            ));
    }

    @Override
    public long price()
    {
        return 17_096_370;
    }
}