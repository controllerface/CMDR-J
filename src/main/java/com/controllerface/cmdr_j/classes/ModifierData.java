package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

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

    public ItemEffect getEffect() { return effect; }
    public double getValue() { return value; }
    double getOriginalValue() { return originalValue; }
    boolean isLessIsGood() { return lessIsGood; }
}
