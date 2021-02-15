package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CarrierShipPackEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        Optional.ofNullable(event.get("Cost"))
            .map(c -> ((Number) c).longValue())
            .ifPresent(cost->gameState.adjustCreditBalance(-1 * cost));

        Optional.ofNullable(event.get("Refund"))
            .map(r -> ((Number) r).longValue())
            .ifPresent(gameState::adjustCreditBalance);
    }
}
