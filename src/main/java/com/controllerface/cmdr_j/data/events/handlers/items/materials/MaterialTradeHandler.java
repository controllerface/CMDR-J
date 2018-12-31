package com.controllerface.cmdr_j.data.events.handlers.items.materials;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Written when using a material trader to trade one type of material for another
 *
 * Created by Stephen on 7/18/2018.
 */
public class MaterialTradeHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Material Trade Completed");

        Map<String, Object> paid = ((Map<String, Object>) context.getRawData().get("Paid"));
        Map<String, Object> received = ((Map<String, Object>) context.getRawData().get("Received"));

        adjustMaterialQuantity(context, received);
        adjustMaterialQuantityDown(context, paid);
        processMaterialTrade(context);
    }
}
