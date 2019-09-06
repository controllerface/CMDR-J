package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class LightweightArmour extends AbstractBulkheads
{
    public LightweightArmour()
    {
        super("Lightweight Armour", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 0.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, -40.0),
                  new ItemEffectData(ItemEffect.KineticResistance, -20.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 80.0)
            ));
    }
}