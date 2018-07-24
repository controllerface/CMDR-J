package com.controllerface.cmdr_j.data.events.handlers.stats.travel;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.data.events.JournalEventTransactions;

/**
 * Created by Stephen on 7/18/2018.
 */
public class USSDropHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String type = ((String) context.getRawData().get("USSType_Localised"));
        Integer threatLevel = ((Integer) context.getRawData().get("USSThreat"));
        JournalEventTransactions.logTravelMessage(context, "Unidentified Signal Source :: " +  type + " :: Threat Level " + threatLevel);
    }
}
