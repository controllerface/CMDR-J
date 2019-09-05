package com.controllerface.cmdr_j.classes.modules.experimental.optional.hrp.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.experimental.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_3D extends AbstractExperimentalModule
{
    public MetaAlloyHRP_3D()
    {
        super("3D Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 234d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
