package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityCount;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;


/**
 * Main cargo event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class CargoHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        var cargoData = context.getRawData().get("Inventory") == null
                ? JournalSyncTask.readCargoData()
                : context.getRawData();

        logInventoryMessage(context, "Reloading Cargo");

        context.getCommander().clearCargo();
        ((List<Map<String, Object>>) cargoData.get("Inventory"))
                .forEach(item -> adjustCommodityCount(context, item));
    }
}
