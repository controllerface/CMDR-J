package com.controllerface.cmdr_j.data.events.handlers.stats.status;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.UserTransaction;
import com.controllerface.cmdr_j.ui.UIFunctions;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logExplorationMessage;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class StatusHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        context.getTransactions().add(new UserTransaction(context.getRawData()));
    }
}
