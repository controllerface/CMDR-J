package com.controllerface.cmdr_j.classes.events.handlers.items.modules;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processBuyModule;

/**
 * Written when buying a new module, equipping it to the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ModuleBuyHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Module Purchased");
        processBuyModule(context);

        int cost = ((int) context.getRawData().get("BuyPrice"));
        context.getCommanderData().adjustCreditBalance(-1 * cost);

        int sale = ((int) context.getRawData().get("SellPrice"));
        context.getCommanderData().adjustCreditBalance(sale);
    }
}
