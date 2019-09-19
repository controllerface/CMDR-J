package com.controllerface.cmdr_j.classes.events.handlers.items.engineers;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logLoadoutMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processTechUnlock;

/**
 * Written when unlocking an item from a tech broker
 *
 * Created by Stephen on 7/18/2018.
 */
public class TechnologyBrokerHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logLoadoutMessage(context, "Tech Broker Item Unlocked");
        processTechUnlock(context);
    }
}
