package com.controllerface.cmdr_j.data.events.handlers.stats.status;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logGeneralMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class HeatWarningHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Heat Level Critical");
    }
}
