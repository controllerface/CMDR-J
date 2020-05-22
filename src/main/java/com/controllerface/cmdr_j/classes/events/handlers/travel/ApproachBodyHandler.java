package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

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
