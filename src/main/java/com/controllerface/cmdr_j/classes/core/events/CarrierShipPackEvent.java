package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CarrierShipPackEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        Optional.ofNullable(event.get("Cost"))
            .map(cost -> ((Number) cost).longValue())
            .ifPresent(cost -> gameState.adjustCreditBalance(-1 * cost));

        Optional.ofNullable(event.get("Refund"))
            .map(refund -> ((Number) refund).longValue())
            .ifPresent(gameState::adjustCreditBalance);
    }
}
