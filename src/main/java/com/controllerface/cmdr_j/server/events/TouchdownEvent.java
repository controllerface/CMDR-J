package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class TouchdownEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var playerControlled = Optional.ofNullable(event.get("PlayerControlled"))
            .map(o-> ((Boolean) o))
            .orElse(false);

        if (playerControlled)
        {
            var latitude = ((Number) event.get("Latitude")).doubleValue();
            var longitude = ((Number) event.get("Longitude")).doubleValue();
            playerState.touchDown(latitude, longitude);
        }
    }
}
