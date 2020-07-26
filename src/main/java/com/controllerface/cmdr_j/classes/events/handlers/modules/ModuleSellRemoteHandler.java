package com.controllerface.cmdr_j.classes.events.handlers.modules;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when a currently equipped module is sold, removing it from the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ModuleSellRemoteHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Module Sold: " + context.getRawData().get("SellItem_Localised"));
        int sale = ((int) context.getRawData().get("SellPrice"));
        context.getCommander().adjustCreditBalance(sale);
    }
}
