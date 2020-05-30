package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class MusicHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // this is kind of chatty and not really useful, so disabling it for now
//        JournalEventTransactions.logGeneralMessage(context, "Music Changed: "
//                + context.getRawData().get("MusicTrack"));
    }
}
