package com.controllerface.cmdr_j.data.events.items.commodities;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustDown;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when selling limpet drones
 *
 * Created by Stephen on 7/18/2018.
 */
public class SellDronesHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Limpet Drones Sold");
        adjustDown(context, Commodity.DRONES, ((int) context.getRawData().get("Count")));
    }
}
