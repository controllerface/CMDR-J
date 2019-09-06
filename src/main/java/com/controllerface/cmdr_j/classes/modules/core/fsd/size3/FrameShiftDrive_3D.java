package com.controllerface.cmdr_j.classes.modules.core.fsd.size3;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;

public class FrameShiftDrive_3D extends AbstractFSD
{
    public FrameShiftDrive_3D()
    {
        super("3D Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 51.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.27),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 90.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 14.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 1.2)
            ));
    }
}