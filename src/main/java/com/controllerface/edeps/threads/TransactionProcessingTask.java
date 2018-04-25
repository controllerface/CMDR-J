package com.controllerface.edeps.threads;

import com.controllerface.edeps.Procedure;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.commander.CommanderData;
import javafx.util.Pair;

import java.util.concurrent.BlockingQueue;

/**
 * Task thread that keeps a CommanderData synchronized by executing transactions that modify it.
 * As transactions are put into the transaction queue, this thread will execute them, in the order
 * in which they are queued. When there are no transactions, this thread will block until one is
 * queued, avoiding unnecessary CPU usage.
 *
 * Created by Stephen on 4/4/2018.
 */
public class TransactionProcessingTask implements Runnable
{
    private final Procedure updateFunction;
    private final CommanderData inventory;
    private final BlockingQueue<Pair<ProcurementCost, Integer>> transactions;

    public TransactionProcessingTask(Procedure updateFunction,
                                     CommanderData inventory,
                                     BlockingQueue<Pair<ProcurementCost, Integer>> transactionQueue)
    {
        this.updateFunction = updateFunction;
        this.inventory = inventory;
        this.transactions = transactionQueue;
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
                // interruption while waiting for a transaction also triggers an exit
                go = false;
                continue;
            }

            // perform the transaction
            inventory.adjustItem(nextTransaction.getKey(), nextTransaction.getValue());

            // call the update procedure to signal that the inventory has changed
            updateFunction.call();
        }
    }
}
