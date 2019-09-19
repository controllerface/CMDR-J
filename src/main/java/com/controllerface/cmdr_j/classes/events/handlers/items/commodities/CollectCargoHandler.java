package com.controllerface.cmdr_j.classes.events.handlers.items.commodities;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import javafx.util.Pair;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjust;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when collecting commodity items
 *
 * Created by Stephen on 7/18/2018.
 */
public class CollectCargoHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Cargo Collected");
        String name = ((String) context.getRawData().get("Type")).toUpperCase();
        adjust(context, new Pair<>(name, 1), JournalEventTransactions.AdjustmentType.COMMODITY);
    }
}
