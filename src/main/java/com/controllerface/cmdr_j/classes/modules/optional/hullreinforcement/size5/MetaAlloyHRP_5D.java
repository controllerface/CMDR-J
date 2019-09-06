package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_5D extends AbstractExperimentalModule
{
    public MetaAlloyHRP_5D()
    {
        super("5D Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 351d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
