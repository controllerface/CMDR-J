package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class EngineerContributionEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var type = ((String) event.get("Type"));
        if (type.equalsIgnoreCase("Credits"))
        {
            var quantity = ((Number) event.get("Quantity")).intValue();
            playerState.adjustCreditBalance(-1 * quantity);
        }

        // todo: handle material and cargo contributions
    }
}
