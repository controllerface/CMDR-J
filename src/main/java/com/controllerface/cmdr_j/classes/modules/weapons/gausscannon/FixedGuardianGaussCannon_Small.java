package com.controllerface.cmdr_j.classes.modules.weapons.gausscannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedGuardianGaussCannon_Small extends AbstractGuardianModule
{
    public FixedGuardianGaussCannon_Small()
    {
        super("Small Fixed Guardian Gauss Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.DamageType, "Thermal"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1500.0)
            ));
    }

    @Override
    public long price()
    {
        return 167_250;
    }
}