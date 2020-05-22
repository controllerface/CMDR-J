package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class HeatWarningHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Heat Level Critical");
    }
}
