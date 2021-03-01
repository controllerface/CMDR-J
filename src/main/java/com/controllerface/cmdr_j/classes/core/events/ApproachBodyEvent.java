package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.GenericBody;
import com.controllerface.cmdr_j.classes.data.StellarBody;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ApproachBodyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var address = ((Number) event.get("SystemAddress")).longValue();
        var bodyID = ((Number) event.get("BodyID")).intValue();
        var bodyName = ((String) event.get("Body"));
        var body = new GenericBody(StellarBody.BodyType.Planet, bodyName, bodyID, address);
        gameState.approachBody(body);
    }
}
