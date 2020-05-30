package com.controllerface.cmdr_j.classes.modules.utility.shutdownneutralizer;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class AntiShutdownField_0F extends AbstractExperimentalModule
{
    public AntiShutdownField_0F()
    {
        super("Shutdown Field Neutraliser",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 35d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.Disruption_Barrier_Charge_Duration, 1d),
                        new ItemEffectData(ItemEffect.Disruption_Barrier_Range, 3000d),
                        new ItemEffectData(ItemEffect.Disruption_Barrier_Active_Power, 0.25d),
                        new ItemEffectData(ItemEffect.Disruption_Barrier_Cooldown, 10d)
                ));
    }

    @Override
    public long price()
    {
        return 61_425;
    }
}
