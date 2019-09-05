package com.controllerface.cmdr_j.classes.modules.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_5D extends AbstractHullPackage
{
    public HRP_5D()
    {
        super("5D Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 390d),
                        new ItemEffectData(ItemEffect.KineticResistance, 2.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 2.5d)
                ));
    }
}
