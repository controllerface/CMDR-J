package com.controllerface.cmdr_j.data.events.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class StartJumpHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String jumpType = ((String) context.getRawData().get("JumpType"));

        logTravelMessage(context, jumpType + " Jump Initiated");

        String system = ((String) context.getRawData().get("StarSystem"));
        if (system !=null)
        {
            String currentSystem = context.getCommanderData().getLocation().getStarSystem().getSystemName();
            logTravelMessage(context, "Leaving the " + currentSystem + " System; Jumping to " + system);
        }
    }
}
