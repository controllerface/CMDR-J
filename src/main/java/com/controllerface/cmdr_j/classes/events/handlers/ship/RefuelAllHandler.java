package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class RefuelAllHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        int cost = ((int) context.getRawData().get("Cost"));
        context.getCommanderData().adjustCreditBalance(-1 * cost);
        logGeneralMessage(context, "Refueled: " + context.getRawData().get("Amount") + " tons:"
                + " cost: " + cost + " Credits");

    }
}
