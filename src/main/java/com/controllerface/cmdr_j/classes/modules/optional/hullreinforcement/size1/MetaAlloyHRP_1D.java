package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_1D extends AbstractExperimentalModule
{
    public MetaAlloyHRP_1D()
    {
        super("1D Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 99d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
