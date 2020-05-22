package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class SquadronStartupHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        JournalEventTransactions.logGeneralMessage(context,
                "You are rank level: " + context.getRawData().get("CurrentRank")
                        + " in squadron: " + context.getRawData().get("SquadronName"));
    }
}
