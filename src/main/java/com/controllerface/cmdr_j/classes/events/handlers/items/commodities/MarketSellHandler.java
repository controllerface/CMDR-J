package com.controllerface.cmdr_j.classes.events.handlers.items.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityTypeDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

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
