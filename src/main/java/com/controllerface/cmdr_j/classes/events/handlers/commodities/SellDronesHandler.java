package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when selling limpet drones
 *
 * Created by Stephen on 7/18/2018.
 */
public class SellDronesHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Limpet Drones Sold");
        adjustDown(context, Commodity.DRONES, ((int) context.getRawData().get("Count")));

        int sale = ((int) context.getRawData().get("TotalSale"));
        context.getCommander().adjustCreditBalance(sale);
    }
}
