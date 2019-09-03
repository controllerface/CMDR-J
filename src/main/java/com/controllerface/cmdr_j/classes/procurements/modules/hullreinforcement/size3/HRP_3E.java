package com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class HRP_3E extends AbstractHullPackage
{
    public HRP_3E()
    {
        super("3E Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 230d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1.5d)
                ));
    }
}
