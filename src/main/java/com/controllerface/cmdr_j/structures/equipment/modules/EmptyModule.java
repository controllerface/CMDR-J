package com.controllerface.cmdr_j.structures.equipment.modules;

import com.controllerface.cmdr_j.ProcurementType;
import com.controllerface.cmdr_j.ShipModule;
import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;

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
