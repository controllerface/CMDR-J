package com.controllerface.cmdr_j.classes.events.handlers.items.missions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustMaterialCountDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when contributing materials to a community goal
 *
 * Created by Stephen on 7/18/2018.
 */
public class ScientificResearchHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Scientific Research Contribution Completed");
        adjustMaterialCountDown(context, context.getRawData());
    }
}
