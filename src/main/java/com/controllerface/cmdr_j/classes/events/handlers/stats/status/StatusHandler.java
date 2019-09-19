package com.controllerface.cmdr_j.classes.events.handlers.stats.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.UserTransaction;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class StatusHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        context.getTransactions().add(UserTransaction.start(UserTransaction.TransactionType.STATUS)
                .setStatusObject(context.getRawData())
                .build());
    }
}
