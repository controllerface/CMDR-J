package com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FSDInterdictor_2A extends AbstractFSDInterdictor
{
    public FSDInterdictor_2A()
    {
        super("2A Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2.5d),
                        new ItemEffectData(ItemEffect.Integrity, 61d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 10d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }
}
