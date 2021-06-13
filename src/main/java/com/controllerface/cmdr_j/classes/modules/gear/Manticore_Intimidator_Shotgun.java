package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Manticore_Intimidator_Shotgun extends AbstractGear
{
    public Manticore_Intimidator_Shotgun()
    {
        super("Manticore Intimidator",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 1.8d),
                    new ItemEffectData(ItemEffect.RateOfFire, 1.3d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 2d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1.5d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 7.0d),
                    new ItemEffectData(ItemEffect.DamageType, "Plasma"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Semi-Automatic")
                ));
    }

    @Override
    public long price()
    {
        return 100_000;
    }
}