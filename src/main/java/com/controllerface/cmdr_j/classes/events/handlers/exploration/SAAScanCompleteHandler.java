package com.controllerface.cmdr_j.classes.events.handlers.exploration;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

public class SAAScanCompleteHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("BodyName"));
        Integer probesUsed = ((Integer) context.getRawData().get("ProbesUsed"));
        Integer probeTarget = ((Integer) context.getRawData().get("EfficiencyTarget"));

        String efficiencyStats = " - efficiency target "
                + (probesUsed <= probeTarget ? "met" : "missed" )
                + " (Probes used: " + probesUsed + " :: target: " + probeTarget + ")";

        JournalEventTransactions.logExplorationMessage(context, "Completed Surface Scan of " + name);
        JournalEventTransactions.logExplorationMessage(context, efficiencyStats);
    }
}
