package com.controllerface.cmdr_j.classes.events.handlers.items.missions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Written when contributing materials to a community goal
 *
 * Created by Stephen on 7/18/2018.
 */
public class SearchAndRescueHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        int reward = ((int) context.getRawData().get("Reward"));
        context.getCommanderData().adjustCreditBalance(reward);
        logGeneralMessage(context, "Search and rescue reward: " + reward + " CR for " + name);
    }
}
