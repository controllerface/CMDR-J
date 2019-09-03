package com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fsdinterdictor.AbstractFSDInterdictor;
import com.controllerface.cmdr_j.classes.procurements.modules.refinery.AbstractRefinery;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FSDInterdictor_1E extends AbstractFSDInterdictor
{
    public FSDInterdictor_1E()
    {
        super("1E Frame Shift Drive Interdictor",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 32d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.14d),
                        new ItemEffectData(ItemEffect.BootTime, 15d),
                        new ItemEffectData(ItemEffect.FSDInterdictorRange, 3d),
                        new ItemEffectData(ItemEffect.FSDInterdictorFacingLimit, 50d)
                ));
    }
}
