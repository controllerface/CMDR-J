package com.controllerface.cmdr_j.classes.procurements.modules.limpets.research.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.limpets.repair.AbstractRepairLimpet;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class ResearchLimpet_1E extends AbstractRepairLimpet
{
    public ResearchLimpet_1E()
    {
        super("1E Research Limpet Controller",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 20d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.4d),
                        new ItemEffectData(ItemEffect.BootTime, 0d),
                        new ItemEffectData(ItemEffect.MaxActiveDrones, 1d),
                        new ItemEffectData(ItemEffect.DroneTargetRange, 2000d),
                        new ItemEffectData(ItemEffect.DroneLifeTime, 300d),
                        new ItemEffectData(ItemEffect.DroneSpeed, 200d)
                ));
    }
}
