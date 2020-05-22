package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import javafx.util.Pair;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

/**
 * Written when a cargo delivery wing mission status updates
 *
 * Created by Stephen on 7/18/2018.
 */
public class CargoDepotHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String updateType = ((String) context.getRawData().get("UpdateType"));
        Pair<String, Integer> pair = extractPair(context.getRawData(), "CargoType", "Count");

        switch (updateType)
        {
            case "Deliver":
                logInventoryMessage(context, "Cargo Delivered");
                adjustDown(context, pair, AdjustmentType.COMMODITY);
                break;

            case "Collect":
                logInventoryMessage(context, "Cargo Collected");
                adjust(context, pair, AdjustmentType.COMMODITY);
                break;
        }
    }
}
