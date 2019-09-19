package com.controllerface.cmdr_j.classes.events.handlers.items.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityTypeDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when ejecting commodities from cargo
 *
 * Created by Stephen on 7/18/2018.
 */
public class EjectCargoHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Cargo Ejected");
        adjustCommodityTypeDown(context, context.getRawData());
    }
}
