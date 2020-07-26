package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ModifierData
{
    public final ItemEffect effect;
    public final double value;
    public final double originalValue;
    public final boolean lessIsGood;

    public ModifierData(ItemEffect effect, double value, double originalValue, boolean lessIsGood)
    {
        this.effect = effect;
        this.value = value;
        this.originalValue = originalValue;
        this.lessIsGood = lessIsGood;
    }
}
