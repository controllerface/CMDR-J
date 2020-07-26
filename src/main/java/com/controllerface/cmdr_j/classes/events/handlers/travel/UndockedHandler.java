package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Collections;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class UndockedHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("StationName"));
        logTravelMessage(context, "Leaving " + name);

        context.getTransactions().add(UserTransaction.type(UserTransaction.TransactionType.MARKET)
                .setMessage(name)
                .setStatusObject(Collections.emptyMap())
                .build());

        context.getCommander().setStation("Undocked");
        context.getCommander().setEconomy("(No Market Data)");
    }
}
