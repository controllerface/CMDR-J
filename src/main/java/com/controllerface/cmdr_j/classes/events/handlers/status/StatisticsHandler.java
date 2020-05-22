package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class StatisticsHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // todo: do something with the commander stats, maybe a new panel that just shows it. Since it
        //  already exists in game not a high priority but should be easy enough to wire up
    }
}
