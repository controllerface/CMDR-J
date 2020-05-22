package com.controllerface.cmdr_j.classes.events.handlers.modules;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.emptySlotFromData;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when a currently equipped module is stored, removing it from the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ModuleStoreHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Module Stored");
        emptySlotFromData(context);
    }
}
