package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MarketSellEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        // todo: actually adjust cargo counts

        var sale = ((Number) event.get("TotalSale")).intValue();
        playerState.adjustCreditBalance(sale);
    }
}
