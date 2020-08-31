package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.List;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processArrival;

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
        long address = ((Number) context.getRawData().get("SystemAddress")).longValue();
        logTravelMessage(context, "Arrived in the " + name + " System");
        List<Double> coordinates = ((List<Double>) context.getRawData().get("StarPos"));
        // todo: verify this data does come in X, Z, Y order as it appears to in game.
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(2), coordinates.get(1), address);
        context.getCommander().setLocation(system);
        processArrival(context, "(Supercruise)");
    }
}
