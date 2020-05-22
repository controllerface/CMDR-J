package com.controllerface.cmdr_j.classes.events.handlers.modules;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processRetrieveModule;

/**
 * Written when retrieving a module from storage, equipping it to the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class StoredModulesHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // todo: handle this, need new panel to display these
    }
}
