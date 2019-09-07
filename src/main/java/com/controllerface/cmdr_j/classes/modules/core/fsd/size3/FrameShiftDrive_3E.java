package com.controllerface.cmdr_j.classes.modules.core.fsd.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_3E extends AbstractFSD
{
    public FrameShiftDrive_3E()
    {
        super("3E Standard Frame Shift Drive", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.Integrity, 58.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.24),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 80.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 14.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 1.2)
            ));
    }
}