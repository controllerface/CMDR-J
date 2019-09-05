package com.controllerface.cmdr_j.classes.modules.experimental.optional.hrp.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.experimental.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_1E extends AbstractExperimentalModule
{
    public MetaAlloyHRP_1E()
    {
        super("1E Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 72d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
