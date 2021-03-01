package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class TouchdownEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var playerControlled = Optional.ofNullable(event.get("PlayerControlled"))
            .map(o-> ((Boolean) o))
            .orElse(false);

        if (playerControlled)
        {
            var latitude = ((Number) event.get("Latitude")).doubleValue();
            var longitude = ((Number) event.get("Longitude")).doubleValue();
            gameState.touchDown(latitude, longitude);
        }
    }
}
