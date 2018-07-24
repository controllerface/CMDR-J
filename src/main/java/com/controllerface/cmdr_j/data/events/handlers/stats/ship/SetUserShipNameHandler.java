package com.controllerface.cmdr_j.data.events.handlers.stats.ship;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logLoadoutMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class SetUserShipNameHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logLoadoutMessage(context, "Reloading Ship Name");
        String shipName = ((String) context.getRawData().get("UserShipName"));
        String shipID = ((String) context.getRawData().get("UserShipId"));
        context.getCommanderData().getStarShip().setGivenName(shipName);
        context.getCommanderData().getStarShip().setShipID(shipID);
    }
}
