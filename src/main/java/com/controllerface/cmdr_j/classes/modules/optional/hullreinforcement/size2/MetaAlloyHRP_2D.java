package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_2D extends AbstractExperimentalModule
{
    public MetaAlloyHRP_2D()
    {
        super("2D Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 171d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
