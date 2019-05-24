package com.controllerface.cmdr_j.classes.events.handlers.stats.status;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

/**
 * Created by Stephen on 7/18/2018.
 */
public class UnderAttackHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String target = ((String) context.getRawData().get("Target"));
        String verb = target.equalsIgnoreCase("You") ? " are " : " is ";
        JournalEventTransactions.logCombatMessage(context, target + verb + "under attack");
    }
}
