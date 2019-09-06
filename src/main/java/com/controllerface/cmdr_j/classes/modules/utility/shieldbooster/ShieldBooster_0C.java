package com.controllerface.cmdr_j.classes.modules.utility.shieldbooster;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.classes.modules.utility.shieldbooster.AbstractShieldBooster;

public class ShieldBooster_0C extends AbstractShieldBooster
{
    public ShieldBooster_0C()
    {
        super("0C Shield Booster", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 2.0),
                  new ItemEffectData(ItemEffect.Integrity, 40.0),
                  new ItemEffectData(ItemEffect.PowerDraw, 0.7),
                  new ItemEffectData(ItemEffect.DefenceModifierShieldMultiplier, 12.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 0.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 0.0)
            ));
    }
}