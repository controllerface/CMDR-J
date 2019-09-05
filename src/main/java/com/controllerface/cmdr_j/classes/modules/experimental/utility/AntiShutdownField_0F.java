package com.controllerface.cmdr_j.classes.modules.experimental.utility;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.experimental.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class AntiShutdownField_0F extends AbstractExperimentalModule
{
    public AntiShutdownField_0F()
    {
        super("Shutdown Field Neutraliser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 35d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.BootTime, 0d),
                        new ItemEffectData(ItemEffect.Range, 3000d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.25d),
                        new ItemEffectData(ItemEffect.ECMCooldown, 10d),
                        new ItemEffectData(ItemEffect.Mass, 1d)
                ));
    }
}
