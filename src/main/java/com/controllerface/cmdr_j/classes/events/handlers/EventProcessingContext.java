package com.controllerface.cmdr_j.classes.events.handlers;

import com.controllerface.cmdr_j.classes.commander.Commander;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Controllerface on 4/23/2018.
 */
public class EventProcessingContext
{
    private final BlockingQueue<UserTransaction> transactions;
    private final Commander commander;
    private final Map<String, Object> rawData;

    public EventProcessingContext(Map<String, Object> rawData,
                                  BlockingQueue<UserTransaction> transactions,
                                  Commander commander)
    {
        this.rawData = rawData;
        this.transactions = transactions;
        this.commander = commander;
    }

    public Map<String, Object> getRawData()
    {
        return rawData;
    }

    public BlockingQueue<UserTransaction> getTransactions()
    {
        return transactions;
    }

    public Commander getCommander()
    {
        return commander;
    }
}
