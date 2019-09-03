package com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_1D extends AbstractHullPackage
{
    public HRP_1D()
    {
        super("1D Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 110d),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.5d)
                ));
    }
}
