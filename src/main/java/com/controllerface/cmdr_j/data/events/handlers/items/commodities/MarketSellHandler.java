package com.controllerface.cmdr_j.data.events.handlers.items.commodities;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustCommodityTypeDown;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when celling commodities to a market
 *
 * Created by Stephen on 7/18/2018.
 */
public class MarketSellHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Commodity Sold");
        adjustCommodityTypeDown(context, context.getRawData());
    }
}
