package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class HRP_4D extends AbstractHullPackage
{
    public HRP_4D()
    {
        super("4D Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 330d),
                        new ItemEffectData(ItemEffect.KineticResistance, 2d),
                        new ItemEffectData(ItemEffect.ThermicResistance, 2d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 2d)
                ));
    }

    @Override
    public long price()
    {
        return 195_000;
    }
}
