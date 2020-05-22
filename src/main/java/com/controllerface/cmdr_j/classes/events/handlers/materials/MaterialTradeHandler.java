package com.controllerface.cmdr_j.classes.events.handlers.materials;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

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
