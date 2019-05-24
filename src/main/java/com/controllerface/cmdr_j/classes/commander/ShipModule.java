package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;

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
