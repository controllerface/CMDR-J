package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class DockingDeniedHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logTravelMessage(context, "Docking Request Denied: " + context.getRawData().get("StationName")
                + ", reason: " + context.getRawData().get("Reason"));
    }
}
