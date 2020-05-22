package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustDown;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when launching a limpet drone
 *
 * Created by Stephen on 7/18/2018.
 */
public class LaunchDroneHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Limpet Drone Launched");
        adjustDown(context, Commodity.DRONES, 1);
    }
}
