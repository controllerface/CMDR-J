package com.controllerface.cmdr_j.data.events.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.StarSystem;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import java.util.List;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class LocationHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("StarSystem"));
        logTravelMessage(context, "Spawned in the " + name + " System");
        List<Double> coordinates = ((List<Double>) context.getRawData().get("StarPos"));
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(1), coordinates.get(2));
        context.getCommanderData().setLocation(system);
    }
}
