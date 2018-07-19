package com.controllerface.cmdr_j.data.events.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

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
        logTravelMessage(context, system + " :: Exited Supercruise Near " + body);
    }
}
