package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class ModifiedStat
{
    public final ItemEffect effect;
    public final double value;
    public final double originalValue;
    public final boolean lessIsGood;
    public final String stringValue;

    public ModifiedStat(ItemEffect effect, double value, double originalValue, boolean lessIsGood)
    {
        this.effect = effect;
        this.value = value;
        this.originalValue = originalValue;
        this.lessIsGood = lessIsGood;
        this.stringValue = "";
    }

    public ModifiedStat(ItemEffect effect, String stringValue)
    {
        this.effect = effect;
        this.value = 1;
        this.originalValue = 0;
        this.lessIsGood = false;
        this.stringValue = stringValue;
    }

    public ModifiedStat(ItemEffect effect, Double value)
    {
        this.effect = effect;
        this.value = value;
        this.originalValue = 0;
        this.lessIsGood = false;
        this.stringValue = "";
    }
}
