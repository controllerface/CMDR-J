package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;

public class FrameShiftDrive_6E extends AbstractFSD
{
    public FrameShiftDrive_6E()
    {
        super("6E Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 102.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 960.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 5.3)
            ));
    }
}