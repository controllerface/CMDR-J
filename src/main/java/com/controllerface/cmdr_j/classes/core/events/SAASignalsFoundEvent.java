package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.GenericBody;
import com.controllerface.cmdr_j.classes.data.ScannedBody;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class SAASignalsFoundEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var systemAddress = ((Number) event.get("SystemAddress")).longValue();
        var bodyID = ((Number) event.get("BodyID")).intValue();
        var bodyName = ((String) event.get("BodyName"));
        var bodyType = JournalEvent.determineBodyType(event);
        var body = new ScannedBody(bodyType, bodyName, bodyID, systemAddress, event);
        gameState.discoverStellarBody(body);
    }
}
