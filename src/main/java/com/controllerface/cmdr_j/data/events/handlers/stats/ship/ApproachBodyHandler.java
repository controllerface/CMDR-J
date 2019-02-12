package com.controllerface.cmdr_j.data.events.handlers.stats.ship;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

public class ApproachBodyHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String body = ((String) context.getRawData().get("Body"));
        logTravelMessage(context, "Approaching " + body + " in " + system);
    }
}
