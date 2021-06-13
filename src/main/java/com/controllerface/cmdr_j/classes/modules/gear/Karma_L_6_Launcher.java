package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Karma_L_6_Launcher extends AbstractGear
{
    public Karma_L_6_Launcher()
    {
        super("Karma P-15",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 52.4d),
                    new ItemEffectData(ItemEffect.RateOfFire, 1.0d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 2d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 300d),
                    new ItemEffectData(ItemEffect.DamageType, "Explosive"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 175_000;
    }
}