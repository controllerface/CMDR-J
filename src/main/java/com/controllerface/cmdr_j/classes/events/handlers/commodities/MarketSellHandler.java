package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.text.NumberFormat;
import java.util.Locale;

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
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Commodity Sold");
        adjustCommodityTypeDown(context, context.getRawData());

        int sale = ((int) context.getRawData().get("TotalSale"));
        context.getCommander().adjustCreditBalance(sale);
        String formattedSale = NumberFormat.getNumberInstance(Locale.getDefault()).format(sale);
        logInventoryMessage(context, "+" + formattedSale + " Credits");
    }
}
