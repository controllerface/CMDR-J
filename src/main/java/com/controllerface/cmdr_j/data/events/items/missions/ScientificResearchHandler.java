package com.controllerface.cmdr_j.data.events.items.missions;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.adjustMaterialCountDown;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logInventoryMessage;

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
