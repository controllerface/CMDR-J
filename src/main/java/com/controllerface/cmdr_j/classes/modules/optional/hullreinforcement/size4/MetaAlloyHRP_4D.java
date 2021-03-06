package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement.size4;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractHumanModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MetaAlloyHRP_4D extends AbstractHumanModule
{
    public MetaAlloyHRP_4D()
    {
        super("Meta-Alloy Hull Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.human, 1d),
                        new ItemEffectData(ItemEffect.Size, 4.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 297d),
                        new ItemEffectData(ItemEffect.CausticResistance, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 292_501;
    }
}
