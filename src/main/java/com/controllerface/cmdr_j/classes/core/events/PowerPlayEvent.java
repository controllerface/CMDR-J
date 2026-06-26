package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.PledgedPower;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class PowerPlayEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("Power"));
        var rank = ((Number) event.get("Rank")).intValue();
        var merits = ((Number) event.get("Merits")).intValue();
        var time = ((Number) event.get("TimePledged")).longValue();
        var votes = Optional.ofNullable(event.get("Votes"))
            .map(v -> (Number)v)
            .map(Number::intValue)
            .orElse(0);
        var pledgedPower = new PledgedPower(name, rank, merits, votes, time);
        gameState.setPledgedPower(pledgedPower);
    }
}
