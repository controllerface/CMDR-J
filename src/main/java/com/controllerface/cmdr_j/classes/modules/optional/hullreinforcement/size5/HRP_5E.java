package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_5E extends AbstractHullPackage
{
    public HRP_5E()
    {
        super("Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 360d),
                        new ItemEffectData(ItemEffect.KineticResistance, 2.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 2.5d)
                ));
    }

    @Override
    public long price()
    {
        return 150_000;
    }
}
