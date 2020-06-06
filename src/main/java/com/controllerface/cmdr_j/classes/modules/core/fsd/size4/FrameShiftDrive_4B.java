package com.controllerface.cmdr_j.classes.modules.core.fsd.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_4B extends AbstractFSD
{
    public FrameShiftDrive_4B()
    {
        super("4B Frame Shift Drive",
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 16.0),
                  new ItemEffectData(ItemEffect.Integrity, 120.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.38),
                  new ItemEffectData(ItemEffect.BootTime, 10.0),
                  new ItemEffectData(ItemEffect.FSDOptimalMass, 438.0),
                  new ItemEffectData(ItemEffect.ThermalLoad, 18.0),
                  new ItemEffectData(ItemEffect.MaxFuelPerJump, 2.5)
            ));
    }

    @Override
    public long price()
    {
        return 536_690;
    }
}