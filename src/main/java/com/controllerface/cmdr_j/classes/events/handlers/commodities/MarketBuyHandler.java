package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityType;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when buying commodities from a market
 *
 * Created by Stephen on 7/18/2018.
 */
public class MarketBuyHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Commodity Purchased");
        adjustCommodityType(context, context.getRawData());

        int cost = ((int) context.getRawData().get("TotalCost"));
        context.getCommanderData().adjustCreditBalance(-1 * cost);
    }
}
