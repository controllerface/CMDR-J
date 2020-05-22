package com.controllerface.cmdr_j.classes.events.handlers.powerplay;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityTypeDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when delivering powerplay specific cargo items
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplayDeliverHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "PowerPlay Item Delivered");
        adjustCommodityTypeDown(context, context.getRawData());
    }
}
