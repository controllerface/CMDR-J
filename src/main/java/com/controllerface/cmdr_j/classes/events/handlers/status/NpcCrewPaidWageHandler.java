package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class NpcCrewPaidWageHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String npcCrewName = ((String) context.getRawData().get("NpcCrewName"));
        Integer amount = ((Integer) context.getRawData().get("Amount"));
        if (amount > 0) logGeneralMessage(context, "Paid " + npcCrewName + " " + amount + " Cr");
        context.getCommander().adjustCreditBalance(-1 * amount);
    }
}
