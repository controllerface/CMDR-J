package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class ShipTargetedHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // todo: something with this data, probably just log it
    }
}
