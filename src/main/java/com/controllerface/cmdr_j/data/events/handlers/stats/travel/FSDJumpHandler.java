package com.controllerface.cmdr_j.data.events.handlers.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.StarSystem;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import java.util.List;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.processArrival;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FSDJumpHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, "Arrived in the " + name + " System");
        List<Double> coordinates = ((List<Double>) context.getRawData().get("StarPos"));
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(1), coordinates.get(2));
        context.getCommanderData().setLocation(system);
        processArrival(context, "(Supercruise)");
    }
}
