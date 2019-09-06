package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.utility.shieldbooster.AbstractShieldBooster;

public class ShieldBooster_0B extends AbstractShieldBooster
{
    public ShieldBooster_0B()
    {
        super("0B Shield Booster", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 3.0),
                  new ItemEffectData(ItemEffect.Integrity, 45.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 1.0),
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 16.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
            ));
    }
}