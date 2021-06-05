package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class MissionFailedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        System.out.println(event);
        Optional.ofNullable(((Number) event.get("Fine")))
            .map(Number::longValue)
            .ifPresent(fine -> gameState.adjustCreditBalance(-1 * fine));
        var missionID = ((Number) event.get("MissionID")).longValue();
        gameState.completeMission(missionID);
    }
}
