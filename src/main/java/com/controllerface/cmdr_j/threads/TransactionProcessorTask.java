package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.classes.tasks.TaskType;
import javafx.util.Pair;

import java.util.concurrent.BlockingQueue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TransactionProcessorTask implements Runnable
{
    private final BlockingQueue<UserTransaction> transactionQueue;
    private final BiConsumer<UserTransaction.MessageType, String> messageLogger;
    private final BiConsumer<TaskCost, Integer> adjustItem;
    private final BiFunction<Integer, Pair<TaskType, TaskRecipe>, Integer> taskListUpdate;

    public TransactionProcessorTask(BlockingQueue<UserTransaction> transactionQueue,
                                    BiConsumer<UserTransaction.MessageType, String> messageLogger, BiConsumer<TaskCost, Integer> adjustItem,
                                    BiFunction<Integer, Pair<TaskType, TaskRecipe>, Integer> taskListUpdate)
    {
        this.transactionQueue = transactionQueue;
        this.messageLogger = messageLogger;
        this.adjustItem = adjustItem;
        this.taskListUpdate = taskListUpdate;
    }

    @Override
    public void run(){ /* TODO: finish this, needs an object to hold functions to be less messy */ }
//    {
//
//        Thread.currentThread().setName("Transaction Processor");
//        boolean go = true;
//        while (go)
//        {
//            // always be nice and exit if already interrupted
//            if (Thread.currentThread().isInterrupted())
//            {
//                go = false;
//                continue;
//            }
//
//            // get the next transaction
//            UserTransaction nextTransaction;
//            try
//            {
//                // this call blocks until a transaction is ready
//                nextTransaction = transactionQueue.take();
//            }
//            catch (InterruptedException e)
//            {
//                // interruption while waiting for a transaction also triggers an exit
//                go = false;
//                continue;
//            }
//
//            // perform the transaction
//            switch (nextTransaction.getTransactionType())
//            {
//
//                case INVENTORY:
//                    adjustItem.accept(nextTransaction.getInventoryItem(), nextTransaction.getTransactionAmount());
//                    break;
//
//                case BLUEPRINT:
//                   taskListUpdate.apply(nextTransaction.getTransactionAmount(), nextTransaction.getBlueprint());
//                    break;
//
//                case MESSAGE:
//                    messageLogger.accept(nextTransaction.getMessageType(), nextTransaction.getMessage());
//                    break;
//
//                case ARRIVAL:
//                    if (Platform.isFxApplicationThread()) status_body.setText(nextTransaction.getMessage());
//                    else Platform.runLater(() -> status_body.setText(nextTransaction.getMessage()));
//                    break;
//
//                case MARKET:
//                    if (Platform.isFxApplicationThread()) { updateMarketTable(nextTransaction); }
//                    else { Platform.runLater(() -> updateMarketTable(nextTransaction)); }
//                    break;
//
//                case STATUS:
//                    Platform.runLater(()->
//                    {
//                        Map<String, Object> statusObject = nextTransaction.getStatusObject();
//
//                        Integer flags  = ((Integer) statusObject.get("Flags"));
//
//                        System.out.println(flags);
//                        UIController.Status.extractFlags(flags).forEach(System.out::println);
//
//                        status_fuel.setText(statusObject.get("Fuel") + " Tons");
//                        status_cargo.setText(statusObject.get("Cargo") + " Tons");
//
//                        Object Altitude  = statusObject.get("Altitude");
//                        Object Latitude  = statusObject.get("Latitude");
//                        Object Longitude  = statusObject.get("Longitude");
//                        Object Heading  = statusObject.get("Heading");
//
//                        status_altitude.setText("0.0");
//                        status_latitude.setText("0.0");
//                        status_longitude.setText("0.0");
//                        status_heading.setText("0.0");
//
//                        if (Altitude != null) status_altitude.setText(Altitude.toString());
//                        if (Latitude != null) status_latitude.setText(Latitude.toString());
//                        if (Longitude != null) status_longitude.setText(Longitude.toString());
//                        if (Heading != null) status_heading.setText(Heading.toString());
//
//                        if (Altitude == null || Latitude == null || Longitude == null || Heading == null) return;
//
//                        double lat = Double.valueOf(Latitude.toString());
//                        double lon = Double.valueOf(Longitude.toString());
//
//                        status_bearing.setText(String.valueOf(UIFunctions.Data
//                                .calculateBearingAngle(lat, lon, markedLat, markedLong)));
//
//                        status_marked_lat.setText(String.valueOf(markedLat));
//                        status_marked_long.setText(String.valueOf(markedLong));
//
//                        renderMiniMap();
//                    });
//                    break;
//            }
//            empty = transactionQueue.isEmpty();
//        }
//    }
}
