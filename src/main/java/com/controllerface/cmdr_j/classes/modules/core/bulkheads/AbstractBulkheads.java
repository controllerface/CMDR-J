package com.controllerface.cmdr_j.classes.modules.core.bulkheads;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractBulkheads extends AbstractModule
{
    public AbstractBulkheads(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Bulkheads, ExperimentalType.Bulkheads, itemEffects);
    }
}
