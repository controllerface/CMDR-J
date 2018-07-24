package com.controllerface.cmdr_j.data.events.handlers.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class SupercruiseEntryHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, system + " :: Entered Supercruise");
    }
}
