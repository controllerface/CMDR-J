package com.controllerface.cmdr_j.classes.modules.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_2E extends AbstractHullPackage
{
    public HRP_2E()
    {
        super("2E Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 150d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1d)
                ));
    }
}
