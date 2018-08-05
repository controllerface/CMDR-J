package com.controllerface.cmdr_j.data.events.handlers.items.engineers;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logEngineeringMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.processEngineerUpgrade;

/**
 * Written when a engineering mod or experimental effect is crafted
 *
 * Created by Stephen on 7/18/2018.
 */
public class EngineerCraftHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logEngineeringMessage(context, "Engineering Enhancement Costs :");
        processEngineerUpgrade(context);
    }
}