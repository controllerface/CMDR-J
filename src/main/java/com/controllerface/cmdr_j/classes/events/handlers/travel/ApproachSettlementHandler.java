package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processArrival;

public class ApproachSettlementHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        logTravelMessage(context, "Approaching Settlement: " + name);
        processArrival(context, "debug");
    }
}
