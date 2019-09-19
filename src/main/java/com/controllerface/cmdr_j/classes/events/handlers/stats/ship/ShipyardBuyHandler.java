package com.controllerface.cmdr_j.classes.events.handlers.stats.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

public class ShipyardBuyHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String shipType = ((String) context.getRawData().get("ShipType"));

        int price = ((int) context.getRawData().get("ShipPrice"));
        context.getCommanderData().adjustCreditBalance(-1 * price);

        if (context.getRawData().get("SellPrice") != null)
        {
            int sale = ((int) context.getRawData().get("SellPrice"));
            context.getCommanderData().adjustCreditBalance(sale);
        }

        logGeneralMessage(context, "Purchased ship " + shipType);
    }
}
