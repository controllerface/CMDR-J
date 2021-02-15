package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class FactionKillBondEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // credits are not actually awarded until you turn in the bond
        var reward = ((Number) event.get("Reward")).intValue();
//        gameState.adjustCreditBalance(reward);
    }
}
