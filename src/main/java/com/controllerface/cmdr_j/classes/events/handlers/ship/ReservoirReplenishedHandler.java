package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class ReservoirReplenishedHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // unused, the data here is not particularly useful
    }
}
