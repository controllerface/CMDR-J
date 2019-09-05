package com.controllerface.cmdr_j.classes.modules.experimental.optional.hrp.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.experimental.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_4D extends AbstractExperimentalModule
{
    public MetaAlloyHRP_4D()
    {
        super("4D Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 297d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
