package com.controllerface.cmdr_j.data.events.stats.status;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import com.controllerface.cmdr_j.data.events.JournalEventTransactions;

/**
 * Created by Stephen on 7/18/2018.
 */
public class UnderAttackHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String target = ((String) context.getRawData().get("Target"));
        String verb = target.equalsIgnoreCase("You") ? " are " : " is ";
        JournalEventTransactions.logCombatMessage(context, target + verb + "under attack");
    }
}
