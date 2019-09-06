package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MetaAlloyHRP_3E extends AbstractExperimentalModule
{
    public MetaAlloyHRP_3E()
    {
        super("3E Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1d),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 207d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }
}
