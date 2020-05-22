package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Created by Stephen on 7/18/2018.
 */
public class USSDropHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String type = ((String) context.getRawData().get("USSType_Localised"));
        Integer threatLevel = ((Integer) context.getRawData().get("USSThreat"));
        JournalEventTransactions.logTravelMessage(context, "Unidentified Signal Source :: " +  type + " :: Threat Level " + threatLevel);
    }
}
