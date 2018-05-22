package com.controllerface.edeps.data;

import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.ui.UIFunctions;

/**
 * Created by Controllerface on 5/13/2018.
 */
public class ItemEffectData
{
    private final ItemEffect effect;
    private final Double doubleValue;
    private final String stringValue;

    public ItemEffectData(ItemEffect effect, String stringValue)
    {
        this.effect = effect;
        this.doubleValue = null;
        this.stringValue = stringValue;
    }

    public ItemEffectData(ItemEffect effect, double doubleValue)
    {
        this.effect = effect;
        this.doubleValue = doubleValue;
        this.stringValue = doubleValue == Double.MAX_VALUE ? UIFunctions.Symbols.INFINITY : null;
    }

    public ItemEffect getEffect()
    {
        return effect;
    }

    public boolean isNumerical()
    {
        return doubleValue != null;
    }

    public double getDoubleValue()
    {
        return doubleValue;
    }

    public String getStringValue()
    {
        return stringValue;
    }

    public String getValueString()
    {
        return stringValue == null ? String.valueOf(doubleValue) : stringValue;
    }
}
