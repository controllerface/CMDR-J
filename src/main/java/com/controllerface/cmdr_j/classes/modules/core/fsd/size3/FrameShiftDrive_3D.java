package com.controllerface.cmdr_j.classes.modules.core.fsd.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FrameShiftDrive_3D extends AbstractFSD
{
    public FrameShiftDrive_3D()
    {
        super("3D Frame Shift Drive",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 51.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.27),
                        new ItemEffectData(ItemEffect.BootTime, 10.0),
                        new ItemEffectData(ItemEffect.FSDOptimalMass, 90.0),
                        new ItemEffectData(ItemEffect.ThermalLoad, 14.0),
                        new ItemEffectData(ItemEffect.MaxFuelPerJump, 1.2)
                ));
    }

    @Override
    public long price()
    {
        return 18_810;
    }
}