package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class CommanderHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        JournalEventTransactions.logGeneralMessage(context, "Commander Loaded: "
                + context.getRawData().get("Name"));
    }
}
