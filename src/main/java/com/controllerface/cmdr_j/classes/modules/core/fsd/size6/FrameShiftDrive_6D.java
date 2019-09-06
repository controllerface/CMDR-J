package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;

public class FrameShiftDrive_6D extends AbstractFSD
{
    public FrameShiftDrive_6D()
    {
        super("6D Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 90.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.45),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 1080.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 5.3)
            ));
    }
}