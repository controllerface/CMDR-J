package com.controllerface.cmdr_j.classes.events.handlers.materials;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustMaterialCountDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when materials are discarded
 *
 * Created by Stephen on 7/18/2018.
 */
public class MaterialDiscardedHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Material Discarded");
        adjustMaterialCountDown(context, context.getRawData());
    }
}
