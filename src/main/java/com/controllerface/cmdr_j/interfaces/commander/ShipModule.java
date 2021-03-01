package com.controllerface.cmdr_j.interfaces.commander;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

/**
 * Defines an individual modules, installable in an internal ship compartment. Example include weapons, shields,
 * hyper-drives, armor, and any other installable modules.
 *
 * Created by Controllerface on 4/25/2018.
 */
public interface ShipModule extends TaskCost
{
    String displayText();
    TaskType experimentalType();
    TaskType modificationType();
    ItemEffects itemEffects();
    long price();
}
