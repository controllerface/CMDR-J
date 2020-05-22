package com.controllerface.cmdr_j.classes.events.handlers.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class DockedHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        Map<String, Object> eventData = context.getRawData();

        String name = ((String) context.getRawData().get("StationName"));
        String economy = ((String)  context.getRawData().get("StationEconomy_Localised"));

        String typeName = Optional.ofNullable(eventData.get("StationType"))
                .map(stationType -> ((String) stationType))
                .map(stationType -> name + " (" + stationType + ")")
                .orElse(name);

        String message = "Docked at " + typeName + " :: " + economy + " Economy";

        logTravelMessage(context, message);

        context.getTransactions().add(UserTransaction.start(UserTransaction.TransactionType.MARKET)
                .setMessage(name)
                .setStatusObject(Collections.emptyMap())
                .build());

        context.getCommanderData().setStation(name);
        context.getCommanderData().setEconomy(economy);
    }
}
