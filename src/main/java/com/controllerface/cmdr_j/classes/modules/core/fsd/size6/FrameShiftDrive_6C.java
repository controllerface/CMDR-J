package com.controllerface.cmdr_j.classes.modules.core.fsd.size6;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FrameShiftDrive_6C extends AbstractFSD
{
    public FrameShiftDrive_6C()
    {
        super("6C Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 40.0),
                  new ItemEffectData(ItemEffect.Integrity, 113.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.5),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 1200.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 37.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 5.3)
            ));
    }
}