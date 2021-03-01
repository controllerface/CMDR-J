package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldBooster_0C extends AbstractShieldBooster
{
    public ShieldBooster_0C()
    {
        super("0C Shield Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "C"),
                        new ItemEffectData(ItemEffect.Mass, 2.0),
                        new ItemEffectData(ItemEffect.Integrity, 40.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.7),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 12.0),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 53_000;
    }
}