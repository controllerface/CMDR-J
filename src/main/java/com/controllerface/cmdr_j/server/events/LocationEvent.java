package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logTravelMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.processArrival;

public class LocationEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        String name = ((String) event.get("StarSystem"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        List<Double> coordinates = ((List<Double>) event.get("StarPos"));
        StarSystem system = new StarSystem(name, coordinates.get(0), coordinates.get(2), coordinates.get(1), address);
        playerState.setLocation(system);
        playerState.emitEngineerData();
    }
}
