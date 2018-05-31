package com.controllerface.edeps;

import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.threads.UserTransaction;
import javafx.util.Pair;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Controllerface on 4/23/2018.
 */
public class EventProcessingContext
{
    private final BlockingQueue<UserTransaction> transactions;
    private final CommanderData commanderData;
    private final Map<String, Object> rawData;

    public EventProcessingContext(Map<String, Object> rawData,
                                  BlockingQueue<UserTransaction> transactions,
                                  CommanderData commanderData)
    {
        this.rawData = rawData;
        this.transactions = transactions;
        this.commanderData = commanderData;
    }

    public Map<String, Object> getRawData()
    {
        return rawData;
    }

    public BlockingQueue<UserTransaction> getTransactions()
    {
        return transactions;
    }

    public CommanderData getCommanderData()
    {
        return commanderData;
    }
}
