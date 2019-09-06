package com.controllerface.cmdr_j.classes.modules.core.fsd.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FrameShiftDrive_2B extends AbstractFSD
{
    public FrameShiftDrive_2B()
    {
        super("2B Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 4.0),
                  new ItemEffectData(ItemEffect.Integrity, 77.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.25),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 75.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 10.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 0.8)
            ));
    }
}