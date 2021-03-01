package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_3D extends AbstractHullPackage
{
    public HRP_3D()
    {
        super("Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 260d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1.5d)
                ));
    }

    @Override
    public long price()
    {
        return 84_000;
    }
}
