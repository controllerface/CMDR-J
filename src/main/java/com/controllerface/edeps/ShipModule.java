package com.controllerface.edeps;

import com.controllerface.edeps.data.ItemEffects;

/**
 * Defines an individual modules, installable in an internal ship compartment. Example include weapons, shields,
 * hyper-drives, armor, and any other installable modules.
 *
 * Created by Controllerface on 4/25/2018.
 */
public interface ShipModule
{
    String displayText();
    ProcurementType experimentalType();
    ProcurementType modificationType();
    ItemEffects itemEffects();
}
