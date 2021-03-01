package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size1;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_1E extends AbstractHullPackage
{
    public HRP_1E()
    {
        super("Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 1.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 80d),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.5d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.5d)
                ));
    }

    @Override
    public long price()
    {
        return 5_000;
    }
}
