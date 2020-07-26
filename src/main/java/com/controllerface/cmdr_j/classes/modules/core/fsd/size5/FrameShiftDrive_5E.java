package com.controllerface.cmdr_j.classes.modules.core.fsd.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_5E extends AbstractFSD
{
    public FrameShiftDrive_5E()
    {
        super("5E Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 20.0),
                        new ItemEffectData(ItemEffect.Integrity, 86.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.32),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 560.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 27.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 3.3)
                ));
    }

    @Override
    public long price()
    {
        return 63_010;
    }
}