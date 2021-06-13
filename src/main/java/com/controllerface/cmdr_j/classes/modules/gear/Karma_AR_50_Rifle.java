package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Karma_AR_50_Rifle extends AbstractGear
{
    public Karma_AR_50_Rifle()
    {
        super("Karma AR-50",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, 0d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 40d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 2.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 50d),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 75_000;
    }
}