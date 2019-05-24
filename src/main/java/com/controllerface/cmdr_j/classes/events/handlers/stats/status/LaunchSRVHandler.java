package com.controllerface.cmdr_j.classes.events.handlers.stats.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.UserTransaction;

public class LaunchSRVHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        context.getTransactions().add(UserTransaction.start(UserTransaction.TransactionType.VEHICLE)
                .setInSRV(true)
                .build());
    }
}
