package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_5E extends AbstractExperimentalModule
{
    public MetaAlloyHRP_5E()
    {
        super("5E Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 324d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 225_001;
    }
}
