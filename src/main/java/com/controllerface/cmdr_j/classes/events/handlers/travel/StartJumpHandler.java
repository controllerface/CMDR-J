package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processArrival;

/**
 * Created by Stephen on 7/18/2018.
 */
public class StartJumpHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String jumpType = ((String) context.getRawData().get("JumpType"));

        logTravelMessage(context, jumpType + " Jump Initiated");

        String system = ((String) context.getRawData().get("StarSystem"));
        if (system !=null)
        {
            String currentSystem = context.getCommander().location.getStarSystem().systemName;
            logTravelMessage(context, "Leaving the " + currentSystem + " System; Jumping to " + system);
        }

        processArrival(context, "(" + jumpType + ")");
    }
}
