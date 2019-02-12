package com.controllerface.cmdr_j.data.events.handlers.items.commodities;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logGeneralMessage;

public class BuyAmmoHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        Integer amount = ((Integer) context.getRawData().get("Cost"));
        logGeneralMessage(context, "Ammo Restock: Paid " + amount + " Cr");
    }
}
