package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class NpcCrewPaidWageEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var amount = ((Number) event.get("Amount")).intValue();
        gameState.adjustCreditBalance(-1 * amount);
    }
}
