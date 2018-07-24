package com.controllerface.cmdr_j.data.events.handlers.items.powerplay;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustCommodityType;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when collecting powerplay specific cargo items
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplayCollectHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "PowerPlay Item Collected");
        adjustCommodityType(context, context.getRawData());
    }
}
