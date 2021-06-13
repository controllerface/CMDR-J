package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Karma_P_15_Pistol extends AbstractGear
{
    public Karma_P_15_Pistol()
    {
        super("Karma P-15",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, 0d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 24d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 2.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 25d),
                    new ItemEffectData(ItemEffect.DamageType, "Kinetic"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Semi-Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 75_000;
    }
}