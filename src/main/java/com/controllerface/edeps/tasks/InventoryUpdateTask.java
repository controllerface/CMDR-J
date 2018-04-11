package com.controllerface.edeps.tasks;

import com.controllerface.edeps.data.MaterialInventory;
import com.controllerface.edeps.enums.materials.Material;
import javafx.util.Pair;

import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

/**
 * Task thread that keeps a MaterialInventory synchronized by executing transactions that modify it
 *
 * Created by Stephen on 4/4/2018.
 */
public class InventoryUpdateTask implements Runnable
{
    private final MaterialInventory inventory;
    private final BlockingQueue<Pair<Material, Integer>> transactions;
    private final Consumer<Void> updateFunction;

    public InventoryUpdateTask(Consumer<Void> updateFunction,
                        MaterialInventory inventory,
                        BlockingQueue<Pair<Material, Integer>> transactions)
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
            Pair<Material, Integer> nextTransaction;
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

            inventory.adjustMat(nextTransaction.getKey(), nextTransaction.getValue());
            updateFunction.accept(null);
        }
    }
}
