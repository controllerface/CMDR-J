package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class CarrierBuyHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String shipType = ((String) context.getRawData().get("Variant"));
        String callSign = ((String) context.getRawData().get("Callsign"));

        int price = ((int) context.getRawData().get("Price"));
        context.getCommanderData().adjustCreditBalance(-1 * price);

        logGeneralMessage(context, "Purchased Fleet Carrier variant: " + shipType
                + " call sign: " + callSign + " for " + price + " Credits");
    }
}
