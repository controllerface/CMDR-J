package com.controllerface.cmdr_j.data.events.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

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
