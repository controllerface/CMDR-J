package com.controllerface.cmdr_j.classes.events.handlers.stats.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class UndockedHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("StationName"));
        logTravelMessage(context, "Leaving " + name);

        context.getCommanderData().setStation("Undocked");
        context.getCommanderData().setEconomy("No Market");
    }
}
