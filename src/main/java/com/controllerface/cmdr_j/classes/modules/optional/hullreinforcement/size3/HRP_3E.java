package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size3;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_3E extends AbstractHullPackage
{
    public HRP_3E()
    {
        super("Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 3.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 230d),
                        new ItemEffectData(ItemEffect.KineticResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 1.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 1.5d)
                ));
    }

    @Override
    public long price()
    {
        return 28_000;
    }
}
