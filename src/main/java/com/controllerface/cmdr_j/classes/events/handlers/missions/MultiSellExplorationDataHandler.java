package com.controllerface.cmdr_j.classes.events.handlers.missions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Written when contributing materials to a community goal
 *
 * Created by Stephen on 7/18/2018.
 */
public class MultiSellExplorationDataHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        int reward = ((int) context.getRawData().get("TotalEarnings"));
        context.getCommander().adjustCreditBalance(reward);
        logGeneralMessage(context, "Exploration data sold for " + reward + " CR");
    }
}
