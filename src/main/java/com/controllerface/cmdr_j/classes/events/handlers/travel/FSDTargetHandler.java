package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FSDTargetHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        String message = "FSD Route Target: " + name;
        if (context.getRawData().get("RemainingJumpsInRoute") != null)
        {
            int remainingJumps = ((int) context.getRawData().get("RemainingJumpsInRoute"));
            String jumpQty = remainingJumps == 1 ? "jump" : "jumps";
            message = "Next FSD Jump Target: " + name + "; " + remainingJumps + " " + jumpQty + " remaining";
        }

        logTravelMessage(context, message);
    }
}
