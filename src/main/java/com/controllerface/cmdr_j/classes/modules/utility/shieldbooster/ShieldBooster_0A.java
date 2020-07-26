package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldBooster_0A extends AbstractShieldBooster
{
    public ShieldBooster_0A()
    {
        super("0A Shield Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "A"),
                        new ItemEffectData(ItemEffect.Mass, 3.5),
                        new ItemEffectData(ItemEffect.Integrity, 48.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.2),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 20.0),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 281_000;
    }
}