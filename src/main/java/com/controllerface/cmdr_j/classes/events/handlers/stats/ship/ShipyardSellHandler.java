package com.controllerface.cmdr_j.classes.events.handlers.stats.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class ShipyardSellHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String shipType = ((String) context.getRawData().get("ShipType"));

        int sale = ((int) context.getRawData().get("ShipPrice"));
        context.getCommanderData().adjustCreditBalance(sale);

        logGeneralMessage(context, "Sold ship " + shipType);
    }
}
