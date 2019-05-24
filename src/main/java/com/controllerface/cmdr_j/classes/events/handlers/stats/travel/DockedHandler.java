package com.controllerface.cmdr_j.classes.events.handlers.stats.travel;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        String name = ((String) context.getRawData().get("StationName"));
        List<Map<String, Object>> economies = ((List<Map<String,Object>>) context.getRawData().get("StationEconomies"));
        String economy = economies.stream()
                .map(economyType -> ((String) economyType.get("Name_Localised")))
                .collect(Collectors.joining(", "));

        logTravelMessage(context, "Docked at " + name + " :: " + economy + " Economy");

        context.getCommanderData().setStation(name);
        context.getCommanderData().setEconomy(economy);
    }
}
