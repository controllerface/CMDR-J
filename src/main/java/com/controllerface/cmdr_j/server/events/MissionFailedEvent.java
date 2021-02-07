package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MissionFailedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var fine = ((Number) event.get("Fine")).longValue();
        var missionID = ((Number) event.get("MissionID")).longValue();

        gameState.adjustCreditBalance(-1 * fine);
        gameState.completeMission(missionID);
    }
}
