package com.controllerface.cmdr_j.data.events.handlers.items.modules;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.processBuyModule;

/**
 * Written when buying a new module, equipping it to the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ModuleBuyHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Module Purchased");
        processBuyModule(context);
    }
}
