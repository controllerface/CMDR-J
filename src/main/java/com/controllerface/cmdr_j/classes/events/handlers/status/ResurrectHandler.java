package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

public class ResurrectHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        Integer amount = ((Integer) context.getRawData().get("Cost"));
        context.getCommander().adjustCreditBalance(-1 * amount);
    }
}
