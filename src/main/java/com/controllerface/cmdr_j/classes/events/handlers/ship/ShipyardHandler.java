package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Written when a currently equipped module is sold, removing it from the current ship
 *
 * Created by Stephen on 7/18/2018.
 */
public class ShipyardHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        // todo: new panel needed to display ship info. Will also need to read the shipyard file for this
    }
}
