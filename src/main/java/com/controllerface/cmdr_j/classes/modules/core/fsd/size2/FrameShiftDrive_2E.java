package com.controllerface.cmdr_j.classes.modules.core.fsd.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_2E extends AbstractFSD
{
    public FrameShiftDrive_2E()
    {
        super("2E Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2.5),
                        new ItemEffectData(ItemEffect.Integrity, 46.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.16),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 48.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 10.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 0.6)
                ));
    }

    @Override
    public long price()
    {
        return 1_980;
    }
}