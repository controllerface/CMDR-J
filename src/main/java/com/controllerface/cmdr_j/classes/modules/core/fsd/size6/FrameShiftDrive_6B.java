package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_6B extends AbstractFSD
{
    public FrameShiftDrive_6B()
    {
        super("6B Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 64.0),
                  new ItemEffectData(ItemEffect.Integrity, 170.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.63),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 1500.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 6.6)
            ));
    }
}