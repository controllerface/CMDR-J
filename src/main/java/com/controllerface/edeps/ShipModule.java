package com.controllerface.edeps;

import com.controllerface.edeps.data.ItemEffects;

/**
 * Created by Stephen on 4/25/2018.
 */
public interface ShipModule
{
    String displayText();
    ProcurementType experimentalType();
    ProcurementType modificationType();
    ItemEffects itemEffects();
}
