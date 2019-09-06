package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FrameShiftDrive_5C extends AbstractFSD
{
    public FrameShiftDrive_5C()
    {
        super("5C Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 20.0),
                  new ItemEffectData(ItemEffect.Integrity, 96.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.4),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 700.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 3.3)
            ));
    }
}