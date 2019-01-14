package com.controllerface.cmdr_j.data.events.handlers.items.engineers;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Written when unlocking an item from a tech broker
 *
 * Created by Stephen on 7/18/2018.
 */
public class TechnologyBrokerHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logLoadoutMessage(context, "Tech Broker Item Unlocked");
        processTechUnlock(context);
    }
}
