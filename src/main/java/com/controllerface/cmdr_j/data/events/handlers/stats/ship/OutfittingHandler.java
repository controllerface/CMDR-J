package com.controllerface.cmdr_j.data.events.handlers.stats.ship;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.structures.equipment.ships.CoreInternalSlot;
import com.controllerface.cmdr_j.structures.equipment.ships.Ship;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Outfitting event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class OutfittingHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String station = ((String) context.getRawData().get("StationName"));
        logLoadoutMessage(context, "Accessing outfitting at " + station + " [" + system + "]");
    }
}
