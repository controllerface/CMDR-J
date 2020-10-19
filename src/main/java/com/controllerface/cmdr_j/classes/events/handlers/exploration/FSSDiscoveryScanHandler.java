package com.controllerface.cmdr_j.classes.events.handlers.exploration;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FSSDiscoveryScanHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("SystemName"));
        Double progress = ((Double) context.getRawData().get("Progress"));
        Integer bodies = ((Integer) context.getRawData().get("BodyCount"));
        Integer signals = ((Integer) context.getRawData().get("NonBodyCount"));

        String progressMessage = " - System Scan progress: " + (progress * 100) + "%";
        String bodiesMessage = " - Stellar bodies: " + bodies;
        String signalsMessage = " - Signal sources: " + signals;

        JournalEventTransactions.logExplorationMessage(context, "Orbital plane established: " + name);
        JournalEventTransactions.logExplorationMessage(context, progressMessage);
        JournalEventTransactions.logExplorationMessage(context, bodiesMessage);
        JournalEventTransactions.logExplorationMessage(context, signalsMessage);
    }
}
