package com.controllerface.cmdr_j.classes.events.handlers.exploration;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FSSSignalDiscoveredHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // todo: handle this info, maybe add to nav panel?

        String name;
        if (context.getRawData().get("SignalName_Localised") == null)
        {
            name = ((String) context.getRawData().get("SignalName"));
        }
        else
        {
            name = ((String) context.getRawData().get("SignalName_Localised"));
        }
        JournalEventTransactions.logExplorationMessage(context, "Signal Discovered: " + name);
    }
}
