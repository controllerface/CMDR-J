package com.controllerface.cmdr_j.classes.modules.weapons.shardcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedGuardianShardCannon_Large extends AbstractGuardianModule
{
    public TurretedGuardianShardCannon_Large()
    {
        super("Large Turreted Guardian Shard Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1700.0)
            ));
    }
}