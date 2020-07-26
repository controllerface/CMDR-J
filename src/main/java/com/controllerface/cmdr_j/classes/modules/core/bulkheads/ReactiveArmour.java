package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ReactiveArmour extends AbstractBulkheads
{
    private final long price;

    public ReactiveArmour(String ship, long price)
    {
        super(ship + " Reactive Armour",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 35.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 20.0),
                        new ItemEffectData(ItemEffect.KineticResistance, 25.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, -40.0),
                        new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, 250.0)
                ));
        this.price = price;
    }

    @Override
    public long price()
    {
        return price;
    }
}