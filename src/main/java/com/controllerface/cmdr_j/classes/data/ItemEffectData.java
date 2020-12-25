package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.ui.UIFunctions;

/**
 * Created by Controllerface on 5/13/2018.
 */
public class ItemEffectData
{
    public final ItemEffect effect;
    public final Double doubleValue;
    public final String stringValue;

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
        this.stringValue = doubleValue == Double.MAX_VALUE
            ? UIFunctions.Symbols.INFINITY :
            null;
    }

    public double getDoubleValue()
    {
        return doubleValue == null
                ? 0.0
                : doubleValue;
    }

    public boolean isNumerical()
    {
        return doubleValue != null;
    }

    public String getValueString()
    {
        return stringValue == null
                ? String.valueOf(doubleValue)
                : stringValue;
    }
}
