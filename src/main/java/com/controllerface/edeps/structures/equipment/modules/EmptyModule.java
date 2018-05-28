package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.ItemEffects;
import com.controllerface.edeps.structures.equipment.ItemEffect;

/**
 * Created by Stephen on 5/27/2018.
 */
public enum EmptyModule implements ShipModule
{
    EMPTY_MODULE;

    private final ItemEffects emptyEffects = new ItemEffects(new ItemEffectData(ItemEffect.empty,"-"));

    @Override
    public String displayText()
    {
        return "Empty";
    }

    @Override
    public ProcurementType modificationType()
    {
        return null;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return null;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return emptyEffects;
    }
}
