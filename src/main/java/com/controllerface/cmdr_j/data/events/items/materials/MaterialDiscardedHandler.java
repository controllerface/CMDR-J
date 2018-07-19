package com.controllerface.cmdr_j.data.events.items.materials;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustMaterialCountDown;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when materials are discarded
 *
 * Created by Stephen on 7/18/2018.
 */
public class MaterialDiscardedHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Material Discarded");
        adjustMaterialCountDown(context, context.getRawData());
    }
}
