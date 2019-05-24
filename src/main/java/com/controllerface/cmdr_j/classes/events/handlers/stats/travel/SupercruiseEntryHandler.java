package com.controllerface.cmdr_j.classes.events.handlers.stats.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processArrival;

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
        processArrival(context, "(Supercruise)");
    }
}
