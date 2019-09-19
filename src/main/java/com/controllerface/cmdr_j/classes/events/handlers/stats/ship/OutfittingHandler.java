package com.controllerface.cmdr_j.classes.events.handlers.stats.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logLoadoutMessage;

/**
 * Outfitting event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class OutfittingHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String station = ((String) context.getRawData().get("StationName"));
        logLoadoutMessage(context, "Accessing outfitting at " + station + " [" + system + "]");
    }
}
