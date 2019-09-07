package com.controllerface.cmdr_j.classes.modules.core.fsd.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_2D extends AbstractFSD
{
    public FrameShiftDrive_2D()
    {
        super("2D Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 1.0),
                  new ItemEffectData(ItemEffect.Integrity, 41.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.18),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 54.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 10.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 0.6)
            ));
    }
}