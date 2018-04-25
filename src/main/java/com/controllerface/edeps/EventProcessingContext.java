package com.controllerface.edeps;

import com.controllerface.edeps.data.commander.CommanderData;
import javafx.util.Pair;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Stephen on 4/23/2018.
 */
public class EventProcessingContext
{
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;
    private final CommanderData commanderData;
    private final Map<String, Object> rawData;
    private final Procedure updateFunction;


    public EventProcessingContext(Map<String, Object> rawData,
                                  BlockingQueue<Pair<ProcurementCost, Integer>> transactions,
                                  CommanderData commanderData,
                                  Procedure updateFunction)
    {
        this.rawData = rawData;
        this.transactions = transactions;
        this.commanderData = commanderData;
        this.updateFunction = updateFunction;
    }

    public Map<String, Object> getRawData()
    {
        return rawData;
    }

    public BlockingQueue<Pair<ProcurementCost, Integer>> getTransactions()
    {
        return transactions;
    }

    public CommanderData getCommanderData()
    {
        return commanderData;
    }

    public Procedure getUpdateFunction()
    {
        return updateFunction;
    }
}
