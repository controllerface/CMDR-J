package com.controllerface.cmdr_j.classes.events.handlers.stats.startup;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

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
        if (context.getRawData().get("Inventory") == null) return;

        logInventoryMessage(context, "Reloading Cargo");

        String vessel = ((String) context.getRawData().get("Vessel"));

        //if (vessel.equalsIgnoreCase("Ship"))
        //{
            context.getCommanderData().clearCargo();

            ((List<Map<String, Object>>) context.getRawData().get("Inventory"))
                    .forEach(item -> adjustCommodityCount(context, item));
        //}
    }
}
