package com.controllerface.cmdr_j.classes.modules.hullreinforcement;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractHullPackage extends AbstractModule
{
    public AbstractHullPackage(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package, itemEffects);
    }
}
