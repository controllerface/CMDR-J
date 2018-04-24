package com.controllerface.edeps;

import com.controllerface.edeps.data.storage.PlayerInventory;
import javafx.util.Pair;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Stephen on 4/23/2018.
 */
public class EventProcessingContext
{
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;
    private final PlayerInventory playerInventory;
    private final Map<String, Object> rawData;
    private final Procedure updateFunction;


    public EventProcessingContext(Map<String, Object> rawData,
                                  BlockingQueue<Pair<ProcurementCost, Integer>> transactions,
                                  PlayerInventory playerInventory,
                                  Procedure updateFunction)
    {
        this.rawData = rawData;
        this.transactions = transactions;
        this.playerInventory = playerInventory;
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

    public PlayerInventory getPlayerInventory()
    {
        return playerInventory;
    }

    public Procedure getUpdateFunction()
    {
        return updateFunction;
    }
}
