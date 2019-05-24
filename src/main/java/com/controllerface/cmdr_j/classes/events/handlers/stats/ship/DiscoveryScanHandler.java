package com.controllerface.cmdr_j.classes.events.handlers.stats.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logExplorationMessage;

/**
 * Discovery Scan event: 
 *
 * Created by Stephen on 7/18/2018.
 */
public class DiscoveryScanHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        int bodies = ((int) context.getRawData().get("Bodies"));
        logExplorationMessage(context, "Discovery Scanner found " + bodies + (bodies > 1 ? " bodies" : " body"));
    }
}
