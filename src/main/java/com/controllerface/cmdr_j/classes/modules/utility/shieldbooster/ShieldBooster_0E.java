package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ShieldBooster_0E extends AbstractShieldBooster
{
    public ShieldBooster_0E()
    {
        super("0E Shield Booster",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 0.5),
                        new ItemEffectData(ItemEffect.Integrity, 25.0),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2),
                        new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 4.0),
                        new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
                ));
    }

    @Override
    public long price()
    {
        return 10_000;
    }
}