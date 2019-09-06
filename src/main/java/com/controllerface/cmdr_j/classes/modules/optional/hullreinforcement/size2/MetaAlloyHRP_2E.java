package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size2;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_2E extends AbstractExperimentalModule
{
    public MetaAlloyHRP_2E()
    {
        super("2E Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 135d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
