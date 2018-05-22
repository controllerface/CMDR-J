package com.controllerface.edeps.data;

import com.controllerface.edeps.structures.equipment.ItemEffect;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ModifierData
{
    private final ItemEffect effect;
    private final double value;
    private final double originalValue;
    private final boolean lessIsGood;


    public ModifierData(ItemEffect effect, double value, double originalValue, boolean lessIsGood)
    {
        this.effect = effect;
        this.value = value;
        this.originalValue = originalValue;
        this.lessIsGood = lessIsGood;
    }

    public ItemEffect getEffect()
    {
        return effect;
    }

    public double getValue()
    {
        return value;
    }

    public double getOriginalValue()
    {
        return originalValue;
    }

    public boolean isLessIsGood()
    {
        return lessIsGood;
    }
}
