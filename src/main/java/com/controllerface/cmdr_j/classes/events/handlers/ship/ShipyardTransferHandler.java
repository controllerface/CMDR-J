package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class ShipyardTransferHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String shipType = ((String) context.getRawData().get("ShipType"));
        String location = ((String) context.getRawData().get("System"));

        int price = ((int) context.getRawData().get("TransferPrice"));
        context.getCommanderData().adjustCreditBalance(-1 * price);

        logGeneralMessage(context, "Transferring ship " + shipType + " from " + location);
    }
}
