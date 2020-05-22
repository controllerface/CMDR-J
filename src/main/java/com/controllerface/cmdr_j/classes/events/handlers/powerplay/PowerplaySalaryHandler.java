package com.controllerface.cmdr_j.classes.events.handlers.powerplay;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Rank event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplaySalaryHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        int amount = ((int) context.getRawData().get("Amount"));
        context.getCommanderData().adjustCreditBalance(amount);
        logGeneralMessage(context, "Salary from " + context.getRawData().get("Power")
                + ": " + amount + " Credits");
    }
}
