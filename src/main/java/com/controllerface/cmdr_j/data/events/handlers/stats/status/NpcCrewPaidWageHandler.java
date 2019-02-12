package com.controllerface.cmdr_j.data.events.handlers.stats.status;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logGeneralMessage;

public class NpcCrewPaidWageHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String npcCrewName = ((String) context.getRawData().get("NpcCrewName"));
        Integer amount = ((Integer) context.getRawData().get("Amount"));
        if (amount > 0) logGeneralMessage(context, "Paid " + npcCrewName + " " + amount + " Cr");
    }
}
