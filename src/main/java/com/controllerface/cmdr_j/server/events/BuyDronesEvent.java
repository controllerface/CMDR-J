package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class BuyDronesEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        // todo: adjust cargo count
        //var count = ((Number) event.get("Count")).intValue();

        var cost = ((Number) event.get("TotalCost")).intValue();
        playerState.adjustCreditBalance(-1 * cost);
    }
}
