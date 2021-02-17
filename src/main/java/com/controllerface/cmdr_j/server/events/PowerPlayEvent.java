package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.classes.PledgedPower;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class PowerPlayEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("Power"));
        var rank = ((Number) event.get("Rank")).intValue();
        var merits = ((Number) event.get("Merits")).intValue();
        var votes = ((Number) event.get("Votes")).intValue();
        var time = ((Number) event.get("TimePledged")).longValue();
        var pledgedPower = new PledgedPower(name, rank, merits, votes, time);
        gameState.setPledgedPower(pledgedPower);
    }
}
