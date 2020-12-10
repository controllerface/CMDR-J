package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class RefuelAllEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        int cost = ((int) event.get("Cost"));
        playerState.adjustCreditBalance(-1 * cost);
    }
}
