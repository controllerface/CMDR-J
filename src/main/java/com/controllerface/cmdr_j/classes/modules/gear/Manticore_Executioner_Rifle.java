package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Manticore_Executioner_Rifle extends AbstractGear
{
    public Manticore_Executioner_Rifle()
    {
        super("Manticore Executioner",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 0d),
                    new ItemEffectData(ItemEffect.RateOfFire, 0d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 3d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 3.0d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 100.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Plasma"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Semi-Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 175_000;
    }
}