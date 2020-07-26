package com.controllerface.cmdr_j.classes.modules.core.fsd.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_7C extends AbstractFSD
{
    public FrameShiftDrive_7C()
    {
        super("7C Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 80.0),
                        new ItemEffectData(ItemEffect.Integrity, 131.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.6),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 1800.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 43.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 8.5)
                ));
    }

    @Override
    public long price()
    {
        return 5_698_790;
    }
}