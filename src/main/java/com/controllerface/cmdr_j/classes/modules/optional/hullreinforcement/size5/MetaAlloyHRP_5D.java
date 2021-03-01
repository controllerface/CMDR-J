package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size5;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_5D extends AbstractHumanModule
{
    public MetaAlloyHRP_5D()
    {
        super("Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 5.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 351d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 675_001;
    }
}
