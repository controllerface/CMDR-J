package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;

public class FrameShiftDrive_5E extends AbstractFSD
{
    public FrameShiftDrive_5E()
    {
        super("5E Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 86.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.32),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 560.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 3.3)
            ));
    }
}