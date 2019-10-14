package com.controllerface.cmdr_j.classes.modules.core.fsd.size8;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_8D extends AbstractFSD
{
    public FrameShiftDrive_8D()
    {
        // todo: if this ever becomes available in game, add stats
        super("8D Standard Frame Shift Drive",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 0.0),
                  new ItemEffectData(ItemEffect.Integrity, 0.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.0),
                  new ItemEffectData(ItemEffect.BootTime, 0.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 0.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 0.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 0.0)
            ));
    }
}