package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_2D extends AbstractHullPackage
{
    public HRP_2D()
    {
        super("Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 190d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1d)
                ));
    }

    @Override
    public long price()
    {
        return 36_000;
    }
}
