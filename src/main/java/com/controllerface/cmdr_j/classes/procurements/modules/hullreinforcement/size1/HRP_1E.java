package com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_1E extends AbstractHullPackage
{
    public HRP_1E()
    {
        super("1E Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 80d),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.5d)
                ));
    }
}
