package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import javafx.util.Pair;

import java.util.concurrent.BlockingQueue;
import java.util.function.BiConsumer;

/**
 * Task thread that keeps a CommanderData synchronized by executing transactions that modify it.
 * As transactions are put into the transaction queue, this thread will execute them, in the order
 * in which they are queued. When there are no transactions, this thread will block until one is
 * queued, avoiding unnecessary CPU usage.
 *
 * Created by Controllerface on 4/4/2018.
 */
public class TransactionProcessingTask implements Runnable
{
    private final BiConsumer<ProcurementCost, Integer> inventoryAdjustment;
    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> blueprintAdjustment;
    private final BiConsumer<UserTransaction.MessageType, String> messageLogger;
    private final BlockingQueue<UserTransaction> transactions;

    public TransactionProcessingTask(BiConsumer<ProcurementCost, Integer> inventoryAdjustment,
                                     BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> blueprintAdjustment,
                                     BiConsumer<UserTransaction.MessageType, String> messageLogger,
                                     BlockingQueue<UserTransaction> transactionQueue)
    {
        this.inventoryAdjustment = inventoryAdjustment;
        this.blueprintAdjustment = blueprintAdjustment;
        this.messageLogger = messageLogger;
        this.transactions = transactionQueue;
    }

    @Override
    public void run()
    {
        Thread.currentThread().setName("Transaction Processor");
        boolean go = true;
        while (go)
        {
            // always be nice and exit if already interrupted
            if (Thread.currentThread().isInterrupted())
            {
                go = false;
                continue;
            }

            // get the next transaction
            UserTransaction nextTransaction;
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
            switch (nextTransaction.getTransactionType())
            {

                case INVENTORY:
                    inventoryAdjustment.accept(nextTransaction.getInventoryItem(), nextTransaction.getTransactionAmount());
                    break;

                case BLUEPRINT:
                    blueprintAdjustment.accept(nextTransaction.getTransactionAmount(), nextTransaction.getBlueprint());
                    break;

                case MESSAGE:
                    messageLogger.accept(nextTransaction.getMessageType(), nextTransaction.getMessage());
                    break;
            }
        }
    }
}
