package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SellDronesEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        // todo: adjust cargo count
        //var count = ((Number) event.get("Count")).intValue();

        var sale = ((Number) event.get("TotalSale")).intValue();
        playerState.adjustCreditBalance(sale);
    }
}
