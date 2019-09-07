package com.controllerface.cmdr_j.classes.modules.weapons.plasmacharger;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class TurretedGuardianPlasmaCharger_Large extends AbstractGuardianModule
{
    public TurretedGuardianPlasmaCharger_Large()
    {
        super("Large Turreted Guardian Plasma Charger", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.guardian, 1.0),
                  new ItemEffectData(ItemEffect.DamageType, "Absolute"),
                  new ItemEffectData(ItemEffect.DamageFalloffRange, 1000.0)
            ));
    }
}