package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class EngineerContributionEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var type = ((String) event.get("Type"));
        if (type.equalsIgnoreCase("Credits"))
        {
            var quantity = ((Number) event.get("Quantity")).intValue();
            gameState.adjustCreditBalance(-1 * quantity);
        }

        // todo: handle material and cargo contributions
    }
}
