package com.controllerface.cmdr_j.data.events.items.commodities;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustCommodityType;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when buying commodities from a market
 *
 * Created by Stephen on 7/18/2018.
 */
public class MarketBuyHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Commodity Purchased");
        adjustCommodityType(context, context.getRawData());
    }
}
