package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Karma_C_44_Carbine extends AbstractGear
{
    public Karma_C_44_Carbine()
    {
        super("Karma C-44",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0.6d),
                    new ItemEffectData(ItemEffect.RateOfFire, 13.3d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 60d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 2.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 25d),
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