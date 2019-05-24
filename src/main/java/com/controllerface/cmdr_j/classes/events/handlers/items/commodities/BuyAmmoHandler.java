package com.controllerface.cmdr_j.classes.events.handlers.items.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class BuyAmmoHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        Integer amount = ((Integer) context.getRawData().get("Cost"));
        logGeneralMessage(context, "Ammo Restock: Paid " + amount + " Cr");
    }
}
