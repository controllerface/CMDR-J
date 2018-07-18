package com.controllerface.cmdr_j.structures.journal.events;

import com.controllerface.cmdr_j.EventProcessingContext;

/**
 * Created by Stephen on 7/18/2018.
 */
public abstract class JournalEventHandler
{
    public abstract void handle(EventProcessingContext context);
}
