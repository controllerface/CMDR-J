package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Manticore_Oppressor_Rifle extends AbstractGear
{
    public Manticore_Oppressor_Rifle()
    {
        super("Manticore Oppressor",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0.8d),
                    new ItemEffectData(ItemEffect.RateOfFire, 6.7d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 50d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1.5d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 35.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Plasma"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 125_000;
    }
}