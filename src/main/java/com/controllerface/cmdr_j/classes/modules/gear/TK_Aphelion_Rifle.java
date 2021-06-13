package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TK_Aphelion_Rifle extends AbstractGear
{
    public TK_Aphelion_Rifle()
    {
        super("TK Aphelion",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 1.6d),
                    new ItemEffectData(ItemEffect.RateOfFire, 5.7d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 25d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 70.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 125_000;
    }
}