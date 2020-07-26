package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MilitaryGradeArmour extends AbstractBulkheads
{
    private final long price;

    public MilitaryGradeArmour(String ship, long price)
    {
        super(ship + " Military Grade Armour",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 35.0),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, -40.0),
                        new ItemEffectData(ItemEffect.KineticResistance, -20.0),
                        new ItemEffectData(ItemEffect.ThermicResistance, 0.0),
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