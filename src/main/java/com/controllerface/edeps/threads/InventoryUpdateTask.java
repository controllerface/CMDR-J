package com.controllerface.edeps.threads;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.PlayerInventory;
import javafx.util.Pair;

import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

/**
 * Task thread that keeps a PlayerInventory synchronized by executing transactions that modify it
 *
 * Created by Stephen on 4/4/2018.
 */
public class InventoryUpdateTask implements Runnable
{
    private final PlayerInventory inventory;
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;
    private final Consumer<Void> updateFunction;

    public InventoryUpdateTask(Consumer<Void> updateFunction,
                        PlayerInventory inventory,
                        BlockingQueue<Pair<ProcurementCost, Integer>> transactions)
    {
        this.updateFunction = updateFunction;
        this.inventory = inventory;
        this.transactions = transactions;
    }

    @Override
    public void run()
    {
        boolean go = true;
        while (go)
        {
            // always be nice and exit if already interrupted
            if (Thread.currentThread().isInterrupted())
            {
                go = false;
                continue;
            }

            // get the next inventory transaction
            Pair<ProcurementCost, Integer> nextTransaction;
            try
            {
                // this call blocks until a transaction is ready
                nextTransaction = transactions.take();
            }
            catch (InterruptedException e)
            {
                // interruption wh8le waiting for a transaction also triggers an exit
                go = false;
                continue;
            }

            inventory.adjustItem(nextTransaction.getKey(), nextTransaction.getValue());
            updateFunction.accept(null);
        }
    }
}
