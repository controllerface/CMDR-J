package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.ProcurementCost;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.List;

/**
 * Defines an individual modules, installable in an internal ship compartment. Example include weapons, shields,
 * hyper-drives, armor, and any other installable modules.
 *
 * Created by Controllerface on 4/25/2018.
 */
public interface ShipModule extends ProcurementCost
{
    String displayText();
    ProcurementType experimentalType();
    ProcurementType modificationType();
    ItemEffects itemEffects();
    List<Icon> icons();
}
