package com.controllerface.cmdr_j.data.events.handlers.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.processArrival;

/**
 * Created by Stephen on 7/18/2018.
 */
public class SupercruiseExitHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String body = ((String) context.getRawData().get("Body"));
        String type = ((String) context.getRawData().get("BodyType"));
        logTravelMessage(context, system + " :: Exited Supercruise Near " + body);

        String arrival = "Station".equals(type) ? "Space Station" : body;

        processArrival(context, arrival);
    }
}
