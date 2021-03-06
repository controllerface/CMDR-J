package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TK_Eclipse_Carbine extends AbstractGear
{
    public TK_Eclipse_Carbine()
    {
        super("TK Eclipse",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0.9d),
                    new ItemEffectData(ItemEffect.RateOfFire, 10.0d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 40d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 25.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 75_000;
    }
}