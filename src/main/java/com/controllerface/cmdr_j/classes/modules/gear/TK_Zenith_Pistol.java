package com.controllerface.cmdr_j.classes.modules.gear;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.weapons.beam.AbstractBeamLaser;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.utilities.UIFunctions;

public class TK_Zenith_Pistol extends AbstractGear
{
    public TK_Zenith_Pistol()
    {
        super("TK Zenith",
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Damage, 1.7d),
                    new ItemEffectData(ItemEffect.RateOfFire, 5.7d),
                    new ItemEffectData(ItemEffect.AmmoClipSize, 18d),
                    new ItemEffectData(ItemEffect.Weapon_Headshot_Damage, 1d),
                    new ItemEffectData(ItemEffect.Weapon_Effective_Range, 35d),
                    new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                    new ItemEffectData(ItemEffect.Weapon_Fire_Mode, "Burst")
                ));
    }

    @Override
    public long price()
    {
        return 50_000;
    }
}