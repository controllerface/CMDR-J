package com.controllerface.cmdr_j.classes.events.handlers.exploration;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FSSAllBodiesFoundHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("SystemName"));
        Integer bodyCount = ((Integer) context.getRawData().get("Count"));

        JournalEventTransactions.logExplorationMessage(context, "All stellar bodies identified in " + name);
        JournalEventTransactions.logExplorationMessage(context, " -  bodies identified: " + bodyCount);
    }
}
