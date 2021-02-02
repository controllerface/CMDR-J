package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SellExplorationDataEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var earnings = ((Number) event.get("TotalEarnings")).intValue();
        playerState.adjustCreditBalance(earnings);
    }
}
