package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Manticore_Tormentor_Pistol extends AbstractGear
{
    public Manticore_Tormentor_Pistol()
    {
        super("Manticore Tormentor",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 7.5d),
                    new ItemEffectData(ItemEffect.RateOfFire, 1.7d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 6d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 2.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 15.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Plasma"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Semi-Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 50_000;
    }
}