package com.controllerface.cmdr_j.data.events.handlers;

import com.controllerface.cmdr_j.EventProcessingContext;

/**
 * Created by Stephen on 7/18/2018.
 */
public interface JournalEventHandler
{
    void handle(EventProcessingContext context);
}
