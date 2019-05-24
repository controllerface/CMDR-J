package com.controllerface.cmdr_j.classes.events.handlers.stats.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class ShieldStateHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        boolean restored = ((boolean) context.getRawData().get("ShieldsUp"));
        String message = "Shields " + (restored ? "Restored" : "Disabled");
        logGeneralMessage(context, message);
    }
}
