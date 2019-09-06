package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_2D extends AbstractHullPackage
{
    public HRP_2D()
    {
        super("2D Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 190d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1d)
                ));
    }
}
