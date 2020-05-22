package com.controllerface.cmdr_j.classes.events.handlers.commodities;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import javafx.util.Pair;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjust;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Written when a commodity has been refined through collection of mining fragments
 *
 * Created by Stephen on 7/18/2018.
 */
public class MiningRefinedHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Asteroid Fragments Refined");
        String name = ((String) context.getRawData().get("Type")).replace("$","").replace("_name;","").toUpperCase();
        adjust(context, new Pair<>(name, 1), JournalEventTransactions.AdjustmentType.COMMODITY);
    }
}
