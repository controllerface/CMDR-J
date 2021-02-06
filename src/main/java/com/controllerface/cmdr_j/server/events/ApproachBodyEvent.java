package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.GenericBody;
import com.controllerface.cmdr_j.classes.StellarBody;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ApproachBodyEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var address = ((Number) event.get("SystemAddress")).longValue();
        var bodyID = ((Number) event.get("BodyID")).intValue();
        var bodyName = ((String) event.get("Body"));
        var body = new GenericBody(StellarBody.BodyType.Planet, bodyName, bodyID, address);
        playerState.approachBody(body);
    }
}
