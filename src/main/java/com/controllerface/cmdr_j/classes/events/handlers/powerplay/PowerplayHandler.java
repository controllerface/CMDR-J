package com.controllerface.cmdr_j.classes.events.handlers.powerplay;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplayHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        JournalEventTransactions.logGeneralMessage(context,
                "You've been pledged to " + context.getRawData().get("Power")
                        + " for: " + context.getRawData().get("TimePledged") + " seconds. "
                        + " rank: " + context.getRawData().get("Rank")
                        + " merits: " + context.getRawData().get("Merits")
                        + " votes: " + context.getRawData().get("Votes"));
    }
}
