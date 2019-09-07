package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReactiveArmour extends AbstractBulkheads
{
    public ReactiveArmour()
    {
        super("Reactive Armour", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.Mass, 5.0),
                  new ItemEffectData(ItemEffect.ExplosiveResistance, 20.0),
                  new ItemEffectData(ItemEffect.KineticResistance, 25.0),
                  new ItemEffectData(ItemEffect.ThermicResistance, -40.0),
                  new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 250.0)
            ));
    }
}