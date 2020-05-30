package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.JournalSyncTask;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Collections;

/**
 * Created by Stephen on 7/18/2018.
 */
public class MarketHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("StationName"));
        context.getTransactions().add(UserTransaction.start(UserTransaction.TransactionType.MARKET)
                .setMessage(name)
                .setStatusObject(JournalSyncTask.readMarketData())
                .build());
    }
}
