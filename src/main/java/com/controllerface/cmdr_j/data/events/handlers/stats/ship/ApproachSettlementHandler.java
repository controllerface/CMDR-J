package com.controllerface.cmdr_j.data.events.handlers.stats.ship;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

public class ApproachSettlementHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        logTravelMessage(context, "Approaching Settlement: " + name);
    }
}
