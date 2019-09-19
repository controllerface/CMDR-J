package com.controllerface.cmdr_j.classes.events.handlers.stats.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class ResurrectHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        Integer amount = ((Integer) context.getRawData().get("Cost"));
        context.getCommanderData().adjustCreditBalance(-1 * amount);
    }
}
