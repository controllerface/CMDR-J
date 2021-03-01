package com.controllerface.cmdr_j.classes.modules.optional.hullreinforcement;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractHullPackage extends AbstractModule
{
    public AbstractHullPackage(String displayText, ItemEffects itemEffects)
    {
        super("Hull Reinforcement Package", ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package, itemEffects);
    }
}
