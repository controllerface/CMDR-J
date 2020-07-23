package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskType;
import com.controllerface.cmdr_j.ui.Icon;

import java.util.List;

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
    List<Icon> icons();
    long price();
}
