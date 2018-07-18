package com.controllerface.cmdr_j.structures.journal.events;

import com.controllerface.cmdr_j.EventProcessingContext;

import static com.controllerface.cmdr_j.structures.journal.JournalEventTransactions.logGeneralMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class HeatWarningHandler extends JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Heat Level Critical");
    }
}
